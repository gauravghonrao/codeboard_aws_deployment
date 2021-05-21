pipeline{
	agent any
	stages{
		stage('Compile Stage GH'){
			steps{
				withMaven(maven:'maven_3_5_0'){
					sh 'maven clean compile'
				}
			}
		}
		stage('Deploy Stage GH'){
			steps{
				withMaven(maven:'maven_3_5_0'){
					sh 'maven deploy'
				}
			}
		}
		
	}
}