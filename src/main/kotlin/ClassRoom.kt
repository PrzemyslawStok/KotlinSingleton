class ClassRoom(private val no: Int) {
    val server = Server.getInstance()

    fun printClassrom(){
        println("Numer: "+no+" Podłączono do servera: "+server.printServer())
    }

    fun setServerId(){
        server.myId = 20.0;
    }
}
