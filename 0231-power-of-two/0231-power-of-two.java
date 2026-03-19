class Solution {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;
        for(;n>1;n=n/2) {
            if (n % 2 != 0)
                return false;
        }
        return true;
    }
}