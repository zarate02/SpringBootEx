# 본격 서비스 만들기

## 1. 목표

스프링부트를 이용하여 기본 데이터베이스를 설정하고, 유레카 서버에 연결시키고<br>
간단한 웹서비스를 만들어보자<br>

## 2. 서버 빠르게 만들기

### Step 1

우선 STS를 실행한뒤 File>New>SpringStarterProject 를 클릭하여 새로운 프로젝트를 생성한다<br>
Type은 Gradle을 선택하고, Packaging은 Jar를 선택한다 (다른 옵션을 써도 상관없지만 스프링에서 공식적으로 추천한다)<br>
그 뒤에 값은 항목에 맞게 작성해주며<br>
예제의 옵션은<br>
- Name : ora_ex<br>
- Java Version : 8<br>
- Language : java<br>
- Group : com.winitech<br>
- Artifact : ora_ex<br>
- Version : 1.0<br>
- Description : ora_ex<br>
- Package : com.winitech<br>
을 사용했다, Next 버튼을 누른다.<br>

### Step 2

그 다음 필요한 라이브러리들을 설치해야한다<br>
우리는 유레카 서버를 만들것이기 때문에 <br>

- 필수<br>
EurekaDiscovery, Web<br>

- 선택<br>
Lombok (사용하려면 이클립스에 따로 lombok라이브러리를 추가해야한다)<br>
MyBatis (디비관련된 서비스를 이욯하기위하여)<br>

을 선택하고 Finish를 누른다. <br>
(SpringBootVersion 2.1.4 기준)<br>

### Step 3

프로젝트가 만들어진훙에 가장먼저 src/main/resources 의 application.properties 를 열어서 문서를 작성한다.<br>
(https://github.com/zarate02/SpringBootEx/blob/master/ora_ex/src/main/resources/application.properties)<br>

### Step 4

스프링부트 메인클래스에 @EnableEurekaClient 를 추가해준다.<br>
(https://github.com/zarate02/SpringBootEx/blob/master/ora_ex/src/main/java/com/wintech/OraExApplication.java)<br>

그리서 웹에서 호출가능한 서비스도 추가한다, 서비스는 호출시 test ok return 라는 문자를 찍어주는 서비스다<br>
컨트롤러 : https://github.com/zarate02/SpringBootEx/blob/master/ora_ex/src/main/java/com/wintech/Test/TestController.java<br>
서비스 : https://github.com/zarate02/SpringBootEx/blob/master/ora_ex/src/main/java/com/wintech/Test/TestService.java<br>

### Step 5 (Optional)

필요에 따라 로그파일을 작성해주고<br>
(https://github.com/zarate02/SpringBootEx/blob/master/ora_ex/src/main/resources/logback.xml)<br>
필요에 따라 배너 파일을 만들수도 있다.<br>
(https://github.com/zarate02/SpringBootEx/blob/master/ora_ex/src/main/resources/banner.txt)<br>