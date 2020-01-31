class Solution {
    public String defangIPaddr(String address) {
        String output = "";
        String[] ipv4 = address.split("\\.");

        for (int i = 0; i < ipv4.length -1; i++) {
            output += ipv4[i] + "[.]";
        }
        output += ipv4[ipv4.length -1];
        return output;
    }
}