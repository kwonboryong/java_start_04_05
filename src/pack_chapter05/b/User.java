package pack_chapter05.b;

// 클래스 이름 중복: 패키지 경로로 판단함 (pack.a.User / pack.b.User)

public class User {
    public User() { // 기본 생성자 정의
        System.out.println("패키지 pack.b 회원 생성");
    }
}
