def call(String gitUrl, String gitBranch) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: String.gitBranch]],
        userRemoteConfigs: [[url: String.gitUrl]]
    ])
}