class Solution {
    public boolean isPalindrome(String s) {
        List<String> alphanumericValues = List.of(
			"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
			"k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
			"u", "v", "w", "x", "y", "z", "0", "1", "2", "3",
			"4", "5", "6", "7", "8", "9" 
		);
		StringBuilder stringBuilder = new StringBuilder();
		for(String val : s.split(""))
		{
			String valStr = val.toLowerCase();
			if(alphanumericValues.contains(valStr))
			{
				stringBuilder.append(valStr);
			}
		}
		String sanitizedString = stringBuilder.toString();
		char[] sanitizedStringArray = sanitizedString.toCharArray();
		int left = 0;
		int right = sanitizedStringArray.length - 1;
		while(left < right)
		{
			if(sanitizedStringArray[left] != sanitizedStringArray[right])
			{
				return false;
			}
			left++;
			right--;
		}
		return true;
    }
}
