class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> lst = new ArrayList<>();
        for(int i=left;i<=right;i++){
            int num = i;
            while(num!=0){
                int rem = num%10;
                if(rem==0 || i%rem!=0) break;
                num/=10;
            }
            if (num==0) lst.add(i);

        }
        // System.out.println(lst);
        return lst;
    }
}