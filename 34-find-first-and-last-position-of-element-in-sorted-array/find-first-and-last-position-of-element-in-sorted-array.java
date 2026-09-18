class Solution {

    public int[] searchRange(int[] nums, int target) {

        int f = FirstIndex(nums, target);
        int l = LastIndex(nums, target);

        return new int[]{f, l};
    }

    int FirstIndex(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        int f = -1;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                f = mid;
                r = mid - 1;
            }
            else if (target > nums[mid]) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }

        return f;
    }

    int LastIndex(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        int f = -1;
        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                f = mid;
                l = mid + 1;
            }
            else if (target > nums[mid]) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return f;
    }
}