
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        System.out.println("На Вашем счете " + balance + " рублей");
        System.out.println("Введите сумму пополнения счета");
        int deposit = scanner.nextInt();
        int bonus;
        if (deposit > 1000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }
        System.out.println("На Вашем счете " + (balance + deposit) + " рублей");
        System.out.println("Вам будет начисленно бонусов:" + bonus);
    }
}
