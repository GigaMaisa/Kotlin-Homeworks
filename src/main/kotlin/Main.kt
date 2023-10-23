fun main(args: Array<String>) {
    operation()
}

fun operation() {
    while (true) {
        try {
            print("type x variable's value: ")
            val x: Double = readlnOrNull()!!.toDouble()

            print("type y variable's value: ")
            val y: Double = readlnOrNull()!!.toDouble()

            val z: Double = x + y
            println("x plus y equals $z")
        } catch (e: NumberFormatException) {
            println("Please enter digits")
            continue
        }

        print("u still wanna play my little game? Y or N: ")
        val answer: String = readlnOrNull().toString()

        when (answer) {
            "N", "n" -> break
            "Y", "y" -> continue
            else -> println("Enter Y or N next time :)")
        }
    }
}