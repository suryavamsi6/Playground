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
  if(head==NULL)
  {
    head = new_node;
    head->next = head;
  }
  else
  {
	node *ptr = head;
    while(ptr->next!=head)
     ptr = ptr->next;
    ptr->next = new_node;
    new_node->next = head;
  }
}
void display()
{
  node *ptr = head;
  do
  {
    cout<<ptr->data<<endl;
    ptr = ptr->next;
  }  while(ptr!=head);
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
  display();
  return 0;
}