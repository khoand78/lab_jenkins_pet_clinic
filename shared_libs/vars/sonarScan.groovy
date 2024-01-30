def call(Map config = [:]) {
    def scannerHome = tool 'sonarscanner'
    withSonarQubeEnv ('sonarserver') {
        sh "mvn sonar:sonar"
    }
}
