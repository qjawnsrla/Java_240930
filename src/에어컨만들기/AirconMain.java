package 에어컨만들기;
import java.util.Scanner;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirconMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        // 에어컨 종류 선택
        System.out.println("에어컨 선택 : [1]기본 에어컨 [2]스카트 에어컨 [3]휴대용 에어컨 : ");
        int choice = sc.nextInt();
        Aircon lgAirCon;

        Aircon lgAircon = new Aircon();

        // 에어컨 켜키
        System.out.println("에어컨을 켜시겠습니까? (Yes or No) : ");
        String isOn = sc.next();
        if(isOn.equalsIgnoreCase("Yes")){
            int elapsedTime = 0;    // 경과 시간 계산
            boolean isSetTemp = false;  // 온도가 변경 될 상황인지 확인하는 조건
            lgAircon.setPower(true);    // 에어컨 켜기
            lgAircon.setAirConState();  // 온도 설정과 바람세기 설정
            while (true){   // 현재온도와 설정온도가 같을때까지 반복
                sleep(1000);
                elapsedTime++;  // 1초마다 경과시간값이 1씩 증가
                switch (lgAircon.getWindStep()){
                    case 1: if(elapsedTime >= 60) isSetTemp = true; break;
                    case 2: if(elapsedTime >= 30) isSetTemp = true; break;
                    case 3: if(elapsedTime >= 20) isSetTemp = true; break;
                }
                if(isSetTemp){
                    if (lgAircon.isHeater()) lgAircon.setCurTemp(1);
                    if (lgAircon.isCooler()) lgAircon.setCurTemp(-1);
                    lgAircon.airConInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }
                // 현재온도와 설정온도가 같으면
                if(lgAircon.getCurTemp() == lgAircon.getSetTemp()){
                    System.out.println("에어컨을 종료합니다.");
                    break;
                }
            }
        }
    }
}
