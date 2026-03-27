package DSA_Array;

public class Min_Smallest_Ele {

    public static void main(String[] args) {

        int arr[]={-65,7,25,33,75,65,45,-2};

      int min= Integer.MAX_VALUE;
      int min2= Integer.MAX_VALUE;

      for(int num : arr){

          if(num < min){
              min= num;
          }

          if(num > min && num< min2){

              min2= num;
          }
      }
        System.out.println("1st smalest: " + min);
        System.out.println("2nd smallest: " + min2);
    }
}
