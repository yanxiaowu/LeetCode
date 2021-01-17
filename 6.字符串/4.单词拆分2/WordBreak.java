import java.util.*;
class wordBreak {
    public static void main(String[] args){
        // String s = "catsanddog";
        // List<String> wordDict = new ArrayList<String>();
        // wordDict.add("cat");
        // wordDict.add("cats");
        // wordDict.add("sand");
        // wordDict.add("and");
        // wordDict.add("dog");
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaab";
        List<String> wordDict = new ArrayList<String>();
        wordDict.add("a");
        wordDict.add("aa");
        wordDict.add("aaa");
        wordDict.add("aaaa");
        wordDict.add("aaaaa");
        wordDict.add("aaaaaa");
        wordDict.add("aaaaaaa");
        wordDict.add("aaaaaaaa");
        wordDict.add("aaaaaaaaa");
        wordDict.add("aaaaaaaaaa");
        List<String> result = new ArrayList<String>();
        result = wordBreak(s, wordDict);
        System.out.println(result);
    }

    public static List<String> wordBreak(String s, List<String> wordDict) {
        List<String> partition = new ArrayList<>();
        List<String> result = new ArrayList<>();
        helper(s, wordDict, partition, result, 0);
        return result;
    }

    public static void helper(String s, List<String> wordDict, List<String> partition, List<String> result, int startId){
        if(startId == s.length()){
            String str = "";
            int i = 0;
            while(i < partition.size()-1){
                str = str + partition.get(i) + " ";
                i++;
            }
            str = str + partition.get(i);
            result.add(str);
        }
        
        for(int i = startId; i < s.length(); i++){
            String sb = s.substring(startId, i+1);
            if(!wordDict.contains(sb)){
                continue;
            }
            partition.add(sb);
            helper(s, wordDict, partition, result, i + 1);
            partition.remove(partition.size()-1);
        }
    }
}
