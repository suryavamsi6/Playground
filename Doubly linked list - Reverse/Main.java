#include<iostream>
using namespace std;
struct node
{
  int data;
  node *next,*prev;
};
node *head = NULL;
node *tail = NULL;
void insert(int newd)
{
  node *new_node = new node;
  new_node->data = newd;
  if(head==NULL)
  {
    head=new_node;
    head->next=NULL;
    head->prev=NULL;
    tail=new_node;
  }
  else
  {
	node *ptr = head;
    while(ptr->next!=NULL)
     ptr = ptr->next;
    ptr->next = new_node;
    new_node->prev = ptr;
    new_node->next = NULL;
    tail = new_node;
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
  cout<<"Original order:\n";
  display();
  cout<<"Reverse order:\n";
  node *ptr;
  ptr = tail;
  while(ptr!=NULL)
  {
    cout<<ptr->data<<endl;
    ptr=ptr->prev;
  }
  return 0;
}