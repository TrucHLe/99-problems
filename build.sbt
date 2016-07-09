name in ThisBuild := "99problems"

version in ThisBuild := "0.1-SNAPSHOT"

scalaVersion in ThisBuild := "2.11.8"

scalacOptions in ThisBuild ++= Seq("-feature", "-deprecation", "-unchecked")

lazy val coreDependencies = Seq(
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0-M7" % "test",
  libraryDependencies += "org.jsoup" % "jsoup" % "1.8.3",
  libraryDependencies += "org.typelevel" %% "cats" % "0.4.1"
)

lazy val root = project
  .in(file("."))
  .aggregate(core)

lazy val core = project
  .in(file("core"))
  .settings(coreDependencies)
