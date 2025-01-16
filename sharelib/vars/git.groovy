def commitHash() {
    sh(returnStdout: true, script: 'git rev-parse --short HEAD').trim()
}

def commitMessage() {
    sh(script: "(git log -1 --pretty=%B)", returnStdout: true)
}x