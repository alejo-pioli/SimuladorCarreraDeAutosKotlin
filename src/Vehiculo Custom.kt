class `Vehiculo Custom` (
    nombre: String,
    velocidadMaxima: Int,
    combustible: Int,
    aceleracion: Int,
    frenado: Int
) : Vehiculo (nombre, velocidadMaxima, combustible, aceleracion, frenado)
{
    override fun acelerar () {
        if (combustible > 0) {
            velocidadActual += aceleracion
            combustible--
            if (velocidadActual > velocidadMaxima) {
                velocidadActual = velocidadMaxima
            }
        }
        else {
            println("No se puede acelerar, no queda más combustible")
        }
    }

    override fun frenar() {
        velocidadActual -= frenado
        if (velocidadActual < 0) {
            velocidadActual = 0
        }

        println("La nueva velocidad es: $velocidadActual km/h")
    }

    override fun avanzar() {
        distanciaRecorrida += velocidadActual
    }

    override fun toString(): String {
        return super.toString()
    }
}