package scaneer_quiz;
import java.util.Scanner;

public class Q4_multiplicationTable {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력하세요");
        int n = sc.nextInt();

        System.out.print("단의 구구단 : ");
        for(int i = 1; i <= 9; i++){
            System.out.println(n+ " * " + i + " = " +n*i);
        }


    }
}
