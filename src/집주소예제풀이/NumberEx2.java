package 집주소예제풀이;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberEx2 {
    public static void main(String[] args) {
        int[] number = {4,2,3,3,3,3,3,3,3,3};
        int sum = 0;
        List<Integer> rst = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String num = sc.nextLine();
            if (num.equals("0")) break;
            for (int i = 0; i < num.length(); i++) {
                sum += number[num.charAt(i) - '0'] + 1;     // + 1 은 각 숫자 앞의 공백
            }
            rst.add(sum + 1);   // 리스트의 마지막에
            sum = 0;
        }
        for (int e : rst) System.out.println(e);
    }
}
