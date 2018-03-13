package test;

public class Maopao
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int temp=0;
		int[] array={3,18,2,5,12,9,11};
		for(int i=0;i<array.length;i++){
			int flag=0;
			for(int j=0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
					flag=1;
				}
			}
			if(flag==0)
				break;
		}
		for(int k=0;k<array.length;k++){
			System.out.println(array[k]);
		}
	}

}