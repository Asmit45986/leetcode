class Solution {
    public List<String> fizzBuzz(int n) {
        List<String>ll = new ArrayList<>();
        String a = "FizzBuzz";
        String b = "Fizz";
        String c = "Buzz";
        for(int i = 1;i<=n;i++){
            if(i%3==0 && i%5==0){
                ll.add(a);
            }else if(i%3==0){
                ll.add(b);
            }else if(i%5==0){
                ll.add(c);
            }else{
                ll.add(Integer.toString(i));
            }
        }
        return ll;
    }
}