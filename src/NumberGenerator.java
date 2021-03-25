import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args) {
        Random rn = new Random();

        for (int i = 0; i < 100; i++) {
            int answer = rn.nextInt(100) + 1;
            System.out.print(answer + " ");
        }
    }

    public static int[] inrangeRand(int arraySize) {
        int[] arr = new int[arraySize];

        Random rn = new Random();

        for (int i = 0; i < arraySize; i++) {
            int answer = rn.nextInt(1000) + 1;
            arr[i] = answer;
        }
        return arr;
    }
}