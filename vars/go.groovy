def format(cfg) {
    sh 'echo "Format code"'
}

def check(cfg) {
    sh 'echo "Check"'
}

def build(cfg) {
    sh 'echo "Build"'
}

def test(cfg) {
    sh 'echo "Test"'
}

def coverage(cfg) {
    sh 'echo "Coverage"'
}

def docgen(cfg) {
    sh 'echo "Docgen"'
}