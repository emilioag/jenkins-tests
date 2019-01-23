# Jenkins tests

# Run with [jenkinsfile-runner](https://github.com/jenkinsci/jenkinsfile-runner)

# Build the Dockerfile:

```sh
docker build -t jenkins-tests .
```

# Running inside docker container

Mount the folder in which the Jenkinsfile is in /workspace (`-v $PWD:/workspace`):

```sh
docker run --rm -v $PWD/Jenkinsfiles/dsl:/workspace jenkins-tests
```

## Using ([credentials](configuration-as-file/credentials.yaml))

you must set the GITHUB_PASS environment variable (`-e GITHUB_PASS="${GITHUB_PASS}"`):

```sh
docker run --rm \
  -e GITHUB_PASS="${GITHUB_PASS}" \
  -v $PWD/Jenkinsfiles/dsl:/workspace \
  jenkins-tests
```

## Modify configuration-as-file settings:

Set whatever you want in \*.yaml inside a particular folder and mount this folder in :/usr/share/jenkins/config (`-v $PWD/configuration-as-file:/usr/share/jenkins/config`):

```sh
docker run --rm \
  -v $PWD/configuration-as-file:/usr/share/jenkins/config \
  -v $PWD/Jenkinsfiles/dsl:/workspace \
  jenkins-tests
```

## Run jenkins-runner script from inside of the jenkins-filerunner container:

Set the entrypoint (`--entrypoint /bin/bash`) and add `-it` option:

```sh
docker run --rm \
  --entrypoint /bin/bash \
  -v $PWD/Jenkinsfiles/dsl:/workspace \
  -it jenkins-tests
```

and inside the docker container run:

```sh
/app/bin/jenkinsfile-runner -w app/jenkins -p /usr/share/jenkins/ref/plugins -f /workspace
```

## Running stages inside docker images

Mount your host docker socket inside jenkins-runner container (`-v /var/run/docker.sock:/var/run/docker.sock`).

```sh
docker run --rm \
  -v $PWD/Jenkinsfiles/dsl:/workspace \
  -v /var/run/docker.sock:/var/run/docker.sock \
  jenkins-tests
```
