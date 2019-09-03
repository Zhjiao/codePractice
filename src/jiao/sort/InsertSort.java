package jiao.sort;

public class InsertSort {
    public static void insertSort(int []nums){
      for(int i=1;i<nums.length;i++)
      {
          int key=nums[i];
          int pre=i-1;
          while (pre>=0&&key<nums[pre]){
              nums[pre+1]=nums[pre];
              pre--;
          }
          nums[pre+1]=key;
      }
    }
    public static void  main(String[]args){
//        int []nums={1,7,4,6,1,9,5,3,2};
//        int[]nums={9,8,7,6,5,4,3,2,1};
//        int[]nums={1,2,3,4,5,6,7,8,9};
       int[]nums={2,2,2,2,1,1,1,1};
       insertSort(nums);
       for(int num:nums)
           System.out.print(num+" ");
    }
}
