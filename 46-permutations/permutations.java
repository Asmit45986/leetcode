class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>>ll = new ArrayList();
        permu(arr,0,ll);
        return ll;

    }
    public static void permu(int arr[],int i,List<List<Integer>>ll){
        
        if(i==arr.length){
            List<Integer> temp = new ArrayList<>();
            for (int x : arr) temp.add(x);
            ll.add(temp);
            return;
        }    
            for(int j = i;j<arr.length;j++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            permu(arr,i+1,ll);
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;   
        }
    }
}