/*
Task
Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20 , print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.

Input Format

A single line containing a positive integer, n.

Constraints
1<= n <= 100

Output Format
Print Weird if the number is weird; otherwise, print Not Weird.

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N =sc.nextInt();
      if(N%2==1){
          System.out.println("Weird");
      }
      else{
          if(N>=6 && N<=20){
            System.out.println("Weird");
          }
          else{
              System.out.println("Not Weird");
          }
      } 
    }
}
