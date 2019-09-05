package jiao.sort;

public class MergeSort {
    public  void mergeSort(int[]nums){
        mergeSort(nums,0,nums.length-1);
    }
    private void mergeSort(int[]nums,int start,int end){
        if(start>=end)
            return;
        int middle=(start+end)/2;
        mergeSort(nums,start,middle);
        mergeSort(nums,middle+1,end);
        merge(nums,start,middle,end);
    }
    private void merge(int []nums,int start,int middle,int end){
        int []temp=new int[end-start+1];
        int i=start,j=middle+1,k=0;
        for(;i<=middle&&j<=end;){
            if(nums[i]<=nums[j])
                temp[k++]=nums[i++];
            if(nums[i]>nums[j])
                temp[k++]=nums[j++];
        }
        while (i<=middle)
            temp[k++]=nums[i++];
        while (j<=end)
            temp[k++]=nums[j++];
        for(int m=0,n=start;m<k;m++,n++)
            nums[n]=temp[m];
    }

    public static void main(String[]args){
//        int []nums={1,7,4,6,1,9,5,3,2};
//        int[]nums={9,8,7,6,5,4,3,2,1};
        int[]nums={1,2,3,4,5,6,7,8,9,0};
//        int[]nums={2,2,2,2,1,1,1,1};
        MergeSort m=new MergeSort();
        m.mergeSort(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
