package test;

public class CountingSort
{
	public static int[] countingSort(int[] a,int min,int max)
	{
		int length=a.length;
		int[] total=new int[max+1];
		int[] result=new int[length];
		for(int m=0;m<max+1;m++){
			total[m]=0;
		}
		for(int i=0;i<length;i++){
			total[a[i]]++;
		}
		int k=0;
		int num=0;
		for(int j=0;j<max+1;j++){
			for(k=0;k<total[j];k++){
				result[num++]=j;
			}
		}
		return result;
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[] a = { 2, 5, 3, 0, 2, 3, 0, 3 };
		int[] result=countingSort(a,0,5);
		
		
		for(int k=0;k<a.length;k++){
			System.out.println(result[k]);
		}
	}

}
