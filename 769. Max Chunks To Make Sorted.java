class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        
        //searching for a element how long it goes
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]) max=arr[i];
            if(max==i) count++;
        }
       return count; 
    }
}