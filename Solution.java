public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finList = new ArrayList<List<Integer>>();
        for(int i=1;i<=numRows;i++){
            List<Integer> list = new ArrayList<Integer>();
            if(i == 1){
                list.add(1);
                finList.add(list);
            }
            else if(i==2){
                list.add(1);
                list.add(1);
                finList.add(list);
            }
            else{
                list.add(1);
                for(int j=0;j<finList.get(i-2).size()-1;j++){
                    list.add(finList.get(i-2).get(j) + finList.get(i-2).get(j+1));
                }
                list.add(1);
                finList.add(list);
            }
        }
        return finList;
    }
}
