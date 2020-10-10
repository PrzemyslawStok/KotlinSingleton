class AdminRoom {
    val server = Server.getInstance()

    fun changeProcessor(type: String){
        server.processorType = type
    }
}
