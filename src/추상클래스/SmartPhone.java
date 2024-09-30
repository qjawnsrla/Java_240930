package 추상클래스;

public class SmartPhone extends Phone{
    public SmartPhone(String name) {
        super(name);
    }
    // 기존의 상속에서는 오버라이딩이 선택이었다면 추상화에서는 필수다.
    @Override
    void call(){
        System.out.println("부모의 요청으로 통하 기능을 구현합니다.");
    }
    public void internet(){
        System.out.println("인터넷을 검색합니다.");
    }
}
