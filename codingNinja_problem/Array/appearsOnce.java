// Question link - https://www.codingninjas.com/codestudio/problems/find-the-single-element_6680465?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf

// Solution -

public class Solution {
    public static int getSingleElement(int []arr){
        
        int first = 0;
        int sec = 1;

        while(sec < arr.length){
            if(arr[first] != arr[sec]){
                return arr[first];
            }
            else{
                first += 2;
                sec +=2;
            }
        }
        return arr[first];
    }
}