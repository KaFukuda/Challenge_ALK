import java.util.*

const val MINUTES_IN_MILLISECONDS: Int = 60000

data class Vehicle(
    val plate: String,
    val vehicleType: VehicleType,
    val discountCard: String?,
    val checkInTime: Calendar
    ){
    override fun equals(other: Any?): Boolean {
        if (other is Vehicle) {
            return this.plate == other.plate
        }
        return super.equals(other)
    }
    override fun hashCode(): Int  = this.plate.hashCode()

    val parkedTime: Long
    get() = (Calendar.getInstance().timeInMillis - checkInTime.timeInMillis) / MINUTES_IN_MILLISECONDS
}
