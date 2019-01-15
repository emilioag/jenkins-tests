import Cpp
import JavaLang
import Go

def common(function, cfg){

    def strCmdLine   = ""
    langInstance = ""

    switch (cfg.lang) {
        case "cpp":
            langInstance = new Cpp()
            break
        case "Go":
            langInstance = new Go()
            break
        case "java":
            langInstance = new JavaLang()
            break
        default:
            langInstance = new Cpp()
            break

    }
    strCmdLine += langInstance."$function"(cfg)
    return strCmdLine
}

def format(Map cfg) {
    return common("format", cfg)
}

def check(Map cfg) {
    return common("check", cfg)
}

def build(Map cfg) {
    return common("build", cfg)
}

def test(Map cfg) {
    return common("test", cfg)
}

def coverage(Map cfg) {
    return common("coverage", cfg)
}

def docgen(Map cfg) {
    return common("docgen", cfg)
}