

fun main(){

    //=========================
    //1- VARIABLES
    //==============================
    println("====VAL y VAR======")

    //val = no va a cambiar ej: Dirección RUT
    val nombre = "Marcelo"

    //Var = Variable que puede cambiar su valor
    var edad = 38
    println("Nombre:  $nombre")
    println("Edad:  $edad")

    edad= 39
    println("Edad:  $edad")


    //=========================
    //2- String o cadenas de texto
    //==============================

    println("====String======")
    val asignatura: String = "Aplicaciones Móviles"

    println("Asignatura: $asignatura")

    //=========================
    //3- Enteros Int
    //==============================
    println("====INT======")

    val cantidadAlumnos: Int =30

    print("Cantidad de alumnos: $cantidadAlumnos")

    println("====Double======")

    val promedio: Double = 6.8

    println("Dato Double: $promedio")

    println("====Boolean======")

    val estaAprobado: Boolean = true
    val estaReprobado: Boolean = false

    println("Aprobado: $estaAprobado")

    println("====CHAR======")
    val seleccion: Char = 'M'


    println("Char: $seleccion")

    println("====Inferencia de datos =====")

    val ciudad = "Puerto Montt" //String
    val alumnosTotal= 30
    val promedioNotas= 6.9
    val activo = true
    val categoria = 'L'

    println("====Operaciones matemáticas =====")

    val numero1 = 10
    val numero2 = 5

    val suma = numero1 + numero2
    val resta = numero1 - numero2
    val multiplicacion = numero1 * numero2
    val division = numero1 / numero2
    val modulo = numero1 % numero2

    println("Suma : $suma")
    println("Resta : $resta")
    println("Multiplicación : $multiplicacion")
    println("Division: $division")
    println("Módulo: $modulo")

    println("La suma de: ${numero1 + numero2}")


    println("====Comparaciones =====")
    val edadPersona = 20
    val esMayorDeEdad = edadPersona >=18

    println("Edad: edadPersona")
    println("¿Es mayor de edad?: $esMayorDeEdad")

    //Otros operadres de comparación
    println("20 > 18: ${20>18}")
    println("20 < 18: ${20<18}")
    println("20 >= 20: ${20>=20}")
    println("20 <= 20: ${20<=20}")
    println("20 == 20: ${20==20}")
    println("20 != 18: ${20!=18}")

    println("====Operadores lógicos =====")

    val mayor = false
    val permiso = false

    //&& AND ==ambas deben coincidir para true
    val puedeEntrar = mayor && permiso
    println("Puede Entrar = $puedeEntrar")

    //OR || al menos 1 debe ser verdadero
    val puedeEntrarOR = mayor || permiso
    println("Puede Entrar OR = $puedeEntrarOR")



    //NOT = !
    val usuarioBloqueado =false
    //invertir su valor
    val usuarioDisponible = !usuarioBloqueado
    println("Está disponible: $usuarioDisponible")



    //Ficha de estudiante:
    val nombreAlumno: String = "Marcelo"
    var edadAlumno1: Int = 21
    val promedio2: Double = 6.8
    val seleccionA: Char = 'A'
    val alumnoAprobado: Boolean= true

    println("Nombre: $nombreAlumno")
    println("Edad: $edadAlumno1")
    println("Promedio: $promedio2")
    println("seleccion: $seleccionA")
    println("Está aprobado: $alumnoAprobado")

}