## Health Kakao
카카오톡 알림과 웹으로 관리하는 자가건강체크


<br>
<br>

### 0. 사용한 스프링 설정

-------

- Spring web
- JPA
- lombok
- vaildation
- thymeleaf
- H2 database

<br>
<br>

### 1. 기능 요구조건

-------

 - 회원 기능
   - [ ] 회원 가입 - 카카오 api 이용(가능하면)
   - [ ] 비밀번호 변경
   - [ ] 닉네임 변경
   - [ ] 중복회원 검증 해야힘

<br>

- 건강 체크
   - [ ] 혈당 기록 및 그래프
   - [ ] 몸무게 기록 및 그래프
   - [ ] 복용할 약 기록


<br>

- 알림 기능
   - [ ] 복용해야 할 약 알림 
 

<br>
<br>


### 2. 오류 및 해결  


----------

- @Builder 사용시 에러   
  
```
  java: constructor Member in class springProject.HealthKakao.domain.member.Member cannot be applied to given types;
  required: no arguments
  found: java.lang.Long,java.lang.String,java.lang.String,java.lang.String,springProject.HealthKakao.domain.member.Gender
  reason: actual and formal argument lists differ in length
```

<br>

    - @AllArgsConstructor

    일단, 의미 상 빌더 패턴을 생각해 보았을 때, 아무것도 없는 생성자는 필요가 없다.

    빌더는 필드의 초기화 작업을 도와주는 역할이기 때문에.

- FK를 string으로 설정하는 어려움