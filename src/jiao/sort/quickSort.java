package jiao.sort;

public class quickSort {
    public void quickSort(int[]nums){
        quickSort(nums,0,nums.length-1);
    }
    private void quickSort(int[]nums,int start,int end){
        int i=start,j=end;
        if(start>end){
            return;
        }
        int key=nums[start];
        while(start<end){
            while (nums[end]>key &&start<end){
                end--;
            }
            nums[start]=nums[end];
            while (nums[start]<=key&&start<end){
                start++;
            }
            nums[end]=nums[start];
        }
        nums[start]=key;
        quickSort(nums,i,start-1);
        quickSort(nums,start+1,j);
    }
    public static void main(String[]args){

//        int []nums={1,7,4,6,1,9,5,3,2};
//        int[]nums={9,8,7,6,5,4,3,2,1};
//        int[]nums={1,2,3,4,5,6,7,8,9};
        int[]nums={2,2,2,2,1,1,1,1};
        quickSort q=new quickSort();
        q.quickSort(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }

    }
}

