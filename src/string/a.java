package string;


import java.util.*;

public class a {

    public static void main(String[] args) {

        String arr = "a,d,c,d,s,a,a,b,b,b,b,b,d,d,d";
        String st[]= arr.split(",");

        int maxcount=1;
        int start=0; int end=0;


        for(int i=1;i<st.length;i++)
        {
            int count=1;
            int j;
            for( j=i+1;j< st.length;j++ ) {
                if (st[i].equals(st[j])) {
                    count++;
                }
                else{
                    break;
                }
            }
            if(count> maxcount){
                maxcount =count;
                start= i;
                end=j-1;
            }
            i = j-1;
        }

        System.out.println(Arrays.toString(st));

        System.out.println("character: " + st[start]);
        System.out.println("count: " + maxcount);

        System.out.println("start index: " + start);
        System.out.println("end index: " + end);


    }
}