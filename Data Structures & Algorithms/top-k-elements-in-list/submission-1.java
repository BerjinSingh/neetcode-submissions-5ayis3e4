
class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        Map<Integer, Integer> countMap = new HashMap<>();
    for (int num : nums) {
        countMap.put(num, countMap.getOrDefault(num, 0) + 1);
    }

    // 2. Create "Buckets" (List of Lists)
    // The max possible frequency is nums.length
    List<Integer>[] bucket = new List[nums.length + 1];
    
    for (int num : countMap.keySet()) {
        int frequency = countMap.get(num);
        if (bucket[frequency] == null) {
            bucket[frequency] = new ArrayList<>();
        }
        bucket[frequency].add(num);
    }

    // 3. Collect the top K results by iterating backwards
    int[] result = new int[k];
    int index = 0;
    
    // Start from the highest possible frequency (the end of the array)
    for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
        if (bucket[i] != null) {
            for (int num : bucket[i]) {
                result[index++] = num;
                if (index == k) return result;
            }
        }
    }
    
    return result;
    }
}
