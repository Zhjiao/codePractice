package jiao.sort;

public class SimpleSelectSort {

    public static void simpleSelectSort(int[]nums){
        for(int i=0;i<nums.length;i++) {
            int min=i;
            for(int j=i+1;j<nums.length;j++) {
                if(nums[j]<nums[min])
                    min=j;
            }
            if(min!=i) {
                int temp=nums[i];
                nums[i]=nums[min];
                nums[min]=temp;
            }
        }
    }
    public static void main(String[]args){
          int []nums={1,7,4,6,1,9,5,3,2};
//        int[]nums={9,8,7,6,5,4,3,2,1};
//        int[]nums={1,2,3,4,5,6,7,8,9};
//        int[]nums={2,2,2,2,1,1,1,1};
        simpleSelectSort(nums);
        for(int num:nums)
            System.out.print(num+" ");
    }
}
