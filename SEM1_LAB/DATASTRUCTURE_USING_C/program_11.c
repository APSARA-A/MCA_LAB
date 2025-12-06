#include <stdio.h>
#include<stdlib.h>
#define MAX 10

int parent[MAX];
int cost[MAX][MAX];

int find(int i)
{
    if(parent[i]!=i)
      i=parent[i];
    return i;
}

int union_set(int i, int j)
{
    if(i!=j)
    {
        parent[j]=i;
        return 1;
    }
    return 0;
}

int main()
{
    int n,i,j;
    int v1,v2,u,v;
    int edgecount=1;
    int c=0,mincost=0;

    printf("\n enter number of vertices:");
    scanf("%d", &n);

    printf("\nenter the cost adjacency matrix:\n");
    for(i=0;i<n;i++)
      for(j=0;j<n;j++)
            scanf("%d",&cost[i][j]);
        
        if(cost[i][j]==0)
           cost[i][j]=9999;

    for(i=0;i<n;i++)
        parent[i]=i;

     while(edgecount<n)
     {
        c=9999;
        for(i=0;i<n;i++)
          for(j=0;j<n;j++)
             if(cost[i][j]<c){
                c=cost[i][j];
                v1=i;
                v2=j;

            u=find(v1);
            v=find(v2);

            if (union_set(u,v))
            {
                printf("\nEdge %d:(%d -> %d) cost=%d\n",edgecount,v1,v2,c);
                edgecount++;
                mincost+=c;
            }
            cost[v1][v2]=cost[v2][v1]=9999;
             }
     }
     printf("\nminimum cost=%d\n",mincost);
     return 0;
         

}