class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        if(n==1){
            arr[0] = 0;
            return arr;
        }
        if(n%2==1){
            int idx = 0;
            int a = n/2;
            for(int i = -a ;i<=a;i++){
                arr[idx++] = i;
            }
            return arr;
        }else{
            int idx = 0;
            int a = n/2;
            for(int i = -a ;i<=a;i++){
                if(i != 0 ){
                    arr[idx++] = i;
                }
                
            }
            return arr;
        }
        
    }
}