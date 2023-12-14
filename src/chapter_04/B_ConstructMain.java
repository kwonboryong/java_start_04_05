package chapter_04;

public class B_ConstructMain {

    // 생성자: 인스턴스를 생성하고 나서 즉시 호출된다.
    // 사용하는 이유 = 중복 제거, 객체 생성과 초기값 설정을 한 번에 하기 위해(?)
    // 생성자 호출하는 방법: new 생성자명(생성자 매개변수에 맞는 인수들) / new 클래스명(인수들)
    // 생성자명 = 클래스명!!!
    // 생성자는 입력값을 필수로 받게 만들어서 에러를 금방 알 수 있게 해준다.

    // 기본 생성자: 매개변수가 없는 생성자
    // 클래스에 생성자가 하나도 없으면 자바가 자동으로 기본 생성자를 만들어줌 (생성자가 하나라도 있으면 안만들어줌)
    // MemberInit() {  } => 기본 생성자

    public static void main(String[] args) {
        B_MemberConstruct member1 = new B_MemberConstruct("user1", 15, 90);
        B_MemberConstruct member2 = new B_MemberConstruct("user2", 16, 80);
        //
        // 생성자 B_MemberConstruct가 호출됨 -> ("user1"...)값들이 들어감 -> 출력

        B_MemberConstruct[] members = {member1, member2};

        for (B_MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
// 단축키
// ctrl + P: 생성자의 범위? 알려줌
// ctrl + B: 해당 클래스도 들어감