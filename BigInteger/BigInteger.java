import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        String inputOne,inputTwo;

        inputOne=scanner.nextLine();

        inputTwo=scanner.nextLine();

        BigInteger a = new BigInteger(inputOne);
        BigInteger b = new BigInteger(inputTwo);

        System.out.println(a.add(b));

        System.out.println(a.multiply(b));
        
    }
}