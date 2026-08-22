class Solution {
   
    public boolean isHappy(int n) {
        List<Integer> lst = new ArrayList<>();
        return loop(n, lst);

    }
    static boolean loop(int n, List<Integer> lst){
        if(n == 1){
            return true;
        }
        if(lst.contains(n)) return false;
        lst.add(n);
        int res = 0;
        while(n!=0){
            int dig = n%10;
            res += dig*dig;
            n/=10;
        }
        
        return loop(res, lst);

    }
    
}
