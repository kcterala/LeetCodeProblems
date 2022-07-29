class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        String p = checkString(pattern);
        List<String> list = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            if(pattern.equals(words[i]) || p.equals(checkString(words[i]))){
                list.add(words[i]);
            }
        }
        return list;
        
    }
    private static String checkString(String pattern){
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int count = 122;
        StringBuilder check = new StringBuilder("");
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,count);
                count++;
            }
            check.append(map.get(pattern.charAt(i)));
        }
        return check.toString();
    }
}
