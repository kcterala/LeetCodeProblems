class StrStrProblem {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0; 
        }
        if(needle.length()>haystack.length()){
            return -1;
        }
        int index = -1;
        for(int i=0;i<haystack.length();i++){
            int j = 0;
            int p = i;
            if(haystack.charAt(p) == needle.charAt(j)){
                while(p<haystack.length() && j<needle.length()){
                    if(haystack.charAt(p)!=needle.charAt(j)){
                        break;
                    }
                    p++;
                    j++;
                }
            }
            if(j==needle.length()){
                return i;
            }
        }
        return -1;
    }
}