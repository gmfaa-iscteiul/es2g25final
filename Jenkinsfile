def dockeruser = "gmfaaiscteiul"
def imagename = "gmfaa/helloworld"
def container = "hwprojeto"
node {
   echo 'Building Apache Docker Image'

stage('Git Checkout') {
    git 'https://github.com/gmfaa-iscteiul/es2g25final'
    }
    
stage('Build Docker Imagae'){
     powershell "docker build -t  ${imagename} ."
    }
    
   stage('Stop Existing Container'){
     powershell "docker stop ${container}"
    }
    
stage('Remove Existing Container'){
     powershell "docker rm ${container}"
    }
   
   
stage ('Runing Container to test built Docker Image'){
    powershell "docker run -dit --name ${container} -p 9:9 ${imagename}"
    }

}
