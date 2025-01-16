def info(String content) {
    println "\033[34mINFO: ${content}\033[0m"
}

def success(String content) {
    println "\033[32mSUCCESS: ${content}\033[0m"
}

def error(String content) {
    println "\033[31mERROR: ${content}\033[0m"
}

def warning(String content) {
    println "\033[33mWARNING: ${content}\033[0m"
}

def blue(String content) {
    println "\033[34m${content}\033[0m"
}

def cyan(String content) {
    println "\033[36m${content}\033[0m"
}

def green(String content) {
    println "\033[32m${content}\033[0m"
}

def megenta(String content) {
    println "\033[35m${content}\033[0m"
}

def red(String content) {
    println "\033[31m${content}\033[0m"
}

def yellow(String content) {
    println "\033[33m${content}\033[0m"
}

def bold(String content) {
  println "\033[30m${content}\033[1m"
}