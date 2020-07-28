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
  node *new_node = new node;
  new_node->data = newd;
  new_node->next = NULL;
  if(head==NULL)
  {
    head = new_node;
  }
  else
  {
	node *ptr = head;
    while(ptr->next!=NULL)
     ptr = ptr->next;
    ptr->next = new_node;
  }
}
void searchsl()
{
  node *ptr = head;
  node *pre = NULL;
  while(ptr->next!=NULL)
  {
    pre = ptr;
    ptr = ptr->next;
  } 
  if(pre!=NULL)
   cout<<pre->data<<" is the second last element in the list";
  else
   cout<<"There is no second last element in the list";
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
  searchsl();
  return 0;
}