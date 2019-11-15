enablePlugins(org.nlogo.build.NetLogoExtension)

netLogoExtName      := "turtle-fun"

netLogoClassManager := "TurtleFunExtension"

netLogoZipSources   := false

version := "1.1.1-SNAPSHOT"

scalaVersion           := "2.12.8"

scalaSource in Compile := baseDirectory.value / "src"

scalacOptions          ++= Seq("-deprecation", "-unchecked", "-Xfatal-warnings", "-encoding", "us-ascii")

// The remainder of this file is for options specific to bundled netlogo extensions
// if copying this extension to build your own, you need nothing past line 14 to build
// turtle-fun.zip
netLogoTarget :=
  org.nlogo.build.NetLogoExtension.directoryTarget(baseDirectory.value)

netLogoVersion := "6.1.0-RC1"
