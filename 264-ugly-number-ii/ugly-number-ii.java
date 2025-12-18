class Solution {
    public int nthUglyNumber(int n) {
        int u2 = 1;
        int u3 = 1;
        int u5 = 1;
        int arr[] = new int[n+1];
        arr[1] = 1;
        for(int i = 2;i<=n ; i++){
            int ug2 = arr[u2]*2;
            int ug3 = arr[u3]*3;
            int ug5 = arr[u5]*5;
            arr[i] = Math.min(ug2,Math.min(ug3,ug5));
            if(arr[i]==ug2){
                u2++;
            }
            if(arr[i]==ug3){
                u3++;
            }
            if(arr[i]==ug5){
                u5++;
            }
        }
        return arr[n];
    }
}