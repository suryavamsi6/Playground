#include<iostream>
using namespace std;
struct node 
{ 
    int key; 
    struct node *left, *right; 
};
node *root = NULL;
int arr[100];
int i=0;
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
      arr[i] = Node->key;
      i++;
      inorder(Node->right); 
    }
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
    {
      insertbst(root,data);
    }
    else
      break;
  }
  cout<<"Enter the kth value:\n";
  cin>>data;
  inorder(root);
  cout<<"Smallest kth value "<<arr[data-1];
  return 0;
}