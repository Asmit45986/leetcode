class Solution {
    public int[] constructRectangle(int area) {
        int n = (int) Math.sqrt(area);
        int l = n;
        int w = n;
        int arr[] = new int[2];
        for (int i = 0; i < area; i++) {
            if (l * w == area) {
                arr[0] = l;
                arr[1] = w;
                return arr;
            } else if (l * w > area) {
                w--;
            } else {
                l++;
            }
        } 
        return arr;
    }
}