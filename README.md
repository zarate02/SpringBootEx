# 스프링부트로 간단한 서버 만들기

## 1. 스프링부트란?

2003년 스프링이 나온 후 항상 초기환경설정의 어려움이 지적되어왔다.<br>
그것을 해결하기위해 2014년 4월 스프링부트가 정식으로 릴리즈 되었다.<br>
스프링부트는 간단한 환경세팅을 가능하게하고 내부 WAS를 이용하여 하나의 프로젝트가 하나의 컨테이너로서 사용될 수 있다.<br>
그리고 그 컨테이너들을 묶어 마이크로서비스 생태계를 구축하는데 최적화 되어있다.<br>

## 2. 스프링부트의 장단점

앞서 서술한것과 같이 부트의 최고의 장점은 초기 구축이 간단하다는 부분이다.<br>
https://start.spring.io/<br>
에서 필요한 라이브러리와 기타 환경설정을 설정한다음 내려받으면 바로 개발을 시작할 수 있다.<br>
두번째로 마이크로서비스를 활용한 시스템간의 느슨한 연결구현이 쉽게 가능하다, 이것은 개발중에 많은 이점을 제공한다.<br>
자연스러운 객체지향적인 개발이 진행되고, 이는 빠르고 정확한 개발을 가능하게 한다.<br>

물론 장점만 있는것은 아니다.<br>
마이크로서비스로 시스템을 구축할때 수 많은 장점과 함께 수 많은 문제점도 따라온다.<br>
특정부분에서 성능저하, 디버깅의 어려움, 수정반영의 어려움등이 발생할 수 있다.<br>
물론 구현하기에따라 그 단점들을 상쇄할수도 있고 특정부분에서는 위에 언급된 단점이 장점이 되는 경우도 존재한다.<br>

## 3. 스프링부트 빠른 시작

### 1) 사전준비물
개발툴 : SpringToolSuite 이클립스 STS (https://spring.io/tools, 이하 STS)<br>
자바 : Version 8이상 (https://jdk.java.net/java-se-ri/8)<br>

### 2) 프로젝트 생성하기
방법은 두가지가 있다<br>
1. https://start.spring.io/ 에서 들어가서 프로젝트를 생성한다음 내려받아 import 할수 있다<br>
2. STS를 실행한뒤 File>New>SpringStarterProject 를 선택하여 프로젝트를 생성할 수 있다.<br>

우리는 2번방법을 사용해서 프로젝트를 생성해보려고한다.<br>
<br>
<br>
<br>

이제 git에 첨부된 각 디렉토리를 클릭하여 스프링부트에서 마이크로서비스를 어떻게 구축하는지<br>
또 프로젝트생성시 설정값은 어떤의미를 가지게되는지 확인해보자<br>

1. eureka_ex (유레카서버) : https://github.com/zarate02/SpringBootEx/tree/master/eureka_ex<br>
2. apigate_ex (APIGATEWAY) : https://github.com/zarate02/SpringBootEx/tree/master/eureka_ex<br>
3. ora_ex (실서비스) : https://github.com/zarate02/SpringBootEx/tree/master/eureka_ex<br>

각 서비스를 실행할때는 SpringBootApp 을 통해서 실행하고<br>
웹페이지를 통해 http://localhost:22000/ora/Test001 서비스를 실행하여 eureka_ex, apigate_ex, ora_ex가 정상작동하는지 확인한다.

