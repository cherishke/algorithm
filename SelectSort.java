package test;

public class SelectSort
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int temp=0;
		int[] array={3,18,2,5,12,9,11};
		for(int i=0;i<array.length-1;i++){
			//int flag=0;
			int min=array[i];
			int index=i;
			for(int j=i+1;j<array.length;j++){
				if(array[j]<min){
					index=j;
					min=array[j];
				}
			}
			temp=array[index];
			array[index]=array[i];
			array[i]=temp;
		}
			
		for(int k=0;k<array.length;k++){
			System.out.println(array[k]);
		}
	}

}
