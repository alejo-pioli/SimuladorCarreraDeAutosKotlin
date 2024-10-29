class PistaPersonalizada (
    longitud : Int,
    clima : String
) : Pista(longitud, clima)
{
    override fun cambiarClima() {

        val lista = arrayListOf("Llovizna", "Soleado", "Niebla","Normal")

        clima = lista.random()
    }

    override fun aplicarCondiciones(vehiculo: Vehiculo) {
        when (clima) {
            "soleado" -> {
                vehiculo.combustible = (vehiculo.combustible * 0.95).toInt()
            }
            "lluvia" -> {
                vehiculo.velocidadActual = (vehiculo.velocidadActual * 0.5).toInt()
            }
            "niebla" -> {
                vehiculo.velocidadActual = (vehiculo.velocidadActual * 0.2).toInt()
            }
        }
    }

    override fun aplicarEventoAleatorio(vehiculo: Vehiculo) {
        val lista = arrayListOf("pinchazo", "fallo", "encontrar")

        when (lista.random()) {
            "pinchazo" -> {
                vehiculo.frenar()
            }
            "fallo" -> {
                vehiculo.velocidadActual = 0
            }
            "encontrar" -> {
                vehiculo.combustible = (vehiculo.combustible * 1.2).toInt()
            }
        }
    }
}