class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!= t.length())
        {
            return false;
        }
        String[] sArray = s.split("");
		List<String> tArray = new ArrayList<>(Arrays.stream(t.split("")).toList());
		int sCount = sArray.length;
		int tCount = tArray.size();
		
		for(int i = 0; i<sArray.length; i++)
		{
			tArray.remove(sArray[i]);
		}
		return tArray.isEmpty();
    }
}
