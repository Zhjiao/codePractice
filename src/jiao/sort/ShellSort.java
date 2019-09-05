package jiao.sort;

public class ShellSort {
    public static void shellSort(int[]nums){
        for(int k=nums.length/2;k>0;k=k/2){
            for(int i=k;i<nums.length;i++){
                int pre=i-k;
                while(pre>=0&&nums[pre]>nums[pre+k]) {
                    int temp=nums[pre];
                    nums[pre]=nums[pre+k];
                    nums[pre+k]=temp;
                    pre=pre-k;
                }
            }
        }
    }
    public static void main(String[]args){
        int[]nums={1,5,3,7,9,3,4,2,0};
        shellSort(nums);
        for(int num:nums){
            System.out.print(num+" ");}
    }
}
