data class Parking(val maxVehicles: Int = 20, val vehicles: MutableSet<Vehicle>) {

    var reportData: Pair<Int, Int> = Pair(0, 0)

    fun addVehicle(newVehicle: Vehicle) {
        if (vehicles.size < maxVehicles && vehicles.add(newVehicle)) println("Welcome to AlkeParking!") else println("Sorry, the check-in failed")
    }

    fun getAdminReport() {
        println("${reportData.first} vehicles have checked out and have earnings of $${reportData.second}")
    }

    fun listVehicles() {
        println("AlkeParking | The plates list is: ")
        vehicles.forEach { data ->
            println(data.plate)
        }
    }
}
