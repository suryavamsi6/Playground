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
  new_node->next = NULL;
  new_node->prev = NULL;
  if(head==NULL)
  {
    head = new_node;
    tail = new_node;
  }
  else
  {
	node *ptr = head;
    while(ptr->next!=NULL)
     ptr = ptr->next;
    ptr->next = new_node;
    new_node->prev = ptr;
    tail = new_node;
  }
}
void searchsl(int n)
{
  node *ptr = tail;
  int i=1;
  while(ptr!=NULL)
  {
    if(i==n)
    {
      cout<<ptr->data<<" is the nth node element in the list";
      break;
    }
    ptr = ptr->prev;
    i++;
  } 
  if(ptr==NULL)
   cout<<"There is no nth node in the list";
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
  int n;
  cin>>n;
  cout<<"Enter the nth node:\n";
  searchsl(n);
  return 0;
}