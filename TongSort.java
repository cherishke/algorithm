package test;

import java.util.ArrayList;
import java.util.Collections;

public class TongSort
{
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int[] a = { 78, 17, 39, 26, 72, 94, 21, 12, 23, 68};
		
		//求数组最大最小值
		int max=0,min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++){
			max=Math.max(max, a[i]);
			min=Math.min(min, a[i]);    
		}
		
		//求桶数
		int bucket=(max-min)/a.length+1;
		ArrayList<ArrayList<Integer>> bucketarr=new ArrayList<>();
		for(int i=0;i<bucket;i++){
			bucketarr.add(new ArrayList<Integer>());
		}
		
		//将每一个数分进各个桶中
		for(int i=0;i<a.length;i++){
			int num=(a[i]-min)/a.length;
			bucketarr.get(num).add(a[i]);
		}
		
		//给每个通进行排序
		for(ArrayList<Integer> everybucket:bucketarr){
			Collections.sort(everybucket);
		}
		
		for(int i=0;i<bucketarr.size();i++){
			for(Integer k:bucketarr.get(i)){
				System.out.println(k);
			}
		}
	}

}
