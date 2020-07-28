#include<iostream>
using namespace std;
struct node
{
  int data;
  node *next;
};
node *head = NULL;
node *head2 = NULL;
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
void insertb(int newd)
{
  if(head2==NULL)
  {
    node* new_node = new node;
    new_node->data = newd;
    new_node->next = NULL;
    head2 = new_node;
  }
  else
  {
    node* new_node = new node;
    new_node->data = newd;
    new_node->next = head2;
    head2 = new_node;
 }
}

void display()
{
 
  node *ptr = head;
  while(ptr!=NULL)
  {
	cout<<ptr->data<<" ";
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
  if(head == NULL)
  { 
    cout<<"Queue is empty";
   	return 0;
  }
  cout<<"Before reversing:\n";
  display();
  cout<<"\nAfter reversing:\n";
  node *ptr = head;
  while(ptr!=NULL)
  {
    insertb(ptr->data);
    ptr=ptr->next;
  }
  ptr = head2;
  while(ptr!=NULL)
  {
	cout<<ptr->data<<" ";
     ptr = ptr->next;
  }
  return 0;
}