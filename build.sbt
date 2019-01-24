
name := "simple-crud-in-lagom-using-embedded-cassandra"

version := "0.1"

scalaVersion := "2.12.8"


val macwire = "com.softwaremill.macwire" %% "macros" % "2.2.5" % "provided"
val scalaTest = "org.scalatest" %% "scalatest" % "3.0.1" % Test

lazy val `product` = (project in file("."))
  .aggregate(`product-api`, `product-impl`)

lazy val `product-api` = (project in file("product-api"))
  .settings(
    libraryDependencies ++= Seq(
      lagomScaladslApi
    )
  )

lazy val `product-impl` = (project in file("product-impl"))
  .enablePlugins(LagomScala)
  .settings(
    libraryDependencies ++= Seq(
      lagomScaladslPersistenceCassandra,
      lagomScaladslKafkaBroker,
      lagomScaladslTestKit,
      macwire,
      scalaTest
    )
  )
  .settings(lagomForkedTestSettings: _*)
  .dependsOn(`product-api`)

