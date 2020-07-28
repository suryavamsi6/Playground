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

void postorder(struct node* Node)
{
	if(Node != NULL)
    {
      postorder(Node->left); 
      postorder(Node->right); 
      cout<<Node->key<<" "; 
      
    }
}
bool searchbst(struct node* Node,int data)
{
  if(Node == NULL)
    return false;
  else if(data == Node->key)
    return true;
  else if(data < Node->key)
    searchbst(Node->left,data);
  else
    searchbst(Node->right,data);
}
int main()
{
  int data;
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
  cout<<"Post order Traversal:\n";
  postorder(root);
  return 0;
}