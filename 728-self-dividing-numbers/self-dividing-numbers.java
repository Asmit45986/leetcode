class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer>ll = new ArrayList<>();
        for(int i = left ; i<=right;i++){
            boolean found = true;
            int a = i;
            while(a>0){
                int b  = a%10;
                if(b==0 || i%b != 0){
                    found = false;
                    break;
                }
                a = a/10;
            }
            if(found){
                ll.add(i);
            }
        }
        return ll;
    }
}