def call(String dockerHubUsername, String imageName) {
    sh "docker build --build-arg REACT_APP_RAPID_API_KEY=7219bfff2dmsh968a7d4be091e92p1b045djsn54ee957cf8e4 -t ${imageName} ."
    sh "docker tag ${imageName} ${dockerHubUsername}/${imageName}:latest"
    withDockerRegistry([url: 'https://index.docker.io/v1/', credentialsId: 'docker']) {
        sh "docker push ${dockerHubUsername}/${imageName}:latest"
          }
}