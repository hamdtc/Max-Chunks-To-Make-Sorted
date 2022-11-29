class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        
        // we have to store the max elemts till the point from left
        int leftMax[]=new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>leftMax[i-1]) leftMax[i]=arr[i];
            else leftMax[i]=leftMax[i-1];
        }
        // now to find the min element till the point from the end
        int rightMin[]=new int[n];
        rightMin[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]<rightMin[i+1]) rightMin[i]=arr[i];
            else rightMin[i]=rightMin[i+1];
        }
        
        // now we have leftMax and rightMin stored in array
        // check: when ever the Maximum upto the point is less than min
        // means if the element max is less than min then
        // max valid only upto the min element 
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            if (leftMax[i] <= rightMin[i + 1]) res++;
        }

        return res + 1;
    }
}