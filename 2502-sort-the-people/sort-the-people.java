class Solution {
    public String[] sortPeople(String[] names, int[] arr) {
        Map<Integer, String> mp = new TreeMap<>();
        String res[] = new String[arr.length];
        for (int i = 0; i < names.length; i++) {
            mp.put(arr[i], names[i]);
        }
        int index = 0;
        for (var num : mp.keySet()) {
            res[index++] = mp.get(num);
        }
        int start = 0 ;
        int end = arr.length-1;
        while(start<end){
            String temp = res[start];
            res[start] = res[end];
            res[end] = temp;
            start++;
            end--;
        }
        return res;
    }
}