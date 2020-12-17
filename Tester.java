import java.util.Random;
import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[] arr = new int[100];
    int a = (int)(Math.random()*1000);
    Random rng = new Random(a);
    for(int i = 0; i < 100; i++){
      arr[i] = (rng.nextInt() % 1000);
    }
    Sorts n = new Sorts();
    System.out.println("Before bubble sorting: " + Arrays.toString(arr));
    n.bubbleSort(arr);
    System.out.println("After bubble sorting: " +  Arrays.toString(arr));
  }
}
