package test;

public class InsertSort
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[] array={3,18,2,5,12,9,11};
		for(int i=1;i<array.length;i++){
			int pre=i-1;
			int now=array[i];
			while(pre>=0&&array[pre]>now){
				array[pre+1]=array[pre];
				pre--;
			}
				array[pre+1]=now;
			}
		
		
		for(int k=0;k<array.length;k++){
			System.out.println(array[k]);
		}
	}

}
