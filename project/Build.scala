import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "jaxtest"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    javaCore,
    javaJdbc,
    javaEbean,
    "org.pk11" %% "jax-rs" % "0.5"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    resolvers += "pk11" at "http://pk11-scratch.googlecode.com/svn/trunk"
  )

}
