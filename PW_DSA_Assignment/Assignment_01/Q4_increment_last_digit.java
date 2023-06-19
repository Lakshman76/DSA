class Solution {
    public int[] plusOne(int[] digits) {
        for(int i = digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0; // for like - 8999
            }
        }
        // for like 9,9
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}