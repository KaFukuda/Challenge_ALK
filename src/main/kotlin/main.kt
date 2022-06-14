import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val sdf = SimpleDateFormat("yyyy/MM/dd HH:mm", Locale.ENGLISH);
    sdf.parse("2022/06/14 13:00")
    val cal = sdf.calendar

    val parking = Parking(20, vehicles = mutableSetOf())

    val parkingSpace = ParkingSpace(parking)

    /*val car = Vehicle("aaa1234", VehicleType.CAR, "CARD1", cal)
    val moto = Vehicle("bbb1234", VehicleType.MOTORCYCLE, null, Calendar.getInstance())
    val minibus = Vehicle("ccc1234", VehicleType.MINIBUS, "CARD2", Calendar.getInstance())
    val bus = Vehicle("ddd1234", VehicleType.BUS, null, Calendar.getInstance())*/

    listOf(Vehicle("aaa1234", VehicleType.CAR, "CARD1", cal),
        Vehicle("bbb1234", VehicleType.MOTORCYCLE, "CARD1", cal),
        Vehicle("ccc1234", VehicleType.MINIBUS, null, cal),
        Vehicle("ddd1234", VehicleType.BUS, null, cal),
        Vehicle("eee1234", VehicleType.CAR, "CARD1", cal),
        Vehicle("fff1234", VehicleType.MOTORCYCLE, "CARD1", cal),
        Vehicle("ggg1234", VehicleType.BUS, null, cal),
        Vehicle("hhh1234", VehicleType.MOTORCYCLE, "CARD1", cal),
        Vehicle("iii1234", VehicleType.CAR, null, cal),
        Vehicle("jjj1234", VehicleType.MOTORCYCLE, "CARD1", cal),
        Vehicle("kkk1234", VehicleType.MINIBUS, null, cal),
        Vehicle("lll1234", VehicleType.CAR, null, cal),
        Vehicle("mmm1234", VehicleType.MOTORCYCLE, "CARD1", cal),
        Vehicle("nnn1234", VehicleType.MINIBUS, "CARD1", cal),
        Vehicle("ooo1234", VehicleType.BUS, null, cal),
        Vehicle("ppp1234", VehicleType.CAR, null, cal),
        Vehicle("EEDD5EE", VehicleType.CAR, null, Calendar.getInstance()),
        Vehicle("SDSD7FF", VehicleType.MOTORCYCLE, null, Calendar.getInstance()),
        Vehicle("E77R4GG", VehicleType.BUS, "DISCOUNT_CARD_003", Calendar.getInstance()),
        Vehicle("KKL8DDH", VehicleType.BUS, null,Calendar.getInstance()),
        Vehicle("II999II", VehicleType.MOTORCYCLE, null,Calendar.getInstance()),
        Vehicle("JJ000JJ", VehicleType.MOTORCYCLE, null,Calendar.getInstance())
    ).forEach{
        parking.addVehicle(it)
    }

    parkingSpace.checkOutVehicle("aaa1234")
    parkingSpace.checkOutVehicle("E77R4GG")
    parkingSpace.checkOutVehicle("EEDD5EE")
    parkingSpace.checkOutVehicle("JJ000JJ")

    //println(parking.vehicles.size)
    parking.getAdminReport()
}





