package scaneer_quiz;
import java.util.Scanner;
public class Q6_betweenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print(" 첫 번째 숫자를 입력하세요. : ");
        int num1 = sc.nextInt();

        System.out.print(" 두 번째 숫자를 입력하세요 : ");
        int num2 = sc.nextInt();

        // num1이 num2보다 큰 경우, 두 숫자를 교환합니다.
        if (num1 > num2){
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.println("두 숫자 사이의 모든 정수:");
        for(int i = num1; i <= num2; i++){
            System.out.print(i);

           if ( i != num2){
               System.out.print(",");
            }
        }
        // int i = num1인 이유는 입력한 첫번째 수를 포함하기 때문에.
        // i <= num2인 이유는 입력한 두번째 수를 포함하기 때문에 =를 넣어준다.


    }
}
