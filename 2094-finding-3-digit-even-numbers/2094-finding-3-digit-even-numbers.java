class Solution {
    public int[] findEvenNumbers(int[] arr) {
        ArrayList<Integer> lst = new ArrayList<>();
        int f[] = new int[10];
        for(int i=0;i<arr.length;i++){
            f[arr[i]]++;
        }

        for(int i=1;i<=9;i++){
            if(f[i] == 0) continue;
            f[i]--;
            for(int j=0; j<=9; j++){
                if(f[j]==0) continue;
                f[j]--;
                for(int k=0;k<=8; k+=2){
                    if(f[k]==0) continue;
                    f[k]--;
                    int num = 100*i+10*j+k;
                    lst.add(num);
                    f[k]++;
                }
                f[j]++;
            }
            f[i]++;
        }

        int res[] = new int[lst.size()];
        for(int i=0; i<lst.size();i++){
            res[i] = lst.get(i);
        }
        return res;
        
    }
}