class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        StringBuilder sr = new StringBuilder(s);
        return sr.reverse().toString().equals(s);
    }
}