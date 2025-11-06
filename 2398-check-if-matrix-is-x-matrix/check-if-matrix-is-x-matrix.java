class Solution {
    public boolean checkXMatrix(int[][] arr) {
        boolean found = true;
        int n = arr.length-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==j || i+j ==n){
                    if(arr[i][j]==0) return false;
                }else{
                    if(arr[i][j] != 0) return false;
                }

            }
        }
        return true;
    }
}