def call(body) {
    def cfg = [:]

    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate        = cfg
    body()

    podTemplate(
      cloud: cfg.kubernetes.cloud,
      label: "mypod"
    ) {
      node ("mypod") {
        cfg.operations.each { opName, op ->
          stage(opName) {
            container(name:'mycontainer', shell:'/bin/bash') {
              sh(operation.script)
            }
          }
        }
      }
    }

}
