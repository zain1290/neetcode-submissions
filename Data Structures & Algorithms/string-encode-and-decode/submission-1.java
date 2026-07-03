class Solution {

    public String encode(List<String> strs) {
        String res = "";

        for (String s : strs) {
            String block = s.length() + "@" + s;
            res += block;
        }

        return res;
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '@') j++;
            int num = Integer.parseInt(str.substring(i, j));
            res.add(str.substring(j+1, j+1+num));
            i = j + 1 + num;
        }

        return res;
    }
}
