pipeline{
	agent any
	stages{
		stage('Compile Stage GH'){
			steps{
				maven 'Maven_3.5.0' 
					bat 'maven clean compile'
				}
			}
		}
		stage('Deploy Stage GH'){
			steps{
				maven 'Maven_3.5.0' 
					bat 'maven deploy'
				}
			}
		}
		
	}
}