class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //grp num & frequency
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int n: nums) {
            mp.put(n, mp.getOrDefault(n,0) +1);
        }
        //create a list with frequency as index, number as list value
        List<Integer>[] li = new ArrayList[nums.length+1];
        for (int key: mp.keySet()) {
            int freq = mp.get(key);
            if(li[freq] == null) {
                li[freq] = new ArrayList<>();
            }
            li[freq].add(key);
        }

        // now print top k with 2d- list<integer>[]
        int[] res = new int[k];
        int index = 0;
        for(int i=li.length-1; i>=0 && index<k; i--) {
            if(li[i] != null) {
                for(int num: li[i]) {
                        res[index] = num;
                        index++;
                    if(index==k) {
                        return res;
                    }
                }
            }

        }
        return res;
    }
}
