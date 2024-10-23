class Moto (
    nombre: String,
    velocidadMaxima:  Int = 180,
    combustible: Int = 60,
    aceleracion: Int = 20,
    frenado: Int = 15
) : `Vehiculo Custom`(nombre, velocidadMaxima, combustible, aceleracion, frenado)
{}