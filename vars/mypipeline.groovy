def call(body) {
    def cfg = [:]

    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate        = cfg
    body()

    node {
      cfg.operations.each { opName, op ->
        stage(opName) {
          runStage(op)
        }
      }
    }

}


def runStage(operation) {
  if (operation.image) {
    println("##############################")
    println("Running inside docker")
    println("##############################")
    docker.image(operation.image).withRun() { c ->
      sh(operation.script)
    }
  } else {
    println("##############################")
    println("Running outside docker")
    println("##############################")
    sh(operation.script)
  }
}
