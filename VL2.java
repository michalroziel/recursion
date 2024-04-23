import java.util.*;

public class VL2 {
    public static void main(String[] args) {
      int[] a = {2,3,5,7,11,13,17,19};
     System.out.println(search(17, a, 0, 7)); 
  }
  
  
  // public static long calcFib(int n) {
  //   if (n<=2) {
  //     return 1;
  //   }
  //   else{
  //     return calcFib(n-1)+calcFib(n-2);
  //   }
  // }

    public static int search(int elem, int[] a , int low , int high ){
      int m = low + high / 2;
      if (a[m] == elem){
        return m;
      } else {
        if (a[m]> elem){
          return search(elem, a, low, m);
        }else{
          return search(elem, a, m, high);
        }
      }

    }


}
