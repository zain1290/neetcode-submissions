class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int s : nums) {
            if (map.get(s) == null) map.put(s, true);
            else return true;
        }
        return false;

    }
}