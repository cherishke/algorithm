package test;

public class MergeSort
{
	public static void merge(int[] a,int low,int mid,int high)
	{
		int[] temp=new int[high-low+1];
		int i=low;
		int j=mid+1;
		int k=0;
		// 把较小的数先移到新数组中
		while(i<=mid&&j<=high){
			if(a[i]<a[j]){
				temp[k++]=a[i++];
			}else{
				temp[k++]=a[j++];
			}
		}
		//把两边剩余的加入新数组
		while(i<=mid){
			temp[k++]=a[i++];
		}
		while(j<=high){
			temp[k++]=a[j++];
		}
		
		for(int k2=0;k2<temp.length;k2++){
			a[k2+low]=temp[k2];
		}
	}
	
	public static void mergeSort(int[] a,int low,int high){
		int mid=(low+high)/2;
		if(low<high){
			mergeSort(a, low, mid);
			mergeSort(a, mid+1, high);
			merge(a, low, mid, high);
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
		mergeSort(a, 0, a.length-1);
		
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
	}

}
