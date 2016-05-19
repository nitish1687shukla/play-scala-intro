import com.typesafe.sbt.web.SbtWeb
import play.sbt.PlayScala
import play.twirl.sbt.SbtTwirl

name := """play-scala-intro"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayScala).enablePlugins(SbtTwirl).enablePlugins(SbtWeb)

libraryDependencies ++= Seq(
  "org.webjars" % "bootstrap" % "3.1.1-2",
 // "org.webjars" % "jasmine" % "2.2.0",
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  "org.mockito" % "mockito-all" % "1.10.19" % "test"
)
fork in run := false