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
    node *ptr=head;
    node* new_node = new node;
    new_node->data = newd;
    new_node->next = NULL;
    while(ptr->next!=NULL)
    {
      ptr=ptr->next;
    }
    ptr->next=new_node;
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
    if(num>=0)
   	 insert(num);
    else
      break;
  }
  cout<<"Before deletion:\n";
  display();
  int i=1;
  node *ptr2, *pre;
  while(1)
  {
    ptr2 = head;
    while(ptr2->next!=NULL)
    {
      pre = ptr2;
      ptr2 = ptr2->next;
    }
    if(ptr2==head)
      head = NULL;
    else
     pre->next = NULL;
    cout<<"After "<<i<<" deletion:\n";
    if(head==NULL)
    {
      cout<<"No value to delete";
      break;
    }
    display();
    i++;
  }
  return 0;
}