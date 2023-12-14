package pack_chapter05;

public class PakageMain1 {

    // 서로 같은 폴더에 있는 클래스는 그냥 가져다 사용 가능

    public static void main(String[] args) {
        Data data = new Data();  // 클래스 Data는 PakageMain1과 같은 패키지에 있기 때문에 그냥 불러서 사용 가능
        pack_chapter05.a.User user = new pack_chapter05.a.User(); // 다른 패키지에 있는 클래스는 패키직 경로 <패키지.하위패키지.클래스명>을 통해 사용
    }
}
