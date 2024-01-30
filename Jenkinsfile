@Library(["build", "scan", "deploy", "shared_libs"]) _

main_shared_libs()
// pipeline {
//     agent any
//     environment {
//         PATH = "/opt/maven-3.9/bin/:$PATH"
//     }
//     stages {
//         stage('Clone Repo') {
//             steps {
//             	git branch: 'main', credentialsId: '477a8184-857f-41ce-b3d0-5582212129e3', url: 'http://192.168.56.155/root/spring-petclinic.git'    
//             }
//             post{
//                 always{
//                     emailext to: "khoadnguyen178@gmail.com",
//                     subject: "Jenkins build: ${currentBuild.currentResult}: ${env.STAGE_NAME}",
//                     body: "${currentBuild.currentResult}: Job ${env.STAGE_NAME}\nFor more information, click here: ${env.BUILD_URL}"
//                 }
//             }
//         }

//         stage('Compile') {
//             steps {
//                 compile()
//             }
//             post{
//                 always{
//                     emailext to: "khoadnguyen178@gmail.com",
//                     subject: "Jenkins build: ${currentBuild.currentResult}: ${env.STAGE_NAME}",
//                     body: "${currentBuild.currentResult}: Job ${env.STAGE_NAME}\nFor more information, click here: ${env.BUILD_URL}"
//                 }
//             }
//         }
        
//         stage('Unit Test') {
//             steps {
//                 sh 'mvn test'
//             }
//             post{
//                 always{
//                     emailext to: "khoadnguyen178@gmail.com",
//                     subject: "Jenkins build: ${currentBuild.currentResult}: ${env.STAGE_NAME}",
//                     body: "${currentBuild.currentResult}: Job ${env.STAGE_NAME}\nFor more information, click here: ${env.BUILD_URL}"
//                 }
//             }
//         }
        
//         stage('Scan SonarQube') {
//             steps {
//                 // withSonarQubeEnv('sonarserver') {
//                 //     sh 'mvn sonar:sonar'
//                 // }
//                 sonarScan()
//             }
//             // post{
//             //     always{
//             //         emailext to: "khoadnguyen178@gmail.com",
//             //         subject: "Jenkins build: ${currentBuild.currentResult}: ${env.STAGE_NAME}",
//             //         body: "${currentBuild.currentResult}: Job ${env.STAGE_NAME}\nFor more information, click here: ${env.BUILD_URL}"
//             //     }
//             // }
//         }

//         stage('Deploy Nexus') {
//             steps {
//                 deployNexus()
//             }
//         }
        
//         stage('Deploy Application') {
//             steps {
//                 sh 'echo "ssh to nginx server"'
//                 deployApp()
//             }
//         }
        
//         stage('Check Health') {
//             steps {
//                 sshagent(['nginx']) {
//                     timeout(time: 60, unit: 'SECONDS') {
//                         waitUntil {
//                             script {
//                                 try {         
//                                     sh "ssh -o StrictHostKeyChecking=no -l osboxes 192.168.56.162 curl -s --head --request GET 192.168.56.162:8089/actuator/health | grep '200'"
//                                     return true
//                                 } catch (Exception e) {
//                                     return false
//                                 }
//                             }
//                         }
//                     }
//                 }
//             }
//         }
//     }
// }