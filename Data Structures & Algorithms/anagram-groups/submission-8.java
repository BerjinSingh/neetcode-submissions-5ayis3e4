class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs)
	{
		List<List<String>> output = new ArrayList<>();
		Set<Integer> anagramProcessedIndex = new HashSet<>();
		for(int i = 0; i < strs.length;  i++)
		{
			if(anagramProcessedIndex.contains(i))
			{
				continue;
			}
			List<String> anagramSet = new ArrayList<>();
			anagramSet.add(strs[i]);
			for(int j = i+1; j < strs.length; j++)
			{
				if(isAnagram(strs[i], strs[j]))
				{
					anagramSet.add(strs[j]);
					anagramProcessedIndex.add(j);
				}
			}
			output.add(anagramSet);
		}
		return output;
	}

    public boolean isAnagram(String s1, String s2)
	{
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		return Arrays.equals(ch1, ch2);
	}

    
}
