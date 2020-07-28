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
  else if(Node->left == NULL)
    Node->left = insertbst(Node->left,newd);
  else if(Node->right == NULL)
    Node->right = insertbst(Node->right,newd);
  else
    insertbst(Node->left,newd);
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
int findDiameter(node* Node){
  if(Node==NULL)return 0;
  int lh=height(Node->left);
  int rh=height(Node->right);
  int ld=findDiameter(Node->left);
  int rd=findDiameter(Node->right);
  return max(lh+rh+1,max(ld,rd));
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
 cout<<"Diameter of the given binary tree is "<<findDiameter(root);
  return 0;
}