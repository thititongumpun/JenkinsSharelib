class EnvironmentBAY {
  String certName
  String caPath

  EnvironmentBAY(certName, caPath) {
    this.certName = certName
    this.caPath = caPath
  }

  def getCertName() {
    return certName
  }

  def getCaPath() {
    return caPath
  }
}
// class EnvironmentBAY {
//   def certName
//   def caPath

//   def getCertName() {
//     return certName
//   }

//   def getCaPath() {
//     return caPath
//   }
// }