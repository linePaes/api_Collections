package org.collections

import java.math.BigDecimal

fun Array<BigDecimal>.sum() = this.reduce {
    acc, values -> acc + values
}
fun Array<BigDecimal>.average() =
    if (this.isEmpty()) BigDecimal.ZERO
else this.sum()/ this.size.toBigDecimal()