class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);

            if (res.containsKey(key)) res.get(key).add(str);
            else {
                List<String> list = new ArrayList<>();
                list.add(str);
                res.put(key, list);
            }

            // res.putIfAbsent(key, new ArrayList<>());
            // res.get(key).add(str);
        }

        return new ArrayList<>(res.values());
    }
}
