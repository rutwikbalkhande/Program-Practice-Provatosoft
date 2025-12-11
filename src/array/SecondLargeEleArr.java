package array;

public class SecondLargeEleArr {

    // 2ns largest element in Array.

    public static void main(String[] args) {

        int[] arr = {10, 25, 3, 99, 56, 72};
        int m1=0;
        int m2=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] > m1)
            {
                m2= m1;
                m1=arr[i];
            }
            else{
                if(arr[i]< m1 && arr[i]> m2)
                {
                    m2=arr[i];
                }
            }
        }
        System.out.println("1st large : "+m1);
        System.out.println("2nd large : " +m2);
    }
    }
