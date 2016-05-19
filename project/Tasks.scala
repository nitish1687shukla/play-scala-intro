import sbt._

object Tasks {
  val customCopyTaskKey = TaskKey[Unit]("copy-mocks", "Copies jasmine mocks into target folder")

  val customCopyTask: Def.Setting[Task[Unit]] = customCopyTaskKey := {
    val testDir = new File("./test/assets/specs")
    for (file <- testDir.listFiles.partition(_.getName.endsWith(".js"))._1) {
      val fileName = file.getName
      IO.copyFile(new File("./test/assets/specs/" + file.getName), new File("./target/web/coffeescript/test/specs/" + fileName), true)
    }
    IO.copyFile(new File("./test/assets/test.dependencies.js"), new File("./target/web/coffeescript/test/test.dependencies.js"), true)
    println("Done with copying !")
  }
}