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
  cout<<"Before inserting the value:\n";
  node *ptr = head;
  while(ptr!=NULL)
  {
	cout<<ptr->data<<endl;
     ptr = ptr->next;
  }
  int pos,newd;
  cin>>pos>>newd;
  insertat(pos,newd);
  cout<<"Enter the position and value to be inserted:\nAfter inserting the value:\n";
  ptr = head;
  while(ptr!=NULL)
  {
	cout<<ptr->data<<endl;
     ptr = ptr->next;
  }
  return 0;
}