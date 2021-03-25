import java.time.Duration;
import java.time.Instant;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String a[]) throws InterruptedException {
        int[] arr1 = NumberGenerator.inrangeRand(1000000);
        //  System.out.println("Before Selection Sort");
      //  for(int i:arr1){
        //     System.out.print(i+" ");
      //  }
        System.out.println();
        Instant starts = Instant.now();
        Thread.sleep(10);
        selectionSort(arr1);//sorting array using selection sort

        Instant ends = Instant.now();
        System.out.println(Duration.between(starts, ends));

       // System.out.println("After Selection Sort");
      //  for(int i:arr1){
      //      System.out.print(i+" ");
      //  }
    }
}