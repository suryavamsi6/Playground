// A simple representation of graph using STL 
#include<bits/stdc++.h> 
using namespace std; 

// A utility function to add an edge in an 
// undirected graph. 
void addEdge(vector<int> adj[], int u, int v) 
{ 
	adj[u].push_back(v); 
	adj[v].push_back(u); 
} 

// A utility function to print the adjacency list 
// representation of graph 
void printGraph(vector<int> adj[], int V) 
{ 
	for (int v = 0; v < V; ++v) 
	{ 
		cout<< v << "--->"; 
		for (auto x : adj[v]) 
		cout<< x<<" "; 
		printf("\n"); 
	} 
} 

// Driver code 
int main() 
{ 
	int V,e ; 
  int n1,n2;
	vector<int> adj[10]; 
	cout<<"Enter the number of vertices:"<<endl;
  	cout<<"Enter the number of edges:"<<endl;
  	cin>>V>>e;
  for(int i =0;i<e;i++)
  {
    cout<<"Enter the Start node and End node of edge "<<i+1<<endl;
    cin>>n1>>n2;
    addEdge(adj, n1, n2);
  }
  cout<<"Adjacency List:\n";
   printGraph(adj, V);
	return 0; 
} 
