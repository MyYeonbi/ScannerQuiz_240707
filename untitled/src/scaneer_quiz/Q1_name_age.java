package scaneer_quiz;
import java.util.Scanner;
public class Q1_name_age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요.");
        String name = sc.nextLine();

        System.out.print("당신의 나이를 입력하세요.");
        int age =sc.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, 나이는 "+ age + "살 입니다.");
    }
}
