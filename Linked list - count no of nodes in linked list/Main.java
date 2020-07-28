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
void display()
{
  node *ptr = head;
 while(ptr!=NULL)
  {
    cout<<ptr->data<<" ";
    ptr = ptr->next;
  }  
}

void count()
{
  node *ptr = head;
 int i=0;
  while(ptr!=NULL)
  {
    ptr = ptr->next;
    i++;
  } 
  cout<<"There are "<<i<<" values present in the list and the values are\n";
  display();
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
  count();
  return 0;
}