name := """cassandraSample"""

version := "1.0"

scalaVersion := "2.11.7"


libraryDependencies ++= Seq(
	"com.datastax.cassandra" % "cassandra-driver-core" % "3.0.0",
	"org.scalatest" %% "scalatest" % "2.2.5" % "test"
)
