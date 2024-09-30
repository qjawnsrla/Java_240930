package 싱글톤;
// 싱글톤이란? 단 하나의 객체만 생성하는 디자인 패턴
// 장점은 메모리 절약, 생성된 하나의 객체를 재활용해서 사용 (스프링부트 빈 컨테이너에서 사용)
// 또 다른 장점은 클래스로 생성된 객체간의 정보 공유가 쉬 (안드로이드나 iOs에서 사용되는 방식)       //영상 돌려보고 확인필요
// 단점은 동시성 문제가 발생 할 수 있음

public class SingletonEx {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setInfo("안유진", 21);
        student2.viewInfo();    // 전달된 정보를 확인
    }
}
