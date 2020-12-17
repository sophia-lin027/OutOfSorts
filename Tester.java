import java.util.Random;
import java.util.Arrays;
public class Tester{
  public static void main(String[] args){
    int[] arr = new int[5];
    int a = (int)(Math.random()*1000);
    Random rng = new Random(a);
    for(int i = 0; i < 5; i++ ){
      arr[i] = (rng.nextInt() % 1000);
    }
  }
}
