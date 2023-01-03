// Import vào trong Project random và scanner
import java.util.Scanner;
import java.util.Random;
public class LuckyNumber {
    // Phương thức con
    public static void play() {
        String answer = "";
        //  1 số random từ 0-100
        do {
            Random maximum = new Random();
            int value = Math.abs(maximum.nextInt(101));
            System.out.println("value " + value);
            System.out.println("I'm thinking of a number between 0 and 100");
            int number;
            int count = 0;
            Scanner input = new Scanner(System.in);
            // Nhập 1 số bất kì và so sánh với số random ở trên
            do {
                number = input.nextInt();
                count++;
                System.out.println("Your guess? " + number);
                if (number < value) {
                    System.out.println("It's lower.");
                } else if (number > value) {
                    System.out.println("It's higher");
                } else {
                    System.out.println("You got it right in " + count + " guesses !");
                }
            } while (number != value);// Chạy liên tục trò chơi cho đến khi số vừa nhập = số random
            input.nextLine();
            System.out.println("Do you want to play again? ");
            answer = input.nextLine();
        }while (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes"));// Nếu nhập y hoặc yes trò chơi tiếp tục
    }
    // Phương thức chính
    public static void main(String[] args) {
        play();
    }
}