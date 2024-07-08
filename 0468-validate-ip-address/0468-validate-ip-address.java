class Solution {
    public String validIPAddress(String queryIP) {
       
        String ipv4Pattern = "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";
        
        String ipv6Pattern = "^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";

       
        if (queryIP.matches(ipv4Pattern)) {
            return "IPv4";
        }
        else if (queryIP.matches(ipv6Pattern)) {
            return "IPv6";
        }

        return "Neither";
    }
}