//> using scala 3.4.2
//> using dep "io.github.iltotore::iron:2.5.0"//> using dep "io.github.iltotore::iron:2.5.0"

import io.github.iltotore.iron.*
import io.github.iltotore.iron.constraint.all.*

// 0以上の整数
val x: Int :| Greater[0] = 1
println(x) // 1

// Error: Constraint failed: -1 > 0
// val y: Int :| Greater[0] = -1 

case class User(name: String :| Alphanumeric, age: Int :| Greater[0])

def createUser(name: String, age: Int): Either[String, User] =
  for {
    n <- name.refineEither[Alphanumeric]
    a <- age.refineEither[Greater[0]]
  } yield User(n, a)

println(createUser("taretmch", 20))
println(createUser("_taretmch", 20))
println(createUser("taretmch", 0))
