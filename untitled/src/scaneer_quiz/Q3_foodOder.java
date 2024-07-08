package scaneer_quiz;
import java.util.Scanner;

public class Q3_foodOder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("음식 이름을 입력해주세요");
        String food = sc.nextLine();

        System.out.print("음식의 가격을 입력해주세요");
        int price = sc.nextInt();

        System.out.print("음식의 수량을 입력헤주세요");
        int quantity = sc.nextInt();

        System.out.println(food+" "+quantity+" 개를 주문하셨습니다. 총 가격은 "+price*quantity+"원 입니다.");
    }
}
