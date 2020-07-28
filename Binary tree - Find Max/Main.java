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
int height(node* node)  
{  
    if (node == NULL)  
        return 0;  
    else
    {  
        /* compute the height of each subtree */
        int lheight = height(node->left);  
        int rheight = height(node->right);  
  
        /* use the larger one */
        if (lheight > rheight)  
            return(lheight + 1);  
        else return(rheight + 1);  
    }  
}  
void inorder(struct node* Node)
{
	if(Node != NULL)
    {
      inorder(Node->left); 
      cout<<Node->key<<" "; 
      inorder(Node->right); 
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
int max(node* Node)
{
  if(Node->right == NULL)
    return Node->key;
  else
    max(Node->right);
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
  cout<<"Maximum element is "<<max(root);
  return 0;
}