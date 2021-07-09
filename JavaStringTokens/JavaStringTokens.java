import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
         
        s= s.trim();
        if(s.length()==0)
        {
            System.out.println(0);
            return;
        }
          
        String[] output = s.split("[^a-zA-Z]+");        
        
        System.out.println(output.length);

        for (String word: output) {
            System.out.println(word);
        }

    
    }
}

