pipeline{
    agent any
     environment {

        DOCKERHUB_CREDENTIALS = credentials('dockerhub')
    }
    
    stages{
        
       stage('Git Code'){
            steps{
                git branch: 'main',
                url: 'https://github.com/Nour9911/backendspring.git'
            }
         }        
        

        
            stage('Building Project'){
            steps{
                        sh 'mvn clean install'

            }
        }

       

        stage("Building Docker Image") {
                steps{
                    sh 'docker build -t $DOCKERHUB_CREDENTIALS_USR/shopback .'
                }
        }
        
        stage("Login to DockerHub") {
                steps{
                    sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
                   // sh 'doctl registry login'
                }
        }
        
        stage("Push to DockerHub") {
                steps{
                    sh 'docker push $DOCKERHUB_CREDENTIALS_USR/shopback'
                }
        }
        
        stage("Docker-compose") {
                steps{
                    sh 'docker-compose --compatibility up -d'
                }
        }
    }
}
