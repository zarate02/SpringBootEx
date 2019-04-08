# 마이크로서비스의 시작 Eureka 서버

## 1. 유레카란?

스프링부트는 하나의 프로젝트가 하나의 컨테이너가 된다.<br>
이것을 잘 묶고 전체를 유기적으로 관리해야만이 좋은 마이크로서비스를 구현할수 있다.<br>
그것을 구체화 시켜주는 것이 유레카이다.<br>

## 2. 유레카 서버 만들기

유레카는 기본포트 8761을 사용하며 마이크로서비스 전체를 묶어주는 메인서버가 필요하다.<br>
지금부터 그 유레카 서버 프로그램을 만들어보려고한다.<br>

### Step 1

우선 STS를 실행한뒤 File>New>SpringStarterProject 를 클릭하여 새로운 프로젝트를 생성한다<br>
Type은 Gradle을 선택하고, Packaging은 Jar를 선택한다 (다른 옵션을 써도 상관없지만 스프링에서 공식적으로 추천한다)<br>
그 뒤에 값은 항목에 맞게 작성해주며<br>
예제의 옵션은<br>
- Name : eureka_ex<br>
- Java Version : 8<br>
- Language : java<br>
- Group : com.winitech<br>
- Artifact : eureka_ex<br>
- Version : 1.0<br>
- Description : eureka_ex<br>
- Package : com.winitech<br>
을 사용했다, Next 버튼을 누른다.<br>

### Step 2

그 다음 필요한 라이브러리들을 설치해야한다<br>
우리는 유레카 서버를 만들것이기 때문에 EurekaServer를 선택하고 Finish를 누른다. <br>
(SpringBootVersion 2.1.4 기준)<br>

### Step 3

프로젝트가 만들어진훙에 가장먼저 src/main/resources 의 application.properties 를 열어서 문서를 작성한다.<br>
(https://github.com/zarate02/SpringBootEx/blob/master/eureka_ex/src/main/resources/application.properties)<br>

### Step 4

스프링부트 메인클래스에 @EnableEurekaServer 를 추가해준다.<br>
(https://github.com/zarate02/SpringBootEx/blob/master/eureka_ex/src/main/java/com/wintech/EurekaExApplication.java)<br>

### Step 5 (Optional)

필요에 따라 로그파일을 작성해주고<br>
(https://github.com/zarate02/SpringBootEx/blob/master/eureka_ex/src/main/resources/logback.xml)<br>
필요에 따라 배너 파일을 만들수도 있다.<br>
(https://github.com/zarate02/SpringBootEx/blob/master/eureka_ex/src/main/resources/banner.txt)<br>