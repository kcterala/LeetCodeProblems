class LengthOfLastWordProblem {
    public int lengthOfLastWord(String s) {
        boolean bool = false;
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                if(bool){
                    return count;
                }
            }else{
                bool = true;
                count++;
            }
        }
        return count;
    }
}