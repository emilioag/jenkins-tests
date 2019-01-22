def call(body) {
    def cfg = [:]

    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate        = cfg
    body()

    node {
      cfg.operations.each { opName, op ->
        stage(opName) {
          sh(op.script)
        }
      }
    }

}
