import java.util.Arrays;
public class week1{
  public static Float findMax(float[] array){
    int n = array.length;
    float max = array[0];
    for (int i=1; i<n;i++){
      if (array[i] > max){
        max = array[i];
      }
    }
    return max;
  }
  public static Float findMin(float[] array){
    int n = array.length;
    float min = array[0];
    for (int i = 1; i<n; i++) {
      if (array[i] < min) { 
        min = array[i];
      }
    }
    return min;
  }

  public static String findMinMax(float[] array){
    int n = array.length;
    float min = array[0];
    float max = array[0];

    int i = 1;
    while(i < n){
      if (i+1 >= n){ // edge case - compare final item to both max and min
        if (array[i] > max) {
          max = array[i];
        }
        if (array[i] < min) {
          min = array[i];
        }
        i++;
      }
      else {
        float lmin, lmax;
        if (array[i] >= array[i+1]){ // comparison 1
          lmin = array[i+1];
          lmax = array[i];
        }
        else {
          lmin = array[i];
          lmax = array[i+1];
        }
        if (lmax > max) { // comparison 2
          max = lmax;
        }
        if (lmin < min) { // comparison 3
          min = lmin;
        }
        i += 2;
      }
    }
    String res = "The min is: " + Float.toString(min) + "\nThe max is: " + Float.toString(max);
    return res;
  }


  public static void main(String[] args){
    float[] arr = new float[]{1,2,7,4,3};
    float arrMax = findMax(arr); // O(n) runtime, n-1 comparisons
    float arrMin = findMin(arr); // O(n) runtime, n-1 comparisons
    //System.out.println("The max is: " + Float.toString(arrMax));
    //System.out.println("The min is: " + Float.toString(arrMin));
    String minMax = findMinMax(arr); // O(n) runtime, 1.5(n-1) comparisons
    System.out.println(minMax);
  }
}
