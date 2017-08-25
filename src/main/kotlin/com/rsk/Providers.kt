package com.rsk

import java.security.Provider
import java.security.Security

/**
 * Created by jingshanyin on 8/23/17.
 */

data class ProviderDetails(val providerName: String, val name: String)

class Providers {

    fun getProviders() : List<Provider> {
        val providers = Security.getProviders()
        val listOfProviders:List<Provider> = providers.asList()
        return listOfProviders
    }

    fun getAllProvidersEx(filter: String) : List<ProviderDetails> {
        val providers = Security.getProviders()
        val listOfProviders = mutableListOf<ProviderDetails>()

        return providers.flatMap {
            provider ->
             provider.entries.filter {it -> it.key.toString().contains(filter, true)}
                    .map { ProviderDetails(provider.name, it.key.toString())}
        }

//        return listOfProviders
    }

    fun getAllProviders(filter: String) : List<ProviderDetails> {
        val providers = Security.getProviders()
        val listOfProviders = mutableListOf<ProviderDetails>()

        providers.forEach {
            provider ->
                val providerDetails = provider.entries.filter {it -> it.key.toString().contains(filter, true)}
                        .map { ProviderDetails(provider.name, it.key.toString())}
//                val providerDetails = provider.entries.map { entry -> ProviderDetails(provider.name, entry.key.toString())}
//            listOfProviders.addAll(providerDetails)
            listOfProviders += providerDetails
        }

        return listOfProviders
    }

    companion object {
        fun getProviders() : List<Provider> {
            val providers = Security.getProviders()
            val listOfProviders:List<Provider> = providers.asList()
            return listOfProviders
        }
    }
}