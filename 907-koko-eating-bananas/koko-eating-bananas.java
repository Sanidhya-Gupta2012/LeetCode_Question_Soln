class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int max = 0;
        for (int p : piles) {
            max = Math.max(max, p);
        }
        int r = max;
        int ans = -1; // Fixed: Initialized as an integer instead of a String

        while (l <= r) {
            int mid = l + (r - l) / 2;
            long hrs = hours(piles, mid);
            
            if (hrs <= h) {
                ans = mid;
                r = mid - 1; 
            } else {
                l = mid + 1; 
            }
        }
        return ans;
    }

    long hours(int[] piles, int k) {
        long h = 0;
        for (int p : piles) {
            h += p / k;
            if (p % k != 0) {
                h++;
            }
        }
        return h;
    }
}
