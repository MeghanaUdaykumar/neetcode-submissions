class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> grp = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<String, Integer>();

        for(int i=0; i<strs.length; i++) {
            String s = strs[i];
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            s = new String(ch);
            
            if(!mp.containsKey(s)) {   
                mp.put(s, grp.size());
                grp.add(new ArrayList<>());
            }

            grp.get(mp.get(s)).add(strs[i]);
        }
        return grp;
    }
}
