import ScalaxbKeys._

name := "micase-to-chat"

organization := "com.franklinchen"

organizationHomepage := Some(url("http://franklinchen.com/"))

homepage := Some(url("http://github.com/FranklinChen/micase-to-chat"))

startYear := Some(2013)

description := "Convert MICASE XML to CHAT text"

version := "1.0.0"

scalaVersion := "2.10.3"

// "-deprecation"
scalacOptions ++= Seq(
  "-feature",
  "-language:postfixOps",
  "-language:existentials",
  "-language:implicitConversions"
)

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.11.1" % "test",
  "org.specs2" %% "specs2" % "2.3.7" % "test"
)

scalaxbSettings

packageName in scalaxb in Compile := "com.franklinchen"

sourceGenerators in Compile <+= scalaxb in Compile
