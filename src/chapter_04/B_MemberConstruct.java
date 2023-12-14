package chapter_04;

public class B_MemberConstruct {
    String name;
    int age;
    int grade;

    B_MemberConstruct(String name, int age, int grade) { // 생성자 (메서드와 비슷)
        // 생성자 이름은 클래스 이름과 같아야 함, 첫 글자도 대문자.
        // 생성자는 반환타입이 없다.
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // 추가 : 생성자 오버로딩(C_ConstructMain2)
    B_MemberConstruct(String name, int age) {
        this(name, age, 50); // grade는 입력 받지 않고 기본 50점으로 설정 / B_MemberConstruct(String name, int age, int grade) 호출됨
        // this() 기능: 생성자 내부에서 다른(자신의) 생성자를 호출할 수 있다.
        // this()는 생성자 코드의 첫 줄에만 작성할 수 있다.
    }

}
