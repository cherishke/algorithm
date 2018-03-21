package dijkstra;

public class dijkstra
{
	private static int N = 1000;
    private static int[][] Graph = {
            { 0, N, 10, N, 30, 100 },
            { N, 0, 5, N, N, N },
            { N, N, 0, 50, N, N },
            { N, N, N, 0, N, 10 },
            { N, N, N, 20, 0, 60 },
            { N, N, N, N, 3, 0 } };
    
    public static void main(String[] args)
	{
		dijkstra(0,Graph);
	}
    
    public static void dijkstra(int start,int[][] graph){
    	int nodenum=graph[0].length;   //节点个数
    	int[] mindist=new int[nodenum];   //最短路径数组
    	boolean[] findflag=new boolean[nodenum];   //是否visit
    	
    	for(int i=0;i<nodenum;i++){    //初始化flag和最短路径数组
    		findflag[i]=false;
    		mindist[i]=graph[start][i];
    	}
    	
    	findflag[start]=true;  //修改start flag状态为true
    	int min=N;
    	int next=0;
    	for(int i=1;i<nodenum;i++){
    		
    		for(int j=0;j<nodenum;j++){    //寻找flag为false的最小值
	    		if((!findflag[j])&&(mindist[j]<min)){
	    			min=mindist[j];
	    			next=j;
	    		}
    		}
    
    		findflag[next]=true;
    		for(int k=0;k<nodenum;k++){   //更新最小值
    			if((!findflag[k])&&(min+graph[next][k])<mindist[k]){
    				mindist[k]=min+graph[next][k];
    			}
    		}
    		min=N;
    	}
    	
    	for(int i=0;i<nodenum;i++){
    		System.out.println(mindist[i]);
    	}
    	
    	
    	
    }
}
