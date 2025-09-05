object AppConfig{

    val appName: String = "My KotlinApp"
    var version : String = "1.0.0"

    fun printConfig() {
        println("App Name : $appName , Version : $version")
    }

}

fun main() {

    // Access singleton object directly
    AppConfig.printConfig()

 // update version
    AppConfig.version= "1. 1. 0"
     AppConfig.printConfig()

}