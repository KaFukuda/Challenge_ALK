data class Parking(val maxVehicles: Int = 20, val vehicles: MutableSet<Vehicle>) {

    var reportData: Pair<Int, Int> = Pair(0, 0)
    var totalVehicles = reportData.first
    var totalCash = reportData.second

    fun addVehicle(newVehicle: Vehicle) {
        if (vehicles.size < maxVehicles) {
            vehicles.add(newVehicle)
            println("Welcome to AlkeParking!")
        } else println("Sorry, the check-in failed")
    }

    fun getAdminReport(){
        println("$totalVehicles vehicles have checked out and have earnings of $$totalCash")
    }

    fun listVehicles(){
        println("AlkeParking | The plates list is: ")
        vehicles.forEach { data -> println(data.plate)
        }
    }
}
