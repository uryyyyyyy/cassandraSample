name := """cassandraSample"""

version := "1.0"

scalaVersion := "2.11.6"


libraryDependencies ++= Seq(
	"com.datastax.cassandra" % "cassandra-driver-core" % "2.2.0-rc2",
	"org.scalatest" %% "scalatest" % "2.2.5" % "test"
)
