import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
               
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            double sum=0; 
            double total=0;
            
            for(int j=0; j<n; j++){
                
                sum=Math.pow(2,j)*b;
                total+=sum; 
                System.out.print(a+(int)total+" ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}