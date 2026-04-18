class Solution {

    public String encode(List<String> strs)
	{
		StringBuilder output = new StringBuilder();
		String delimeter = String.valueOf((char) 31);
		for(String str : strs)
		{
			output.append(str).append(delimeter);
		}
		return output.toString();

	}

	public List<String> decode(String str)
	{
		List<String> output = new ArrayList<>();
		StringBuilder outputString = new StringBuilder();
		for(char s : str.toCharArray())
		{
			if(s != 31)
			{
				outputString.append(s);
			}
			else
			{
				output.add(outputString.toString());
				outputString = new StringBuilder();
			}
		}
		return output;
	}
}
