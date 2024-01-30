def install() {
    sh 'mvn -DskipTests package'
}