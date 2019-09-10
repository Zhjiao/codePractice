package jiao.sort;

//堆定义：任一父亲节点大于其左右孩子节点，左孩子节点2*i+1,右孩子节点2*i+2

public class HeapSort {
    public static void heapSort(int[]nums){
        for(int i=nums.length-1;i>0;i--){
            heapAdjust(nums,i);//调整为堆，堆顶元素为当前待排序元素的最大值
            swap(nums,0,i);//将其与末尾元素进行交换，再将剩下的元素调整为堆，再交换，
            for(int num:nums)
                 System.out.print(num+" ");
            System.out.println();
        }
    }
    private static void heapAdjust(int[]nums,int end){
        for(int i=(end-1)/2;i>=0;i--) {
            int child = 2 * i + 1;
            if (child + 1 <= end && nums[child] < nums[child + 1]) {
                child = child + 1;
            }
            if (nums[child] > nums[i]) {
               swap(nums,child,i);
            }
        }
    }
    private static void swap(int[]nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[]args){
        int[]nums={1,3,5,2,0,9,6,8,2};
        heapSort(nums);
        for(int num:nums)
            System.out.print(num+" ");
    }
}
