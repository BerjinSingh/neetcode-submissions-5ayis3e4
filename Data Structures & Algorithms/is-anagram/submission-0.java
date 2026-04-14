class Solution {
    public boolean isAnagram(String s, String t) {

        String[] sArray = s.split("");
		List<String> tArray = new ArrayList<>(Arrays.stream(t.split("")).toList());
		int sCount = sArray.length;
		int tCount = tArray.size();
		if(sCount != tCount)
		{
			return false;
		}
		for(int i = 0; i<sArray.length; i++)
		{
			tArray.remove(sArray[i]);
		}
		return tArray.isEmpty();
    }
}
