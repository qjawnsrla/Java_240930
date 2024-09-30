package 집주소예제;

import java.util.Scanner;

public class HomeAddress {
    public static void main(String[] args) {
        int cnt = 0;
        int[] num = new int[100];
        int[] printnum = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자 입력 [줄바꿈으로 구분] [1 ~ 9999 사이 숫자 입력] [100개 이하 입력] : ");
        for (int i=0; i<100; i++) {
            while(true){
                num[i] = sc.nextInt();
                sc.nextLine();
                if (num[i] < 0 || num[i] > 9999) {
                    System.out.println("잘못된 값을 입력하셨습니다.");
                } else cnt += 1; break;
            }
            if (num[i] == 0){
                System.out.println("입력 끝");
                break;
            }
        }
        for (int i = 0; i < cnt-1; i++) {
            int print_cnt = 0;
            // 숫자가 천의자리일 때
            if (num[i]/1000 != 0){
                print_cnt = 3;
                //1000의자리가 1일때
                if(num[i]/1000 == 1){
                    print_cnt += 2;
                }
                //1000의 자리가 2~9일때
                else { print_cnt += 3;}

                //100의 자리가 0일때
                if((num[i]/100)%10 == 0){ print_cnt += 4; }
                //100의 자리가 1일때
                else if((num[i]/100)%10 == 1){ print_cnt += 2; }
                //100의 자리가 2~9일때
                else print_cnt += 3;

                //10의 자리가 0일때
                if((num[i]/10)%10 == 0) { print_cnt += 4; }
                //10의 자리가 1일때
                else if((num[i]/10)%10 == 1){ print_cnt += 2; }
                //10의 자리가 2~9일때
                else print_cnt += 3;

                //1의 자리가 0일때
                if((num[i])%10 == 0){ print_cnt += 4; }
                //1의 자리가 1일떄
                else if((num[i])%10 == 1){ print_cnt += 2; }
                //1의 자리가 2~9일때
                else print_cnt += 3;

            } else {
                // 숫자가 백의자리일때
                if((num[i]/100)%10 != 0){
                    print_cnt += 2;
                    //100의 자리가 1일때
                    if(num[i]/100 == 1){
                        print_cnt += 2;
                    }
                    //100의 자리가 2~9일때
                    else { print_cnt += 3;}

                    //10의 자리가 0일때
                    if((num[i]/10)%10 == 0){ print_cnt += 4; }
                    //10의 자리가 1일때
                    else if((num[i]/10)%10 == 1){ print_cnt += 2; }
                    //10의 자리가 2~9일때
                    else print_cnt += 3;

                    //1의 자리가 0일때
                    if(num[i]%10 == 0){ print_cnt += 4; }
                    //1의 자리가 1일때
                    else if(num[i]%10 == 1){ print_cnt += 2; }
                    //1의 자리가 2~9일때
                    else print_cnt += 3;

                } else{
                    // 숫자가 십의 자리일때
                    if((num[i]/10)%10 != 0){
                        print_cnt += 1;
                        // 10의 자리가 1일때
                        if(num[i]/10 == 1){
                            print_cnt += 2;
                        }
                        // 10의 자리가 2~9일때
                        else { print_cnt += 3;}

                        //1의 자리가 0일때
                        if(num[i]%10 == 0){ print_cnt += 4; }
                        //1의 자리가 1일때
                        else if(num[i]%10 == 1){ print_cnt += 2; }
                        //1의 자리가 2~9일때
                        else print_cnt += 3;

                    } else{
                        // 숫자가 일의자리일때
                        if(num[i]%10 == 1){ print_cnt += 2; }
                        else print_cnt += 3;
                    }
                }
            }
            print_cnt += 2;     // 양 끝 공백 각 1 더하기
            printnum[i] = print_cnt;
            System.out.println(i + "번째 숫자의 칸은 "+ printnum[i]);
        }

    }
}
