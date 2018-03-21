package test;

public class XiErSort
{
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a[] = { 51, 46, 20, 18, 65, 97, 82, 30, 77, 50 };
		
		for(int gap=a.length/2;gap>=1;gap=gap/2){
			for(int i=gap;i<a.length;i++){
				for(int j=i-gap;j>=0&&a[j]>a[j+gap];j=j-gap){
					int temp=a[j+gap];
					a[j+gap]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
	}

}
