#include<iostream>
using namespace std;
struct node
{
  int data;
  node *next,*prev;
};
node *head = NULL;
void insert(int newd)
{
  node *new_node = new node;
  new_node->data = newd;
  if(head==NULL)
  {
    head=new_node;
    head->next=NULL;
    head->prev=NULL;
  }
  else
  {
	node *ptr = head;
    while(ptr->next!=NULL)
     ptr = ptr->next;
    ptr->next = new_node;
    new_node->prev = ptr;
    new_node->next = NULL;
  }
}
void display()
{
  node *ptr = head;
  while(ptr!=NULL)
  {
    cout<<ptr->data<<endl;
    ptr = ptr->next;
  }
}
int main()
{
  int num;
  while(1)
  {
    cin>>num;
    if(num<0)
      break;
    else
      insert(num);
  }
  display();
  return 0;
}