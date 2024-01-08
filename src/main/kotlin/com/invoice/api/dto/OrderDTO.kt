package com.invoice.api.dto

data class Order(val groupName: String, val date: Int, val amount:Number, val members: Array<String>, val paymentMethod: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Order

        if (groupName != other.groupName) return false
        if (date != other.date) return false
        if (amount != other.amount) return false
        if (!members.contentEquals(other.members)) return false
        if (paymentMethod != other.paymentMethod) return false

        return true
    }

    override fun hashCode(): Int {
        var result = groupName.hashCode()
        result = 31 * result + date.hashCode()
        result = 31 * result + amount.hashCode()
        result = 31 * result + members.contentHashCode()
        result = 31 * result + paymentMethod.hashCode()
        return result
    }
}