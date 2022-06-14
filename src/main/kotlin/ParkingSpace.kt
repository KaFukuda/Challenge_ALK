import java.util.*
import kotlin.NoSuchElementException
import kotlin.math.ceil

data class ParkingSpace(var parking: Parking) {

    fun checkOutVehicle(plate: String) {
        try {
            val vehicle = parking.vehicles.first { v ->
                v.plate == plate
            }

            val fee = calculateFee(vehicle.vehicleType, vehicle.parkedTime, vehicle.discountCard != null)

            parking.total = Pair(parking.total.first.plus(1), parking.total.second.plus(fee))

            onSuccess(fee)

            parking.vehicles.remove(vehicle)
        } catch (e: Exception) {
            onError("Sorry, the check-out failed")
            /*if (e is NoSuchElementException) {
                //nenhum veiculo encontrado
            }*/
        }
    }

    private fun calculateFee(type: VehicleType, parkedTime: Long, hasDiscountCard: Boolean): Int {
        var cobranca =
            when {
                parkedTime <= 120 -> {
                    type.fee
                }
                else -> {
                    val diferenca = parkedTime - 120
                    type.fee + (ceil(diferenca.toDouble() / 15) * 5)
                }
            }

        return (if (hasDiscountCard) cobranca.toDouble() - (cobranca.toDouble() * 0.15) else cobranca).toInt()
    }

    private fun onSuccess(fee: Int) {
        println("Your fee is $$fee. Come back soon.")
    }

    private fun onError(message: String) {
        println(message)
    }
}
