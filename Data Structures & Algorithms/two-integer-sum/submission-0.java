class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer,Integer> addCount = new HashMap<>();
        for(int i=0; i<nums.length; i++){
        int num = nums[i];
        int diff = target - num;


        if(addCount.containsKey(diff)){
            return new int[] {addCount.get(diff),i};
        }

        addCount.put(num,i);
        
        }
        return new int[] {};



    }
}
