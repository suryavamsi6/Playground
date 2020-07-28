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



void insertat(int pos, int newd)
{
  if(head==NULL)
  {
    node* new_node = new node;
    new_node->data = newd;
    new_node->next = NULL;
    head = new_node;
  }
  else{
  node *ptr = head;
  node *pre = NULL;
  for(int i=0 ; i<pos ; i++)
  {
    pre = ptr;
    ptr = ptr->next;
  }
  node* new_node = new node;
  new_node->data = newd;
  new_node->next = ptr;
  pre->next = new_node;
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
  cout<<"Before inserting:\n";
  node *ptr = head;
  while(ptr!=NULL)
  {
	cout<<ptr->data<<endl;
     ptr = ptr->next;
  }
  int pos,newd;
  cin>>pos>>newd;
  insertat(pos,newd);
  cout<<"Enter the value and position\nAfter inserting:\n";
  ptr = head;
  while(ptr!=NULL)
  {
	cout<<ptr->data<<endl;
     ptr = ptr->next;
  }
  return 0;
}