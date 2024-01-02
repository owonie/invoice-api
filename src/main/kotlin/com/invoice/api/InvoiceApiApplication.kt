package com.invoice.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class InvoiceApiApplication

fun main(args: Array<String>) {
    runApplication<InvoiceApiApplication>(*args)
}
