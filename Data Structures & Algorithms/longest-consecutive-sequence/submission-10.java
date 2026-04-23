class Solution 
{
    public int longestConsecutive(int[] nums) 
	{
		Arrays.sort(nums);
		int output = nums.length == 0 ? 0 : 1;
		int countOfConsecutive = 1;
		for(int i = 1; i < nums.length; i++)
		{
			int diff = Math.abs(nums[i] - nums[i - 1]);
			if(diff == 1)
			{
				countOfConsecutive += 1;
			}
			if(diff > 1 && countOfConsecutive >= output)
			{
				output = countOfConsecutive;
				countOfConsecutive = 1;
			}
			if(i == nums.length - 1 && countOfConsecutive > output)
			{
				output = countOfConsecutive;
			}
		}
		return output;
    }
}
