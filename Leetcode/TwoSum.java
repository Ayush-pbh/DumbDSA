class Solution {
    // public int[] twoSum(int[] nums, int target) {
        
    //     for (int i = 0; i < nums.length; i++) {
    //         for (int j = 0; j < nums.length; j++) {
    //             if(nums[i] + nums[j] == target){
    //                 int[] result = {i,j};
    //                 return result;
    //             }
    //         }
    //     }
    // }

    public static void main(String[] args) {
        int nums[] = {3,2,4};
        int target = 6;
        int[] result = {0,0};

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    result[0] =i;
                    result[1] =j;
                    System.out.println("Testing Found"+i+", "+j);
        
                    
                }
                System.out.println("Testing "+i+", "+j);
            }
        }

        System.out.println("Outout : "+result[0]+","+result[1]);

    }
}