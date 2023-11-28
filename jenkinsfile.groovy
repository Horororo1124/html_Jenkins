pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // 코드를 체크아웃합니다.
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // 단순한 HTML 프로젝트이므로 빌드 단계는 필요하지 않습니다.
                echo 'No build steps required for HTML.'
            }
        }
        stage('Test') {
            steps {
                // HTML 유효성 검사 또는 기타 테스트를 여기에 추가할 수 있습니다.
                echo 'Running tests.'
                // 예: sh 'html5validator index.html'
            }
        }
        stage('Deploy') {
            steps {
                // 배포 스크립트를 실행합니다.
                echo 'Deploying to server.'
                // 예: sh 'scp -r ./* user@server:/path/to/deploy'
            }
        }
    }
}
