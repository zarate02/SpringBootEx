# 마이크로서비스를 더 풍부하게

## 1. 목표

Feign, 서킷브레이크 사용법을 알아보자<br>

## 2. Feign과 서킷브레이크는 무엇인가?<br>

### Feign

유레카에 등록된 서비스들은 서로 ip를 통해서 연결할수도 있지만<br>
컨테이너 명을 통해서도 서로 연결가능하며<br>
그걸 가능하게 해주는 것이 Feign과 같은 서비스들이다.<br>
https://github.com/zarate02/SpringBootEx/blob/master/tbr_ex/src/main/java/com/wintech/test/TestService.java<br>
위와 같이 사용할수있다.<br>

### 서킷브레이크

컨테이너간의 연결도중에 에러가 발생할 수가 있다<br>
에러 발생시 실패한 서비스를 다루는 기술을 서킷브레이크라고 하며<br>
위의 소스에보면 fallback으로 연결된 클래스로 이동하며 처리한다.<br>