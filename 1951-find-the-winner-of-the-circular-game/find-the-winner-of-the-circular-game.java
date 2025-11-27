class Solution {
    public int findTheWinner(int n, int k) {
        int ans = win(n,k);
        return ans+1;
    }
    public static int win(int n,int k){
        if(n==1){
            return 0;
        }
        return (win(n-1,k)+k)%n;
    }    
}