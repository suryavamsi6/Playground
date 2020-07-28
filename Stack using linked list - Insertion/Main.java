#include<iostream>
using namespace std;
struct node
{
  int data;
  node *next;
};
node *head = NULL;
void insert(int newd)
{
  if(head==NULL)
  {
    node* new_node = new node;
    new_node->data = newd;
    new_node->next = NULL;
    head = new_node;
  }
  else
  {
    node* new_node = new node;
    new_node->data = newd;
    new_node->next = head;
    head = new_node;
  }
}

int main()
{
  int num;
  while(1)
  {
    cin>>num;
    if(num>=0)
   	 insert(num);
    else
      break;
  }
  node *ptr = head;
  while(ptr!=NULL)
  {
	cout<<ptr->data<<" ";
     ptr = ptr->next;
  }
  return 0;
}