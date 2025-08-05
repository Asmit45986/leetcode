class Solution {

    public double myPow(double x, int n) {
        double power = Math.pow(x, n);
        return power;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        double x = 2.1;
        int y = 3;
        double result = obj.myPow(x, y);
        System.err.println(result);

    }
}