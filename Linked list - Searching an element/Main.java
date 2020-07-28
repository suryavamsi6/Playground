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
  }
  else
  {
	node *ptr = head;
    while(ptr->next!=NULL)
     ptr = ptr->next;
    ptr->next = new_node;
    new_node->next = NULL;
  }
}
void search(int val)
{
  node *ptr = head;
  int flag=0;
  while(ptr!=NULL)
  {
    if(ptr->data == val)
      flag++;
    ptr = ptr->next;
  }  
  if(flag)
    cout<<val<<" is present in the list";
  else
    cout<<val<<" is not present in the list";
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
  int val;
  cin>>val;
  cout<<"Enter the value to be searched:\n";
  search(val);
  return 0;
}