FROM emilioag/jenkins-runner:latest

COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
COPY configuration-as-file /usr/share/jenkins/config
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt
ENV CASC_JENKINS_CONFIG /usr/share/jenkins/config
