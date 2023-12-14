package pack_chapter05;

import pack_chapter05.a.User; // "pack.a의 클래스 User을 가져다 쓸거야!" 라는 의미 <import 패키지명.하위패키지명.클래스명;>

import pack_chapter05.a.*; // "pack.a의 클래스를 다 가져다 쓸거야!" 라는 의미 <import 패키지명.하위패키지명.*;>

public class PakageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        User user = new User(); // (import를 사용하면) 패키지 경로 (pack.a.User)에서 (pack.a.)를 생략해도 됨
        User2 user2 = new User2();
    }
}
