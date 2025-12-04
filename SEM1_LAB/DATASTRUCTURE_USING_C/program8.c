#include<stdio.h>
#define INF 999
#define MAX 10

int main()
{
    int cost[MAX][MAX];
    int visited[MAX]={0};
    int edges=0;
    int n,i,j;
    int min,a=0,b=0;

    printf("\nenter number of vertices:");
    scanf("%d",&n);
    printf("\n enter the cost adjacency matrix of a graph(0 for no edges):");
    for(i=0;i<n;i++)
      for(j=0;j<n;j++)
    {
        scanf("%d",&cost[i][j]);
        if(cost[i][j]==0)
            cost[i][j]=INF;
    }

    visited[0]=1;
    printf("\nEdges in minimum spanning tree:\n");
    while(edges<n-1){
        min=INF;
    
    for(i=0;i<n;i++){
        if(visited[i]){
            for(j=0;j<n;j++){
                if(!visited[j] && cost[i][j]<min){
                    min=cost[i][j];
                    a=i;
                    b=j;
                }
            }
        }
    }
    printf("%d--%d cost=%d\n",a,b,min);
    visited[b]=1;
    edges++;

    }
    return 0;
}