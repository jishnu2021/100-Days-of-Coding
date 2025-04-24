import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {
    
    public static void convertToIpv6(String ipv4address) {
       
        String[] parts = ipv4address.split("\\.");
        
        if (parts.length != 4) {
            System.out.println("Invalid IPv4 address");
            return;
        }

        
        StringBuilder ipv6Address = new StringBuilder("::ffff:");
        for (String part : parts) {
            int octet = Integer.parseInt(part);
            if (octet < 0 || octet > 255) {
                System.out.println("Invalid IPv4 address");
                return;
            }
            ipv6Address.append(String.format("%02x", octet));
        }

        System.out.println(ipv6Address.toString().replaceAll("([0-9a-f]{2})([0-9a-f]{2})", "$1:$2"));
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String ipv4address = bufferedReader.readLine().trim();
        
        Result.convertToIpv6(ipv4address);
        
        bufferedReader.close();
    }
}
