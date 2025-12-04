#include<stdio.h>
#include<stdlib.h>
#define MAX 100

int parent[MAX];
int n;

void make_set(int n)
{
    for(int i=0;i<n;i++)
    {
        parent[i]=i;
    }
}

int find_set(int x)
{
    if(parent[x]==x)
      return x;
   
return find_set(parent[x]);
    
}

void union_set(int a, int b)
{
    int rootA=find_set(a);
    int rootB=find_set(b);
    if(rootA==rootB)
    {
        printf("They already in same set");
    }
    else
    {
        parent[rootB]=rootA;
        printf("\nUnion Done");
    }
}

void display()
{
    printf("\nParent array");
    for(int i=0;i<n;i++)
    {
        printf("\nParent[%d]=%d",i,parent[i]);
    }
}

int main()
{
    int choice, a,b,x;
    printf("\nenter number of elemnts:");
    scanf("%d",&n);

    make_set(n);

    printf("\n Disjoint Set Operations");
    printf("\n1.Union \n2.Find \n3.Display parent \n4.exit");
    while(1){
        printf("\n enter your choice:");
        scanf("%d",&choice);

        switch(choice)
        {
            case 1:
            printf("\n enter two element to perform union operation:");
            scanf("%d %d",&a,&b);
            union_set(a,b);
            break;

            case 2:
            printf("\n enter element to find parent:");
            scanf("%d",&x);
            printf("\n parent of %d is %d:",x,find_set(x));
            break;

            case 3:
            display();
            break;

            case 4:
            exit(0);

            default:
            printf("\n enter valid choice");


        }

    }
    return 0;
}