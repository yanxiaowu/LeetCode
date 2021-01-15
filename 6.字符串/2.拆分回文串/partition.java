class Solution {
    public List<List<String>> partition(String s) {
        List<String> partition = new ArrayList<>();
        List<List<String>> result = new ArrayList<>();
        helper(s, partition, result, 0);
        return result;
    }
    public boolean isPalindrome(String s) {
        StringBuilder sr = new StringBuilder(s);
        return sr.reverse().toString().equals(s);
    }

    public void helper(String s, List<String> partition, List<List<String>> result, int startIndex){
        if(startIndex == s.length()){
            result.add(new ArrayList<String>(partition));
        }
        int i = startIndex;
        while(i < s.length()){
            String sb = s.substring(startIndex, i+1);
            if(!isPalindrome(sb)){
                i++;
                continue;
            }
            partition.add(sb);
            helper(s, partition, result, i + 1);
            partition.remove(partition.size() - 1);
            i++;
        }
    }
}