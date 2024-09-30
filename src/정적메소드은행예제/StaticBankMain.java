package 정적메소드은행예제;
// static 멤버와 메소드는 클래스 생성 시 함께 생성되고 객체가 생성시에는 만들어지지 않음
// 하나의 클래스에 1개만 존재
// 한번 생성되면 프로그램 종료시까지 사라지지 않음
// 정적 (static) 메소드에서는 인스턴스 필드나 메소드를 사용할 수 없음

public class StaticBankMain {
    public static void main(String[] args) {
        Bank kakao = new Bank("카카오", 1000);
        Bank shinhan = new Bank("신한", 1000);
        Bank nh = new Bank("농협", 500);
        kakao.setDeposit(3000);
        kakao.setDeposit(2000);
        System.out.println(kakao.getBank() + "에" + kakao.getAccount() + "이 있습니다.");
        System.out.println("계좌가 " + Bank.getCount() + "개설 되었습니다."); //영상 돌려보고 확인필요

        System.out.println(Util.max(100,200));
        System.out.println(Util.isEven(123));
        System.out.println(Util.getCurrentDate("20240930"));


    }
}
