import ScalaxbKeys._

name := "micase-to-chat"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/micase-to-chat"))

startYear := Some(2013)

description := "Convert MICASE XML to CHAT text"

version := "1.0.0"

scalaVersion := "2.11.5"

// "-deprecation"
scalacOptions ++= Seq(
  "-feature",
  "-language:postfixOps",
  "-language:existentials",
  "-language:implicitConversions"
)

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.3",
  "org.scala-lang.modules" %% "scala-xml" % "1.0.3",
  "org.scalacheck" %% "scalacheck" % "1.12.1" % "test",
  "org.specs2" %% "specs2" % "2.4.15" % "test"
)

scalaxbSettings

packageName in scalaxb in Compile := "com.franklinchen"

sourceGenerators in Compile <+= scalaxb in Compile
