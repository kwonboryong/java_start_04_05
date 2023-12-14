package chapter_04;

public class C_ConstructMain2 {

    public static void main(String[] args) {
        B_MemberConstruct member1 = new B_MemberConstruct("user1", 15, 90);
        B_MemberConstruct member2 = new B_MemberConstruct("user2", 16); // grade: 50;

        B_MemberConstruct[] members = {member1, member2};

        for (B_MemberConstruct s : members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }
}
