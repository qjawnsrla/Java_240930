package 추상클래스;

public abstract class Phone {   // 명시적으로 abstract 키워드 사용해서 추상클래스 생성
    String name;
    boolean isPower;
    public Phone(String name){
        this.name = name;
    }
    // 일반 메소드
    public void setPower(boolean isPower){
        this.isPower = isPower;
        if (isPower){
            System.out.println("Phone의 전원을 켭니다.");
        } else {
            System.out.println("Phone의 전원을 끕니다.");
        }
    }
    //abstract void call() { }      // {} 중괄호 자체가 안에 아무것도 없어도 구현부가 있다는 뜻으로 추상메소드에 {} 를 붙이면 에러 발생
    abstract void call();   // 이름만 존재하는 추상메소드, 상속받은 자식클래스에서 반드시 구현해야함

}
