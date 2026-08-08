class Solution {
    public boolean hasDuplicate(int[] nums) {
       Set<Integer> numbers = new HashSet<Integer>();
       for (int n: nums) {
        if(numbers.contains(n)) {
            return true;
        } else {
            numbers.add(n);
        }
       }
       return false; 
    }
}