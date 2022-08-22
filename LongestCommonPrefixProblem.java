class LongestCommonPrefixProblem {
    public String longestCommonPrefix(String[] strs) {
        int minLength = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            minLength = Math.min(strs[i].length(),minLength);
        }
        StringBuilder ans = new StringBuilder("");
        for(int i=0;i<minLength;i++){
            char ch = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i) != ch){
                    return ans.toString();
                }
            }
            ans.append(ch);
        }
        return ans.toString();
    }
}