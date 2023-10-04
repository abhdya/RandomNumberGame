import java.util.Scanner;

public class Codsoft1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.print("Number of guesses required : ");
        int num_guess = sc.nextInt();

        int i = 0;
        while(i<num_guess){
            int random_num = (int)(Math.random()*10);

            System.out.print("Enter your guess : ");
            int user_guess = sc.nextInt();

            if(random_num == user_guess){
                System.out.println("Correct guess");
                count++;
            }
            else{
                System.out.println("Incorrect Guess");
            }
            i++;
        }
        
        float user_score = (float) count/num_guess;
        System.out.println("Your score is " + user_score + "!!!");

        sc.close();
    }
}
