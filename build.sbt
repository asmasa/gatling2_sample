name := "gatling2_sample"

scalaVersion := "2.11.1"

resolvers ++= Seq(
  "Scala Tools Releases" at "http://scala-tools.org/repo-releases/",
  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/")

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.0.0-RC5" withSources() withJavadoc()
