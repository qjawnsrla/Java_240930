package 정적메소드은행예제;

import java.security.PublicKey;

public class Bank {
    private static int count = 0;   // 정적 멤버, 클래스 생성시 생성됨
    private int account;    // 잔액 표시, 인스턴스 필드, 객체가 생성될 때 함께 생성됨
    private String bank;    // 은행 이름, 인스턴스 필드
    public Bank(String bank, int account) {
        count++;    // 계좌 개설 개수 확인용, 정적 멤버, 생성자 호출 될때 값이 증가됨
        this.account = account;
        this.bank = bank;
    }
    public static int getCount() {    // 정적 메소드
        return count;
    }
    public void setDeposit(final int dep){      // final은 한번 값이 쓰여지면 고정이므로 dep값 고정
        account+=dep;   // 잔액에 입금 금액을 더해서 잔액을 누적
        System.out.println(dep + " 를 입금했습니다.");
    }
    public void setWithdraw(final int with) {
        if(with > account){
            System.out.println("잔액이 부족합니다.");
        } else {
            account -= with;
        }
    }
    public void viewAccount() {
        System.out.println("현재 잔액은 " + account + "입니다.");
    }
    public String getBank() {
        return bank;
    }
    public int getAccount() {
        return account;
    }

}
