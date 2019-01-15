class Go {
    def format(Map cfg) {
        return 'echo "Golang Format code"'
    }

    def check(Map cfg) {
        return 'echo "Golang Check"'
    }

    def build(Map cfg) {
        return 'echo "Golang Build"'
    }

    def test(Map cfg) {
        return 'echo "Golang Test"'
    }

    def coverage(Map cfg) {
        return 'echo "Golang Coverage"'
    }

    def docgen(Map cfg) {
        return 'echo "Golang Docgen"'
    }
}
