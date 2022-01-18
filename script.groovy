def buildApp(){
    echo 'Building your application.This is from groovy file'
}

def testApp(){
    echo 'Testing your application.This is from groovy file'
}

// Below we are doing return this to return from groovy file and able to access the functions we have defined here in the Jenkinsfile
return this