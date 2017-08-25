import com.rsk.Providers

/**
 * Created by jingshanyin on 8/23/17.
 */

fun main(args: Array<String>) {

    val providers = Providers()
    val details = providers.getAllProvidersEx("Random")
//    val details = providers.getAllProviders("Random")

    details.forEach (::println)



//    {
//        detail -> println("${detail.providerName}, ${detail.name}")
//        println("${it.providerName}, ${it.name}")
//        println(it)
//    }

//    getAllProviders{
//        key, value -> println("\t------$key: $value")
//    }

}

fun getAllProviders(fn: (String, String) -> Unit) {
    val allProviders = Providers.getProviders()
    val it = allProviders.iterator()

    while (it.hasNext()) {
        val provider = it.next()
        println(provider.name)

//        provider.forEach { key, value -> println("\t$key: $value")}
        provider.forEach { key, value -> fn(key.toString(), value.toString())}
    }
}

fun listProvidersInstance() {
    val providers = Providers()

    val allProviders = providers.getProviders()
    val it = allProviders.iterator()

    while (it.hasNext()) {
        val provider = it.next()
        println(provider.name)

        provider.forEach { key, value -> println("\t$key: $value")}
    }
}

fun listProviders() {
    val providers = getProviders()

    val it = providers.iterator()

    while (it.hasNext()) {
        val provider = it.next()
        println(provider.name)

        provider.forEach { key, value -> println("\t$key: $value")}
    }
}