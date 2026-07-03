class Solution {

    public String encode(List<String> strs) {
        // String res = "";
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            // String block = s.length() + "@" + s;
            // res += block;
            sb.append(s.length()).append("@").append(s);
        }

        // return res;
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '@') j++;
            int num = Integer.parseInt(str.substring(i, j));
            j++;
            res.add(str.substring(j, j+num));
            i = j + num;
        }

        return res;
    }
}
