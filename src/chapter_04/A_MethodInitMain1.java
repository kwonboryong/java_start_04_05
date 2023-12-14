package chapter_04;

public class A_MethodInitMain1 {

    public static void main(String[] args) {
        MemberInit2 member1 = new MemberInit2();
        member1.name = "user1";
        member1.age = 15;
        member1.grade = 90;

        MemberInit2 member2 = new MemberInit2();
        member2.name = "user2";
        member2.age = 16;
        member2.grade = 80;

        MemberInit2[] members = {member1, member2};

        for (MemberInit2 s: members) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
        }

        }
    }

