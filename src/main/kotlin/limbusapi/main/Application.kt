package limbusapi.main

import limbusapi.config.configureDatabases
import limbusapi.config.configureFrameworks
import limbusapi.config.configureSecurity
import limbusapi.plugins.configureHTTP
import limbusapi.plugins.configureMonitoring
import limbusapi.plugins.configureRouting
import limbusapi.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureFrameworks()
    configureMonitoring()
    configureSerialization()
    configureDatabases()
    configureHTTP()
    configureSecurity()
    configureRouting()
}
