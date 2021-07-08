import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        
        String current_substr = s.substring(0,k);
        String smallest = current_substr;
        String largest = current_substr;

        
        for(int i=1; i=s.length()-k;  i++){
            current_substr = s.substring(i, i+k);
            
            if(current_substr.compareTo(largest)0){
                largest=current_substr;
            }
            
            if(current_substr.compareTo(smallest)0){
                smallest=current_substr;
            }

        }
        

         Complete the function
         'smallest' must be the lexicographically smallest substring of length 'k'
         'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + n + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}