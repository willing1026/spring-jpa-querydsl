# spring-jpa-querydsl
SpringBoot Data Jpa - Querydsl 적용해보기. 

#### 따라한 예제
[Spring Boot Data Jpa 프로젝트에 Querydsl 적용하기](https://jojoldu.tistory.com/372)


#### exception
1. org.springframework.orm.jpa.JpaSystemException: No default constructor for entity
- 기본생성자 찾지 못함.
- lombok에 대한 문제 같은데, 설정 확인 필요 (기본생성자, getter 작성 후 문제 해결됨)