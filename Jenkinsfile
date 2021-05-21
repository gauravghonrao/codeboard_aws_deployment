pipeline{
	agent any
	 tools {
        maven 'maven_3_5_0' 
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