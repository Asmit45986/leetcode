class Solution {
    public int minNumber(int[] arr1, int[] arr2) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : arr1) {
            mp.put(num, 1);
        }
        int x = Integer.MAX_VALUE;
        for (int num : arr2) {
            if (mp.containsKey(num)) {
                mp.put(num, 2);
                if(x>num){
                    x = num;
                }
            }
        }
        if(x!=Integer.MAX_VALUE){
            return x;
        }
        int min1 = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < min1) {
                min1 = arr1[i];
            }
        }
        int min2 = arr2[0];
        for (int i = 0; i < arr2.length; i++) {
            if (min2 > arr2[i]) {
                min2 = arr2[i];
            }
        }
        int y = 0;
        if(min1>min2){
            y = (min2*10)+min1;
        }else{
            y = (min1*10)+min2;
        }
        return y;
        
    }
}