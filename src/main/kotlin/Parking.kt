data class Parking(val maxVehicles: Int = 20, val vehicles: MutableSet<Vehicle>) {

    var total: Pair<Int, Int> = Pair(0, 0)

    fun addVehicle(v: Vehicle) {
        if (vehicles.size < maxVehicles) {
            vehicles.add(v)
            println("Welcome to AlkeParking!")
        } else {
            println("Sorry, the check-in failed")
        }
    }

    fun getAdminReport() {
        println("${total.first} vehicles have checked out and have earnings of $${total.second}")
    }

    fun listVehicles(){
        println("Plates List is:")
        vehicles.forEach { v ->
            println(v.plate)
        }
    }
}
