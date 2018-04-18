public class Floyd {
    private int edgenum;
    private char[] vertex;
    private int[][] matrix;
    private static final int INF=Integer.MAX_VALUE;

    public void floyd(){
        //初始化
        int[][] path =new int[vertex.length][vertex.length];   //存储定点之间最短路径经过的点
        int[][] dist=new int[vertex.length][vertex.length];   //各点之间最短路径值
        for(int i=0;i<vertex.length;i++)
            for(int j=0;j<vertex.length;j++){
                dist[i][j]=matrix[i][j];
                path[i][j]=j;
            }

        //计算最短路径
        for(int k=0;k<matrix.length;k++)   //k只循环一次
            for(int i=0;i<matrix.length;i++)   //i为行
                for(int j=0;j<matrix.length;j++){   //j为列
                    int tmp=(dist[i][k]==INF||dist[k][j]==INF)?INF:(dist[i][k]+dist[k][j]);
                    if(dist[i][j]>tmp){
                        dist[i][j]=tmp;
                        path[i][j]=path[i][k];
                    }
                }

        System.out.println("floyd:");
        System.out.printf("floyd: \n");
        for (int i = 0; i < mVexs.length; i++) {
            for (int j = 0; j < mVexs.length; j++)
                System.out.printf("%2d  ", dist[i][j]);
            System.out.println();
    }

}
