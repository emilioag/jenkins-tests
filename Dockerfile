FROM emilioag/jenkins-runner:latest

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
COPY configuration-as-file/globalLibraries.yaml /usr/share/jenkins/config/globalLibraries.yaml
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt
ENV CASC_JENKINS_CONFIG /usr/share/jenkins/config

RUN curl -fsSL https://download.docker.com/linux/static/stable/x86_64/docker-18.09.1.tgz -o docker.tgz && \
    tar --extract \
            --file docker.tgz \
            --strip-components 1 \
            --directory /usr/local/bin/ && \
    rm docker.tgz

ENV DOCKER_HOST 'tcp://docker:2375'