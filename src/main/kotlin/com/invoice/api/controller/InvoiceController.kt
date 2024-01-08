package com.invoice.api.controller

import com.invoice.api.dto.Order
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class InvoiceController {
    @GetMapping("/invoice")
    fun index() = Order("돈내자",20230604,50000, arrayOf("선우","정아"),"카카오페이")
}