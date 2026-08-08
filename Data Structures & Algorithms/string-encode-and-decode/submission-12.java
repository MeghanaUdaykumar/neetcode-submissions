class Solution {

    public String encode(List<String> strs) {
        StringBuffer s = new StringBuffer();

        for(String str: strs) {
            s.append(str.length());
            s.append('#');
            s.append(str);
        }
        System.out.println("str: " + s.toString());
        return s.toString();
    }

    public List<String> decode(String str) {

        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int delimiterIndex = str.indexOf('#', i);
            int len = Integer.parseInt(str.substring(i, delimiterIndex));
            int start = delimiterIndex + 1;
            int end = start + len;
            res.add(str.substring(start, end));
            i = end;
        }
        return res;

    }
}
