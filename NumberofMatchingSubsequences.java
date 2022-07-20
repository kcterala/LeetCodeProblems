class NumberofMatchingSubsequences {
    public int numMatchingSubseq(String s, String[] words) {
        int count=0;
        System.out.println(words.length);
        Map<String,Boolean> map = new HashMap<String,Boolean>();
        for(int i=0;i<words.length;i++){
            // System.out.println(i);
            if(map.containsKey(words[i])){
                if(map.get(words[i])){
                    count++;
                    continue;
                }else{
                    continue;
                }
            }
            
            StringBuffer sb = new StringBuffer(words[i]);
            for(int j=0;j<s.length();j++){
                if(s.charAt(j) == sb.charAt(0)){
                    sb.deleteCharAt(0);
                }
                if(sb.length() == 0){
                    map.put(words[i],true);
                    count++;
                    break;
                }
            }
            if(sb.length()!=0){
            map.put(words[i],false);
            }
        }
        return count;
    }
}
