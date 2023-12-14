package chapter_04;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
        // this는 가장 가까운 블럭 내의, 이름이 같은 변수를 찾아감
        // => 각자 이름이 다르면 this 생략 가능
    }
}
