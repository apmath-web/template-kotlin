package com.apmath.template.infrastructure

import io.ktor.application.Application
import org.koin.dsl.module

/**
 * Service Manager for services
 *
 * To define interface, add
 * ```
 * singleBy<SomeServiceInterface, SomeService>()
 * ```
 * and then val in class
 * ```
 * val serviceSome by app.inject<SomeServiceInterface>()
 * ```
 */
class ServiceManager(app: Application) {

    companion object {
        private var instance: ServiceManager? = null

        /**
         * Returns instance of [ServiceManager]
         *
         * Must use [init] before getting instance of [ServiceManager]
         */
        fun getInstance(): ServiceManager {
            if (instance == null)
                throw NullPointerException("Must use ServiceManager.init(this@module) in Application.module first")
            else
                return instance!!
        }

        /**
         * Must be used before getting instance
         * @param application Application.module from Ktor
         */
        fun init(application: Application) {
            instance = ServiceManager(application)
        }

        /**
         * Modules in which services connect to their interfaces
         */
        val serviceManagerModule = module {
        }
    }
}
