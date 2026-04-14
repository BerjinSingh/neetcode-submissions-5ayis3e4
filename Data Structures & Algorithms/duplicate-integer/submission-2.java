class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> checkedSet = new HashSet<>();
    for (int num : nums) { // Using a for-each loop is cleaner
        if (!checkedSet.add(num)) { // If add returns false, we found a duplicate!
            return true;
        }
    }
    return false;
    }
}