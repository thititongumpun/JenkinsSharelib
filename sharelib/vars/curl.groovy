def curlCommand(
    String method = "GET",
    String host,
    String port,
    String path,
    String params = ""
  ) {
    try {
      def curlCmd = "curl -X ${method} https://dummyjson.com/test"
      sh(script: curlCmd, returnStdout: true).trim()
    } catch (Exception e) {
      log.error(e)
      error(e.toString())
    }
}