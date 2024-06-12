//> using scala "3.4.2"
//> using dep "org.typelevel:spire_3:0.18.0"

import spire.math.Rational
import java.math.RoundingMode.HALF_UP

val `1/2` = Rational(1, 2)
println(s"1/2 = ${`1/2`}")

val `1/3` = Rational(1, 3)
println(s"1/3 = ${`1/3`}")

val `5/6` = `1/2` + `1/3`
println(s"1/2 + 1/3 = ${`5/6`}")

val `1/6` = `1/2` * `1/3`
println(s"1/2 * 1/3 = ${`1/6`}")

val `3/2` = `1/2` / `1/3`
println(s"1/2 / 1/3 = ${`3/2`}")

println(s"1/6 toBigDecimal(5, HALF_UP) = ${`1/6`.toBigDecimal(5, HALF_UP)}")
println(s"1/6 toReal = ${`1/6`.toReal}")

println(s"5/6 toBigDecimal(5, HALF_UP) = ${`5/6`.toBigDecimal(5, HALF_UP)}")
