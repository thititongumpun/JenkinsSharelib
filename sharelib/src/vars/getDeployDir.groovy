def call(String dirName) {
    def files = findFiles glob: dirName

    return files
}