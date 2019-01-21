# Jenkins tests

# Run with [jenkinsfile-runner](https://github.com/jenkinsci/jenkinsfile-runner)

```sh
docker run --rm -v $PWD:/workspace emilioag/jenkins-tests:latest
```

```sh

docker run -v ${PWD}/myVarLibDocker:/var/lib/docker --privileged --name docker-dind -it docker:stable-dind

docker run --rm -v $PWD:/workspace -v ${PWD}/myVarLibDocker:/var/lib/docker --link docker-dind:docker jenkins-tests:latest

```


```sh
sudo dnf install java-10-openjdk-devel
sudo alternatives --config java # select Java 10
sudo alternatives --config javac # if necessary, select java 10
```