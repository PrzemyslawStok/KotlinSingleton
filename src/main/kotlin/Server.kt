class Server {
    var myId = 10.0
    var processorType = "core i7"

    companion object{
        private var INSTANCE:Server? = null
        private var id:Double? = null

        fun getInstance():Server{
            if(INSTANCE==null) {
                INSTANCE = Server()
                id = 123121244.0
            }

            return INSTANCE!!
        }

    }

    fun printServer():String{
        return "${myId} processor ${processorType}"
    }
}
