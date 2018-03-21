package test;

import java.util.ArrayList;
import java.util.Collections;

public class JishuSort
{
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[] a = { 78, 17, 39, 26, 72, 94, 21, 12, 23, 68};
		
		//个位桶
		ArrayList<ArrayList<Integer>> Ge=new ArrayList<>();
		for(int i=0;i<10;i++){
			Ge.add(new ArrayList<Integer>());
		}
		//放进个位桶
		for(int i=0;i<a.length;i++){
			int mod=a[i]%10;
			Ge.get(mod).add(a[i]);
		}
		
		//出桶
		int i=0;
		for(ArrayList<Integer> everyGe:Ge){
			for(Integer k:everyGe){
				a[i]=k;
				i++;
			}
		}
		
		/*for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}*/
		//十位桶
		ArrayList<ArrayList<Integer>> Shi=new ArrayList<>();
		for(int j=0;j<10;j++){
			Shi.add(new ArrayList<Integer>());
		}
		//放进十位桶
		for(int j=0;j<a.length;j++){
			int mod=a[j]/10;
			Shi.get(mod).add(a[j]);
		}
		
		//出桶
		i=0;
		for(ArrayList<Integer> everyShi:Shi){
			for(Integer k:everyShi){
				a[i]=k;
				i++;
			}
		}
		
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
		}
		
		
	}

}
