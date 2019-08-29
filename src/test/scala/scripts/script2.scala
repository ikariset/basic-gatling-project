package test.scala.scripts

import io.gatling.core.Predef._
import io.gatling.http.Predef._ //Para especificar duración de cada request (?)

// TIP: el "._" al final parece que es como el ".*" en java en los imports

class script2 extends baseConfig {
    // Con esta variable, se define el escenario a ejecutar.
    val scen1 = scenario("escenario 1").
        exec(http("request_1").
            get("/mercurycruise.php").
            headers(common_header)
        ).
        pause(10)

    // Con esto se define la llamada del escenario para ser simulada (se ejecuta).
    // 'httpProtocol' es lo que se define arriba.
    setUp(scen1.inject(atOnceUsers(2))).protocols(httpProtocol)
}