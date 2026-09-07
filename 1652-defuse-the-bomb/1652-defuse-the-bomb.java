class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int arr[] = new int[n];
        Arrays.fill(arr, 0);
        if(k==0) return arr;
        
        if(k<0) return fnc(code, k, n, n+k, n-1);

        return fnc(code, k, n, 1, k);
    }
    static int[] fnc(int code[], int k, int n, int l, int r){
        int arr[]= new int[n];
        int sum=0;
        for(int i=l; i<=r; i++){
            sum+=code[i];
        }
        int f=0;
        arr[f++] = sum;
        while(f<n){
            sum-=code[l];
            l = (l+1)%n;
            r = (r+1)%n;
            sum+=code[r];
            arr[f] = sum;
            f++;
        }
        return arr;
    }
}