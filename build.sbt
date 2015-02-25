name := """multiproject"""

val baseSettings = Seq(version := "1.0-SNAPSHOT", scalaVersion := "2.11.1", showTiming := true)

lazy val root = (project in file(".")).enablePlugins(PlayScala).dependsOn(admin, user, util).settings(baseSettings: _*)

lazy val admin = (project in file("admin")).enablePlugins(PlayScala).dependsOn(util).settings(baseSettings: _*)

lazy val user = (project in file("user")).enablePlugins(PlayScala).dependsOn(util).settings(baseSettings: _*)

lazy val util = (project in file("util")).settings(baseSettings: _*)

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
