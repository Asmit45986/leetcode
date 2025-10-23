class Solution {
    public boolean hasSameDigits(String s) {
        String res = s;
        while (res.length() > 2) {
            String temp = "";
            for (int i = 0; i < res.length() - 1; i++) {
                int a = res.charAt(i) - '0';
                int b = res.charAt(i + 1) - '0';
                int c = a + b;
                int d = c % 10;
                temp += d;
            }
            res = temp;
        }
        if (res.charAt(0) == res.charAt(1)) {
            return true;
        }
        return false;
    }
}