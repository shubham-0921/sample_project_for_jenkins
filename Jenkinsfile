// CODE_CHANGES = getGitChanges() //here the getGitChanges will have the logic of checking if there were code changes thru a groovy file

def

pipeline {
    agent any
    environment{
       NEW_VERSION  = '1.6.0'
    }
    stages {
        stage('build') {
            steps {
                echo 'Building my application'
                echo "Version is ${NEW_VERSION}"
                script{
                    gv = load "script.groovy"
                    gv.buildApp()
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
                    gv = load "script.groovy"
                    gv.testApp()
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