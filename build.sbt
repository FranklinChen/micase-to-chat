lazy val root = (project in file(".")).
  enablePlugins(ScalaxbPlugin).
  settings(
    name := "micase-to-chat",
    organization := "com.franklinchen",
    organizationHomepage := Some(url("http://franklinchen.com/")),
    homepage := Some(url("http://github.com/FranklinChen/micase-to-chat")),
    startYear := Some(2017),
    description := "Convert MICASE XML to CHAT text",
    version := "1.0.0",
    scalaVersion := "2.12.3",
    // "-deprecation"
    scalacOptions ++= Seq(
      "-feature",
      "-language:postfixOps",
      "-language:existentials",
      "-language:implicitConversions"
    ),
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.6",
      "org.scala-lang.modules" %% "scala-xml" % "1.0.6",
      "org.specs2" %% "specs2-core" % "4.0.1" % Test
    ),
    scalaxbPackageName in (Compile, scalaxb) := "com.franklinchen"
  )
