package scaneer_quiz;
import java.util.Scanner;
public class Q2_odd_even {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요.");
        int n = sc.nextInt();

        if (n%2 == 0){
            System.out.println("입력한 숫자" + n + "은 짝수입니다.");
        }else{
            System.out.println("입력한 숫자" + n +"은 홀수입니다.");
        }
    }
}
