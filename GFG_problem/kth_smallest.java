// Question link - https://practice.geeksforgeeks.org/problems/kth-smallest-element5635/1

// Solution - 

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        // 1st approach
        
        // Arrays.sort(arr);
        
        // return arr[k-1];
        
        // 2nd approach
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<k; i++){
            pq.add(arr[i]);
        }
        for(int i=k; i<r-l+1; i++){
            if(pq.peek() > arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    } 
}