object AppConfig{

    val appName: String = "My KotlinApp"
    var version : String = "1.0.0"

    fun printConfig() {
        println("App Name : $appName , Version : $version")
    }

}

fun main() {

    AppConfig.printConfig()


    AppConfig.version= "1. 1. 0"
     AppConfig.printConfig()

}