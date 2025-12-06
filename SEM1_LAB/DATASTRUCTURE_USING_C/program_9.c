#include<stdio.h>
#include<stdlib.h>
#define MAX 100

int queue[MAX];
int front=-1, rear=-1;

void enqueue(int x)
{
    if(rear==MAX-1)return;
    if(front==-1)front=0;
    queue[++rear]=x;
}
int dequeue()
{
    if(front==-1 || front>rear)return -1;
    return queue[front++];
}

int main()
{
    int n,i,j,start;
    int adj[MAX][MAX];
    int visited[MAX]={0};
    printf("\nEnter number of vertices:");
    scanf("%d",&n);
    printf("\nEnter adjacency matrix:\n");
    for(i=0;i<n;i++)
       for(j=0;j<n;j++)
          scanf("%d",&adj[i][j]);

    printf("\n enter starting vertex(0 to %d):",n-1);
    scanf("%d",&start);
    printf("\n BFS TRAVERSAL:");
    visited[start]=1;
    enqueue(start);
    while(front!=-1 && front<=rear)
    {
        int node=dequeue();
        printf("%d",node);

        for(i=0;i<n;i++){
            if(adj[node][i]==1 && !visited[i])
            {
                visited[i]=1;
                enqueue(i);
            }
        }
    }
    return 0;
}