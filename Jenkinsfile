pipeline{
	agent any
	 tools {
        maven 'Maven_3.5.0' 
    }
	stages{
		stage('Compile Stage GH'){
			steps{
				
					bat 'maven clean compile'
				
			}
		}
		stage('Deploy Stage GH'){
			steps{
				
					bat 'maven deploy'
				
			}
		}
		
	}
}