// CODE_CHANGES = getGitChanges() //here the getGitChanges will have the logic of checking if there were code changes thru a groovy file

pipeline {
    agent any
    environment{
       NEW_VERSION  = '1.6.0'
       GV = load "script.groovy"
    }
    stages {
        stage('build') {
            steps {
                echo 'Building my application'
                echo "Version is ${NEW_VERSION}"
                script{
                    GV.buildApp()
                }
            }
        }
        stage('test') {
//              when{
//                 expression{
//                     env.BRANCH_NAME == 'python' && CODE_CHANGES == true
//                 }
//              }
             steps {
                echo 'Testing my application'
                script{
                    GV.testApp()
                }
              }
        }
        stage('deploy') {
             steps {
                echo 'Deploying my application'
              }
        }
    }
//     post{
//
//     }
}