//> using scala "3.4.2"
//> using dep "com.github.tarao::record4s:0.12.0"
//> using dep "com.github.tarao::record4s-circe:0.12.0"
//> using dep "io.circe:circe-core_3:0.14.7"
//> using dep "io.circe:circe-generic_3:0.14.7"
//> using dep "io.circe:circe-parser_3:0.14.7"

import com.github.tarao.record4s.%
import com.github.tarao.record4s.circe.Codec.encoder
import io.circe.syntax.*

val r = %(name = "taretmch", age = 20)
println(r)                                     // - %(name = taretmch, age = 20)
println(r.name)                                // - taretmch
println(r.asJson.noSpaces)                     // - {"name":"taretmch","age":20}
println(r + (email = "taretmch@example.com")) // - %(name = taretmch, age = 20, email = taretmch@example.com)
