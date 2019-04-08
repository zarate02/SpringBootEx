# 마이크로서비스의 통로 ApiGateWay 서버

## 1. ApiGateWay란?

마이크로서비스는 대부분의 경우 클라이언트와 서버를 분리한다.
그때 통로가 되는 역활을 해주는것이 ApiGateWay이다.
여기서는 넷플릭스에서 만들어서 많은곳에서 서비스하고있는 Zuul을 사용한다.
라우팅이 필요한 경우에는 Ribbon을 함께 사용할 수 있다.

## 2. ApiGateWay 만들기

Zuul은 간단한 세팅만으로 손쉽게 ApiGateWay를 만들 수 있다.

### Step 1

우선 STS를 실행한뒤 File>New>SpringStarterProject 를 클릭하여 새로운 프로젝트를 생성한다<br>
Type은 Gradle을 선택하고, Packaging은 Jar를 선택한다 (다른 옵션을 써도 상관없지만 스프링에서 공식적으로 추천한다)<br>
그 뒤에 값은 항목에 맞게 작성해주며<br>
예제의 옵션은<br>
- Name : apigate_ex<br>
- Java Version : 8<br>
- Language : java<br>
- Group : com.winitech<br>
- Artifact : apigate_ex<br>
- Version : 1.0<br>
- Description : apigate_ex<br>
- Package : com.winitech<br>
을 사용했다, Next 버튼을 누른다.<br>

### Step 2

그 다음 필요한 라이브러리들을 설치해야한다<br>
우리는 유레카 서버를 만들것이기 때문에 EurekaDiscovery, Zuul을 선택하고 Finish를 누른다. <br>
(SpringBootVersion 2.1.4 기준)<br>

### Step 3

프로젝트가 만들어진훙에 가장먼저 src/main/resources 의 application.properties 를 열어서 문서를 작성한다.<br>
(https://github.com/zarate02/SpringBootEx/blob/master/apigate_ex/src/main/resources/application.properties)<br>

여기서 잠시 zuul.routes.ora.url=http://localhost:22001 에 대해 설명해보자면
http://host:port/ora/서비스 명으로 http://localhost:22001 에 있는 서비스를 호출하겠다는 말이다.
각종 필터링을 통해 설정할 수 있다

### Step 4

스프링부트 메인클래스에 @EnableZuulProxy, @EnableEurekaClient 를 추가해준다.<br>
(https://github.com/zarate02/SpringBootEx/blob/master/apigate_ex/src/main/java/com/wintech/ApigateExApplication.java)<br>

### Step 5 (Optional)

필요에 따라 로그파일을 작성해주고<br>
(https://github.com/zarate02/SpringBootEx/blob/master/apigate_ex/src/main/resources/logback.xml)<br>
필요에 따라 배너 파일을 만들수도 있다.<br>
(https://github.com/zarate02/SpringBootEx/blob/master/apigate_ex/src/main/resources/banner.txt)<br>