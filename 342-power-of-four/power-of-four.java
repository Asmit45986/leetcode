class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        if(n%3==1 && (n&(n-1))==0){
            return true;
        }else{
            return false;
        }

    }
}