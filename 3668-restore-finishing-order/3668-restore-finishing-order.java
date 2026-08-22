class Solution {
    public int[] recoverOrder(int[] order, int[] f) {
        int res[] = new int[f.length];
        List<Integer> lst = new ArrayList<>();
        for(var i:f){
            lst.add(i);
        }
        int ptr=0;
        for(int i=0;i<order.length;i++){
            if(lst.contains(order[i])){
                res[ptr] = order[i];
                ptr++;
            }
        }
        return res;
    }
}