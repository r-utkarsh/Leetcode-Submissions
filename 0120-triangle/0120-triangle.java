class Solution {
    public int minimumTotal(List<List<Integer>> t) {

        int dp[][] = new int[t.size()][t.size()];
        for(int i[]:dp){
            Arrays.fill(i, Integer.MIN_VALUE);
        }
        return help(t, 0, 0, dp);

        
    }
    static int help(List<List<Integer>> t, int row, int col, int dp[][]){
        if(row == t.size()-1 ){
            return t.get(row).get(col);
        }
        
        if(dp[row][col] != Integer.MIN_VALUE) return dp[row][col];
        
        int left = help(t, row+1, col, dp);
        int right = help(t, row+1, col+1, dp);
        dp[row][col] = t.get(row).get(col) + Math.min(left, right);
        return dp[row][col];        
    }
}















// for(List<Integer> row : t){
//             lst.addAll(row);
//         }
//         if(lst.size()==1) return lst.get(0);
//         int arr[] = new int[lst.size()];
//         for(int i=0;i<lst.size();i++){
//             arr[i] = lst.get(i);
//         }

//         int sum = arr[0], row = 2, i=1;

//         while(i<arr.length){
//             int min = Integer.MAX_VALUE;
//             int j = i;
//             while(j<(i+row) && j<arr.length){
//                 min = Math.min(min, arr[j]);
//                 j++;
//             }

//             System.out.println();
//             System.out.println(min);
//             sum+=min;
//             System.out.println(sum);
//             i=j;
//             row++;
//         }
//         return sum;