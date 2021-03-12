gatling-maven-plugin-demo
=========================

Simple showcase of a maven project using the gatling-maven-plugin.

To test it out, simply execute the following command:

    $ mvn gatling:test -Dgatling.simulationClass=computerdatabase.EmployeeSimulation
    $ mvn gatling:test -Dgatling.simulationClass=computerdatabase.BasicSimulation

or simply: ONLY if you have one Simulation

    $mvn gatling:test
