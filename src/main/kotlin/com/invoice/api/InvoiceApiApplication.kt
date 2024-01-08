package com.invoice.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class InvoiceApiApplication

fun main(args: Array<String>) {
    runApplication<InvoiceApiApplication>(*args)
}
