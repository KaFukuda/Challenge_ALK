import kotlin.math.ceil

const val HOURS_FIXED: Int = 120

data class ParkingSpace(
    var parking: Parking) {

    fun checkOutVehicle(plate: String) {
        try 
        {
            val vehicle = parking.vehicles.first { validate -> validate.plate == plate }

            val fee = calculateFee(vehicle.vehicleType, vehicle.parkedTime, vehicle.discountCard != null)

            parking.reportData = Pair(parking.totalVehicles.plus(1), parking.totalCash.plus(fee))
            onSuccess(fee)

            parking.vehicles.remove(vehicle) 
        } 
        catch (e: Exception) {
            onError("Sorry, the check-out failed")
        }
    }

    private fun calculateFee(
        type: VehicleType,
        parkedTime: Long,
        hasDiscountCard: Boolean): Int
    {
        val charges =
            when {
                parkedTime <= HOURS_FIXED -> type.fee
                else -> {
                    val diff = parkedTime - HOURS_FIXED
                    type.fee + (ceil(diff.toDouble() / 15) * 5)
                }
            }
        return (if (hasDiscountCard) charges.toDouble() - (charges.toDouble() * 0.15) else charges).toInt()
    }

    private fun onSuccess(fee: Int) {
        println("Your fee is $$fee. Come back soon.")
    }

    private fun onError(message: String) {
        println(message)
    }
}
