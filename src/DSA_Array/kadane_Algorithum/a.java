package DSA_Array.kadane_Algorithum;

public class a {
    public static void main(String[] args) {

      int arr[]=  {3, -2, 5, -9,6,8,-1,-20};
int sum=0;
int s=0; int e=0;
int t=0;
int max= Integer.MIN_VALUE;

      for(int i=0;i< arr.length;i++){
          sum = sum + arr[i];

          if(sum > max){
              max= sum;
              s=t;
              e =i;
          }
          if(sum < 0){
              sum=0;
              t= i+1;
          }

      }
        System.out.println(max);
        System.out.println(s);
        System.out.println(e);
    }
}
