import java.io.*;
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Scanner;
import java.math.*;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        MessageDigest m=MessageDigest.getInstance("MD5");

        m.update(s.getBytes(),0,s.length());

        System.out.println(new BigInteger(1,m.digest()).toString(16));
    }
}
