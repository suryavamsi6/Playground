#include<iostream>
#include<string.h>
using namespace std;
int adj[20][20],n,m;
char dir[5];
void displayMatrix(int v) {
   int i, j;
   for(i = 0; i < v; i++) {
      for(j = 0; j < v; j++) {
         cout << adj[i][j] << " ";
      }
      cout << endl;
   }
}
void add(int n1, int n2,int w)
{
  if(!strcmp(dir, "yes"))
  	adj[n1-1][n2-1] = w;
  else
  {
    adj[n1-1][n2-1] = w;
    adj[n2-1][n1-1] = w;
  }
}
int main()
{
  int n1,n2,w;
  cout<<"Please enter the number of nodes in the graph\n";
  cout<<"Please enter the number of edges in the graph\n";
  cin>>n>>m;
  cout<<"Is the graph directed\n";
  cin>>dir;
  cout<<"Adjacency Matrix Representation:\n";
  displayMatrix(n);
  for(int i=0;i<m;i++)
  {
    cout<<"Enter the start node, end node and weight of edge no "<<i+1<<endl;
    cin>>n1>>n2>>w;
    add(n1,n2,w);
  }
  cout<<"Adjacency Matrix Representation:\n";
  displayMatrix(n);
  return 0;
}