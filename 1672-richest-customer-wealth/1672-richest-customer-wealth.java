class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for(int i = 0; i < accounts.length; i++) {
            int add = 0; // reset for each row

            for(int j = 0; j < accounts[i].length; j++) {
                add += accounts[i][j];
            }

            if(add > max) {
                max = add;
            }
        }

        return max;
    }
}