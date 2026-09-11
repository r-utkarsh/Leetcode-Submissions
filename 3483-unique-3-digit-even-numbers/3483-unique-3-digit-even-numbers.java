class Solution {
    public int totalNumbers(int[] d) {
        int arr[] = new int[10];
        for(int i=0;i<d.length;i++){
            arr[d[i]]++;
        }
        int cnt=0;
        for(int i=1; i<=9; i++){
            if(arr[i] == 0) continue;
            arr[i]--;

            for(int j=0; j<=9; j++){
                if(arr[j] == 0) continue;
                arr[j]--;

                for(int k=0; k<=8; k+=2){
                    if(arr[k] == 0) continue;
                    arr[k]--;

                    int num = 100*i + 10*j + k;

                    cnt++;
                   arr[k]++;
                }
                arr[j]++;
            }
            arr[i]++;
        }
        return cnt;
    }
}