package test.scala.scripts

import io.gatling.core.Predef._
import io.gatling.http.Predef._ //Para especificar duración de cada request (?)

class baseConfig extends Simulation{
    // Con httpProtocol se inicializa la URL inicial, o las que uno quiera acceder,
    // para realizar el escenario correctamente.
    val httpProtocol = http.baseUrl("http://newtours.demoaut.com/").
        header("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.100 Safari/537.36")

    //Con esto se agregan múltiples Headers en el request
    val common_header = Map(
        "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3",
        "Accept-Encoding" -> "gzip, deflate",
        "Accept-Language" -> "en-US,en;q=0.9,nl-NL;q=0.8,nl;q=0.7,es;q=0.6,ja;q=0.5"
    )
}
