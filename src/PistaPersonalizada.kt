class PistaPersonalizada (
    longitud : Int,
    clima : String
) : Pista(longitud, clima)
{
    override fun cambiarClima() {
        TODO("Not yet implemented")
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
        TODO("Not yet implemented")
    }
}