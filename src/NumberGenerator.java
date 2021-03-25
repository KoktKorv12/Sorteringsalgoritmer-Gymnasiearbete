import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args) {
        Random rn = new Random();

        for(int i =0; i < 1000000; i++)
        {
            int answer = rn.nextInt(100) + 1;
            System.out.print(answer + " ");
        }
    }
}