package computerdatabase

import io.gatling.core.Predef._
import io.gatling.http.Predef._


class EmployeeSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("http://localhost:9091") // Here is the root for all relative URLs
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // Here are the common headers
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")

  val scn = scenario("GET EMPLOYEES") // A scenario is a chain of requests and pauses
    .exec(http("request_employee")
    .get("/allEmployees"))
    .pause(7) // Note that Gatling has recorder real time pauses

    // Note the triple double quotes: used in Scala for protecting a whole chain of characters (no need for backslash)
    .exec(http("request_10") // Here's an example of a POST request
      .post("/computers")
      .formParam("""name""", """Beautiful Computer""")
      .formParam("""introduced""", """2012-05-30""")
      .formParam("""discontinued""", """""")
      .formParam("""company""", """37"""))

  setUp(scn.inject(atOnceUsers(10)).protocols(httpProtocol))
}
