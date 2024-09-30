package 싱글톤;

public class Singleton {
    String name;
    int id;
    // 정적 변수로 싱글톤 Singleton클래스에 대한 참조변수 =>
    // singleton은 static 영역의 참조변수이기 때문에 프로그램 종료 전까지 사라지지 않는다. (객체의 주소를 가지고 있음)
    private static Singleton singleton = new Singleton();
    private Singleton() {
        name = "범준";
        id = 100;
    }
    static Singleton getSingleton() {
        return singleton;
    }
}
