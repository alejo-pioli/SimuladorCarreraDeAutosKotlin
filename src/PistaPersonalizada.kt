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
        TODO("Not yet implemented")
    }

    override fun aplicarEventoAleatorio(vehiculo: Vehiculo) {
        TODO("Not yet implemented")
    }
}