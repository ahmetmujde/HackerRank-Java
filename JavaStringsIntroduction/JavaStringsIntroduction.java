import java.io.;
import java.util.;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
         Enter your code here. Print output to STDOUT. 
        
        String answer=;
        
        int sum =A.length()+B.length();
        System.out.println(sum);
        
        
        String[] variables = {A , B};
        Arrays.sort(variables);
        if(variables[0]==A)
            System.out.println(No);
        else
            System.out.println(Yes);
            
         get First letter of the string
        String firstLetA = A.substring(0, 1);
        String firstLetB = B.substring(0, 1);
         Get remaining letter using substring
        String remLetA = A.substring(1);
        String remLetB = B.substring(1);
         
        answer= firstLetA.toUpperCase()+remLetA +   + firstLetB.toUpperCase()+remLetB;
        System.out.println(answer);
        
        
    }
}



