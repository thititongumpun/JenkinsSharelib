def call() {
    log.info("${cr_number} ${git.commitHash()} ${git.commitMessage()}")
currentBuild.description = """
Commit: ${git.commitHash()}
Commit Message: ${git.commitMessage()}
"""
}