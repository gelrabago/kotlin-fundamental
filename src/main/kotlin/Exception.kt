fun main() {
    try {
        val message = 3
        message.toInt()
    } catch (e:NumberFormatException){
        println(e.localizedMessage)
    } finally {
        println("with errors")
    }
}