import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        
        // 1 se start karenge, index 'in' ki jagah seedhe number use karenge
        fun(1, n, k, ans, c);
        return ans;
    }

    private void fun(int start, int n, int k, List<List<Integer>> ans, List<Integer> c) {
        // Base case: jab k elements mil jayein
        if (c.size() == k) {
            ans.add(new ArrayList<>(c));
            return;
        }

        // Out of bounds check: agar start n se aage chala jaye
        if (start > n) {
            return;
        }

        // 1. Include / Pick
        c.add(start);
        fun(start + 1, n, k, ans, c);

        // 2. Backtracking
        c.remove(c.size() - 1);

        // 3. Exclude / Don't pick
        fun(start + 1, n, k, ans, c);
    }
}