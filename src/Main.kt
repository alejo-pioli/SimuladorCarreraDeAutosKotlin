fun main() {
    //Integrantes: Bovero, Lorenzatti, Odetti, Pesce, Pioli

    val pista = PistaPersonalizada(100, "soleado")

    val moto = Moto("moto")
    val autoDeportivo = AutoDeportivo("auto")
    val camion = Camion("camion")

    val vehiculos: List<Vehiculo> = listOf(moto, autoDeportivo, camion)


    var ganador: Vehiculo? = null
    var turnos = 0

    while (ganador == null) {
        turnos++

        println("----- Turno $turnos -----\n")

        // Cambiar clima en cada 3 turnos
        if (turnos % 3 == 0) {
            pista.cambiarClima()
        }

        // Simulación de la carrera
        vehiculos.forEach { vehiculo ->
            vehiculo.acelerar()
            pista.aplicarCondiciones(vehiculo)
            pista.aplicarEventoAleatorio(vehiculo)
            vehiculo.avanzar()

            if (vehiculo.distanciaRecorrida >= pista.longitud) {
                ganador = vehiculo
            }
            println(vehiculo.toString())
        }

        println("----------------\n")
        // Pausa entre turnos
        Thread.sleep(1000)
    }

    println("🏁 ${ganador?.nombre} ha ganado la carrera en $turnos turnos!")
}