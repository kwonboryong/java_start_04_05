package chapter_04;

public class A_MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit2 member1 = new MemberInit2();
        initMember(member1, "user1", 15, 90);

        MemberInit2 member2 = new MemberInit2();
        initMember(member2, "user2", 16, 80);

        MemberInit2[] members = {member1, member2};

        for (MemberInit2 s: members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }
    }

    static void initMember(MemberInit2 member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}

