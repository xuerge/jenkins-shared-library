def call(String message) {
    final String COLOR_NC = '\033[0m'
    final String COLOR_BLUE = '\033[0;34m'

    echo "${COLOR_BLUE}[INFO]${COLOR_NC} ${message}"
}
