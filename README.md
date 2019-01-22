# Jenkins tests

# Run with [jenkinsfile-runner](https://github.com/jenkinsci/jenkinsfile-runner)

```sh
docker run --rm -v $PWD:/workspace emilioag/jenkins-tests:latest
```


```sh
docker run --rm \
  -e GITHUB_PASS="${GITHUB_PASS}" \
  -v $PWD/configuration-as-file:/usr/share/jenkins/config \
  -v $PWD/Jenkinsfiles/dsl:/workspace \
  emilioag/jenkins-tests:latest
```


```sh
docker run --rm \
  --entrypoint /bin/bash \
  -e GITHUB_PASS="${GITHUB_PASS}" \
  -v $PWD/configuration-as-file:/usr/share/jenkins/config \
  -v $PWD/Jenkinsfiles/dsl:/workspace \
  -it emilioag/jenkins-tests:latest

/app/bin/jenkinsfile-runner -w app/jenkins -p /usr/share/jenkins/ref/plugins -f /workspace
```
