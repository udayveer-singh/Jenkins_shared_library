def call(Map stageParams) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: stageParams.gitBranch]],
        userRemoteConfigs: [[url: stageParams.gitUrl]]
    ])
}