#include<stdio.h>
#include<stdlib.h>
#define MAX 100

int stack[MAX];
int top=-1;

void push(int x)
{
    stack[++top]=x;
}

int pop()
{
    if(top==-1)
      return -1;

    return stack[top--];
}

int main()
{
    int n,i,j,start;
    int adj[MAX][MAX];
    int visited[MAX];
    printf("\nEnter number of vertices:");
    scanf("%d",&n);
    printf("\nEnter adjacency matrix:");
    for(i=0;i<n;i++)
      for(j=0;j<n;j++)
        scanf("%d",&adj[i][j]);

    for(i=0;i<n;i++)
      visited[i]=0;

    printf("\nEnter starting vertex(0 to %d):",n-1);
    scanf("%d",&start);

    printf("\nDFS TRAVERSAL:");
    push(start);

    while(top!=-1){
        int node=pop();

        if(!visited[node]){
            visited[node]=1;
            printf("%d ",node);

        for(i=n-1;i>=0;i--){
            if(adj[node][i]==1  && !visited[i]){
                push(i);
            }
        }
        }
    }
    return 0;
}