class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] bp = new boolean[s.length() + 1];
        bp[0] = true;
        for(int i = 1; i < s.length() + 1; i++){
            for(int j = 0; j < i; j++){
                if(bp[j] == true && wordDict.contains(s.substring(j, i))){
                    bp[i] = true;
                    break;
                }
            }
        }
        return bp[s.length()];
    }
}