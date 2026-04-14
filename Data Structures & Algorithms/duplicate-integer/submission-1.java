class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> checkedSet = new HashSet<>();
        for(int i = 0; i<nums.length; i++)
        {
            if(checkedSet.contains(nums[i]))
            {
                return true;
            }
            checkedSet.add(nums[i]);
        }
        return false;
    }
}