#include<iostream>
using namespace std;
struct node 
{ 
    int key; 
    struct node *left, *right; 
};
node *root = NULL;
struct node* insertbst(struct node* Node,int newd)
{

  if(Node == NULL)
  {
    node *new_node = new node;
    new_node->key = newd;
    new_node->left = NULL;
    new_node->right = NULL;
 	return new_node;
  }
  else if(newd < Node->key)
    Node->left = insertbst(Node->left,newd);
  else
    Node->right = insertbst(Node->right,newd);
  return Node;
}
node *lca(node* Node, int n1, int n2)  
{  
    if (Node == NULL) return NULL;  
  
    // If both n1 and n2 are smaller 
    // than root, then LCA lies in left  
    if (Node->key > n1 && Node->key > n2)  
        return lca(Node->left, n1, n2);  
  
    // If both n1 and n2 are greater than  
    // root, then LCA lies in right  
    if (Node->key < n1 && Node->key < n2)  
        return lca(Node->right, n1, n2);  
  
    return Node;  
}  
int main()
{
  int data,n1,n2;
  node *t;
  cin>>data;
  root = insertbst(root,data);
  while(1)
  {
    cin>>data;
    if(data >= 0)
     insertbst(root,data);
    else
      break;
  }
  cout<<"Enter the value of n1 and n2:\n";
  cin>>n1>>n2;
  t=lca(root,n1,n2);
  cout<<"Common ancestor of "<<n1<<" and "<<n2<<" is "<<t->key;
  return 0;
}