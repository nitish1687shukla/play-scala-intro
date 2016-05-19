import com.typesafe.sbt.web.Import.WebKeys._

name := """play-scala-intro"""

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.7"

lazy val root = (project in file(".")).enablePlugins(PlayScala).enablePlugins(SbtTwirl).enablePlugins(SbtWeb)
  .settings(jasmineSettings: _*)
  .settings(

    //    appJsDir <+= baseDirectory / "/target/web/coffeescript/main/javascripts",
    //    appJsLibDir <+= baseDirectory / "public/javascripts",
    //    jasmineTestDir <+= baseDirectory / "/target/web/coffeescript/test",
    //    jasmineConfFile <+= baseDirectory / "/target/web/coffeescript/test/test.dependencies.js",


    appJsDir <+= baseDirectory / "/app/assets/javascripts",
    appJsDir <+= baseDirectory / "/target/web/resourcec-managed/main",
    appJsLibDir <+= baseDirectory / "public/javascripts",
    jasmineTestDir <+= baseDirectory / "/test/assets/specs",
    jasmineConfFile <+= baseDirectory / "/test/assets/test.dependencies.js",
    jasmineRequireJsFile <+= baseDirectory / "public/javascripts/require",
    jasmineRequireConfFile <+= baseDirectory / "/test/assets/specs/require.conf.js",
    jasmine <<= jasmine dependsOn (assets)
  )

libraryDependencies ++= Seq(
  "org.webjars" % "bootstrap" % "3.1.1-2",
  "org.webjars" % "jasmine" % "2.2.0",
  "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
  "org.mockito" % "mockito-all" % "1.10.19" % "test"
)
//BabelKeys.options := WebJs.JS.Object(
//  "presets" -> "es2015"
//)


(test in Test) <<= (test in Test) dependsOn (jasmine)
fork in run := true