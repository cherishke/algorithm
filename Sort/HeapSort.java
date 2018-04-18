import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr){
        //构建大顶堆
        for(int i=arr.length/2-1;i>=0;i--){
            //从最后一个非叶子节点调整
            adjustHeap(arr,i,arr.length);
        }
        //调整堆结构，交换堆顶元素与末尾元素
        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);//将顶元素与末尾元素进行交换
            adjustHeap(arr,0,j);   //重新对堆进行调整
        }
    }

    public static void adjustHeap(int[] arr,int i,int length){
        int temp=arr[i];   //先取出当前元素
        for(int k=i*2+1;k<length;k=k*2+1){     //从i节点的左子节点开始，2i+1开始
            if(k+1<length&&arr[k+1]>arr[k]){   //如果左子节点小于右子节点，k指向右节点
                k++;
            }
            if(arr[k]>temp){    //如果子节点大宇父节点，将子节点值付给父节点（不交换），还需要往下面的子数继续判断
                arr[i]=arr[k];
                i=k;
            }else{
                break;
            }
        }
        arr[i]=temp;
    }

    public static void swap(int[] arr,int first,int j){
        int temp=arr[first];
        arr[first]=arr[j];
        arr[j]=temp;
    }


}
