//linear search of an element in an array
import java.util.Scanner;
public class LinearSearch{
  public static void main(String[] args) {
    All sn = new All();
    sn.array();
  }
}

class All {
  public void array() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size of an array:");
    int n=sc.nextInt();
    int num[]=new int[n];
    int count=0;
    System.out.println("enter the elements of array:");
    for(int i=0;i<n;i++){
      num[i]=sc.nextInt();
    }
    System.out.println("enter the key element to be searched:");
    int key=sc.nextInt();//50
    for(int i=0;i<n;i++){
      if(key==num[i]){//50==50
       
         System.out.println("the key element is present at the index of:" +i);
        System.out.println("the searched element is:" +num[i]);
       count++;
      }
    }
      if(count==0){
        System.out.println("no element found");
      }
  }
}