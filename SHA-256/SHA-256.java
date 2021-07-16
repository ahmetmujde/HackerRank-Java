import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Solution {

    public static void main(String[] args)  throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        
        if((6<=s.length()) && (s.length()<=20)){  

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        
        byte[] digest = md.digest(s.getBytes(StandardCharsets.UTF_8));
        
        String sha256 = DatatypeConverter.printHexBinary(digest).toLowerCase();
 
        // print SHA-256 Message Digest
        System.out.println(sha256);
        }
        
    
    }
}
