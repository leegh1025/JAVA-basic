package pack;

import pack.b.User;

public class PackageMain2 {

    public static void main(String[] args) {
        Data data = new Data();
        pack.b.User user = new User(); //import 사용으로 패키지명 생략
    }
}
