package jiao.sort;

public class PuppleSort {
    public static void puppleSort(int []nums){
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=1;j<nums.length-i;j++){
                if(nums[j-1]>nums[j])
                {
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                    count++;
                }
            }
            if(count==0)
                break;
        }
    }
    public static void main(String[]args){
//       int []nums={1,7,4,6,1,9,5,3,2};
//        int[]nums={9,8,7,6,5,4,3,2,1};
//        int[]nums={1,2,3,4,5,6,7,8,9};
        int[]nums={2,2,2,2,1,1,1,1};
        puppleSort(nums);
        for(int num:nums)
            System.out.print(num+" ");
    }
}
