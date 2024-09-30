package 접근제한자;

// Stack 메모리영역에 들어가는 애들은 자동소멸과 초기화가 안된다는 특징이 있다
// 클래스 자체가 객체로 만들어지니 특별한 경우(스태틱 제외) HEAP 메모리 영역에 생성된다 이를 동적할당이라 한다
public class Parent {
    protected String name;    // protected - 같은패키지이거나 상속관계가 존재하면 접근 가능
    protected String money;       // 접근제한자가 없으면 default, 같은 패키지 내에서만 접근 가능
    protected String addr;
    public Parent() {
        name="이건희";
        money="2000억";
        addr = "서울시 강남구 역삼동";
    }
}