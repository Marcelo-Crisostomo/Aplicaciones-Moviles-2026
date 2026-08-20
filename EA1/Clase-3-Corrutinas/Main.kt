import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
//main dbo agregar = runBlocking después main() ...
fun main() = runBlocking{
    //println("Buscando producto...")
    //llamando a una fun normal
    //val producto = obtenerProducto()
    //println("Producto recibido: $producto")
    //Función sincronica que va a entregar un resultado posteriormente
    println("TECHSTORE")
    val tareaProducto = async {
        obtenerProducto()
    }
    println("FIN DEL PROGRAMA")
    //Mientras la tarea está esperando, podemos ejecutar otras acciones
    println("La aplicación sigue funcionando")
    println("MOstrando menú ...")
    println("Mostrando promociones...")
    //await = esperar el resultado de la tarea para poder ejecutarse
    val producto = tareaProducto.await()
    println("Producto recibido $producto")
    println("FIN")
}
suspend fun obtenerProducto(): String{
    println("Consultando el servidor...")
    //delay simula una operación lenta o que tarda x cantidad de segundos
    delay(6000)
    return "Teclado Gamer RedDragon"
    
}