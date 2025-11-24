class Solution {
    public List<Boolean> prefixesDivBy5(int[] arr) {
        int n = arr.length;
        List<Boolean>ll = new ArrayList<>();
        int num = 0;
        for(int i = 0 ; i<n;i++){
            num = (num*2+arr[i])%5;
            if(num==0){
                ll.add(true);
            }else{
                ll.add(false);
            }
        }
        return ll;
    }
}