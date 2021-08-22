package blog.wroejoe

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import blog.wroejoe.plugins.*
import io.ktor.application.Application

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
    }.start(wait = true)
}
