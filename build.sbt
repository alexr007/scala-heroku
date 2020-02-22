name := "scala-play-heroku-my"
version := "1.0-SNAPSHOT"
scalaVersion := "2.13.1"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)

herokuAppName in Compile := "immense-thicket-94453"

libraryDependencies ++= Seq(
  guice,
)
