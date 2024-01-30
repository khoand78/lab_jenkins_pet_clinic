def call() {
    sshagent(['nginx']) {
    sh 'echo "Pull artifact from Nexus"'
    sh "ssh -o StrictHostKeyChecking=no -l osboxes 192.168.56.162 wget --user=admin --password=qwert123456 \"http://192.168.56.158:8081/repository/maven-nexus-repo/uat/spring-petclinic/${env.BUILD_ID}-${env.BUILD_TIMESTAMP}/spring-petclinic-${env.BUILD_ID}-${env.BUILD_TIMESTAMP}.jar\""
    }
                
    sshagent(['nginx']) {
        sh 'echo "Deploy artifact"'
        sh "ssh -o StrictHostKeyChecking=no -l osboxes 192.168.56.162 nohup java -Dserver.port=8089 -jar spring-petclinic-${env.BUILD_ID}-${env.BUILD_TIMESTAMP}.jar &"
    }
}
