import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val sdf = SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.ENGLISH)
    sdf.parse("2022/06/14 13:00")
    val cal = sdf.calendar

    val parking = Parking(20, vehicles = mutableSetOf())

    val parkingSpace = ParkingSpace(parking)

    listOf(
        Vehicle("aaa1234", VehicleType.CAR, null, "DISCOUNT_CARD_001", Calendar.getInstance()),
        Vehicle("bbb1234", VehicleType.MOTORCYCLE, "DISCOUNT_CARD_002", Calendar.getInstance()),
        Vehicle("ccc1234", VehicleType.MINIBUS, null, Calendar.getInstance()),
        Vehicle("ddd1234", VehicleType.BUS, null, Calendar.getInstance()),
        Vehicle("eee1234", VehicleType.CAR, "DISCOUNT_CARD_003", Calendar.getInstance()),
        Vehicle("fff1234", VehicleType.MOTORCYCLE, "DISCOUNT_CARD_004", Calendar.getInstance()),
        Vehicle("ggg1234", VehicleType.BUS, null, Calendar.getInstance()),
        Vehicle("hhh1234", VehicleType.MOTORCYCLE, "DISCOUNT_CARD_005", Calendar.getInstance()),
        Vehicle("iii1234", VehicleType.CAR, null, Calendar.getInstance()),
        Vehicle("jjj1234", VehicleType.MOTORCYCLE, "DISCOUNT_CARD_006", Calendar.getInstance()),
        Vehicle("kkk1234", VehicleType.MINIBUS, null, Calendar.getInstance()),
        Vehicle("lll1234", VehicleType.CAR, null, Calendar.getInstance()),
        Vehicle("mmm1234", VehicleType.MOTORCYCLE, "DISCOUNT_CARD_007", Calendar.getInstance()),
        Vehicle("nnn1234", VehicleType.MINIBUS, "DISCOUNT_CARD_008", Calendar.getInstance()),
        Vehicle("ooo1234", VehicleType.BUS, null, Calendar.getInstance()),
        Vehicle("ppp1234", VehicleType.CAR, null, Calendar.getInstance()),
        Vehicle("qqq1234", VehicleType.CAR, null, Calendar.getInstance()),
        Vehicle("rrr1234", VehicleType.MOTORCYCLE, null, Calendar.getInstance()),
        Vehicle("sss1234", VehicleType.BUS, "DISCOUNT_CARD_009", Calendar.getInstance()),
        Vehicle("ttt1234", VehicleType.BUS, null,Calendar.getInstance()),
        Vehicle("uuu1234", VehicleType.MOTORCYCLE, null,Calendar.getInstance()),
        Vehicle("vvv1234", VehicleType.MOTORCYCLE, null,Calendar.getInstance())
    ).forEach{
        parking.addVehicle(it)
    }

    parkingSpace.checkOutVehicle("aaa1234")
    parkingSpace.checkOutVehicle("mmm1234")
    parkingSpace.checkOutVehicle("rrr1234")
    parkingSpace.checkOutVehicle("vvv1234")

    parking.listVehicles()

    //println(parking.vehicles.size)
    parking.getAdminReport()
}
