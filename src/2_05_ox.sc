//> using scala 3.4.2
//> using dep "com.softwaremill.ox::core:0.2.1"

import ox.*

def computation1: Int = {
  sleep(2.seconds)
  1
}
def computation2: String = {
  sleep(1.second)
  "2"
}
val resultPar: (Int, String) = par(computation1, computation2)
println(resultPar)
// (1, "2")
