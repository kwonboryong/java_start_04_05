package pack_chapter05;

import pack_chapter05.a.User;

// 패키지의 규칙
// 패키지 이름은 소문자!!!
// 패키지 이름의 앞 부분엔 보통 회사의 도메인 이름을 거꾸로 사용한다. (com.company.myapp) (패키지 이름 중복 방지)
// 패키지는 계층 구조이지만(a -> a.b, a.c) a 패키지와 a.b, a.c 패키지는 서로 완전히! 다른! 패키지이다.
// = 그래서 a 패키지의 클래스를 a.b 패키지에서 사용하려면 import를 사용해야 한다!

public class PakageMain3 {

    public static void main(String[] args) {
        User userA = new User(); // (import pack.a.User;)가 있어서 생략 가능
        pack_chapter05.b.User userB = new pack_chapter05.b.User(); // 둘 중 하나는 패키지 경로를 다 적어줘야 한다. import는 하나만 가능!

    }
}
