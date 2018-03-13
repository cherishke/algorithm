package test;

public class QuickSort
{
	
	public static void QuickSort(int[] a,int low,int high){
		int left=low;
		int right=high;
	    int pivot=0;
	    if(left<=right){
	    	pivot=a[left];
	    	while(left!=right){
	    		while(left<right&&a[right]>=pivot)    //如果right大于pivot，正常，right指针向前减1
	    			right--; 
	    		a[left]=a[right];  //如right小于pivot，把right值给left
	    		while (left<right&&a[left]<=pivot)    //如果left小于pivot，正常，left指针向后加1
	    			left++;
	    		a[right]=a[left];    //如left大于pivot，把left值给right
	    	}
	    	a[right]=pivot;          //此时left和right已经为同一个地方，把pivot给他
	    	QuickSort(a, low, right-1);
	    	QuickSort(a, right+1, high);
	    }
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
		
		QuickSort(a,0,9);
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
	}

}
