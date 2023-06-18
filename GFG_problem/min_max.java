// Question link - https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

// solution - 

class Solution
{ 
    public static int findSum(int A[],int N) {
    
    //1st approach
        
    //     int min = Integer.MAX_VALUE;
    //     int max = Integer.MIN_VALUE;
        
    //     for(int i=0; i< N; i++){
    //         if(A[i]< min){
    //             min = A[i];
    //         }
    //         if(A[i] > max){
    //             max = A[i];
    //         }
    //     }
    //     return max+min;
    
    // 2nd approach 
    int min, max,i;
    if(N%2 == 0){
        if(A[0] > A[1]){
           max = A[0];
           min = A[1];
        }
        else{
            max = A[1];
            min = A[0];
        }
        i=2;
    }
    else{
        min = max = A[0];
        i=1;
    }
    for( ; i<N-1; i+=2){
        if(A[i] > A[i+1]){
            if(A[i] > max)
                max = A[i];
            if(A[i+1] < min)
                min = A[i+1];
        }
        else{
            if(A[i] < min)
                min = A[i];
            if(A[i+1] > max)
                max = A[i+1];
        }
    }
    return max+min;
        
    }
}
