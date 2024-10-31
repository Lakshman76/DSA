// Question link - https://www.geeksforgeeks.org/problems/swap-two-numbers3844/1

// solution - 

class Solution{
    static List<Integer> get(int a,int b)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        ans.add(a);
        ans.add(b);
        return ans;
    }
}