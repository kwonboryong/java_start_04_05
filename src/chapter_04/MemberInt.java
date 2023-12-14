package chapter_04;

public class MemberInt {

    // 멤버 변수와 매개 변수의 우선순위
    // 매개 변수 > 멤버 변수 = 매개 변수가 코드 블럭의 더 안쪽에 있기 때문에

    // 매개 변수의 이름과 멤버 변수의 이름이 같은 경우 + 메서드 안에서 멤버변수를 가리키려면, this를 사용해서 구분.
    // 자기 자신의 멤버 변수에 접근하려면 this. 를 써주면 된다.(인스턴스 자신의 참조값을 가리킴)
    // 근데 요즘은 this 잘 안씀...

    String name; // 멤버 변수
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) { // 안에서 선언한게 더 우선순위가 높다.
        this.name = name;
        // 왼쪽의 name은 위의 멤버 변수, 오른쪽의 name은 매개 변수(user1)
        // this를 통해 자기 자신의 인스턴스 값을 바꿈 (위의 String name...)
        this.age = age;
        this.grade = grade;
    }
}
