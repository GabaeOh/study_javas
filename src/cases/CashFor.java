package cases;

import java.util.Scanner;

public class CashFor {
    public static void main(String[] args) {
        try {
            int bucket[] = { 0, 0, 0, 0, 0 };
            Scanner myObj = new Scanner(System.in);

            System.out.println(" 당신은 장바구니에 5가지만 넣을 수 있습니다.");
            System.out.println("----계산시작----");
            for (int first = 0; first < bucket.length; first++) {
                System.out.print((first + 1) + " 번째 가격:");
                bucket[first] = myObj.nextInt();

                // 100원 초과일 경우
                if (bucket[first] > 100) {
                    bucket[first] = 0;
                    System.out.println("100초과 0원 적용");
                }

                // 0원으로 입력 받으면 break로 빠져나와 총합 합산
                else if (bucket[first] == 0) {
                    break;
                }
            }

            // 총합 구하기
            System.out.println("----담은 총합----");
            int sum = 0;
            for (int s = 0; s < bucket.length; s++) {
                sum += bucket[s]; // 합산한다는 표현 +=
            }
            System.out.println("합계" + sum);

            // 계산 종료
            System.out.println("----계산 종료----");

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }
        System.out.println();
        // return 0;
    }
}
