name := "helloScala2"

version := "0.1"

scalaVersion := "2.11.12"

idePackagePrefix := Some("helloScala2")


val sparkVersion = "2.4.3"

resolvers += DefaultMavenRepository

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
)

libraryDependencies += "org.scalameta" %% "munit" % "0.7.27" % Test

testFrameworks += new TestFramework("munit.Framework")


