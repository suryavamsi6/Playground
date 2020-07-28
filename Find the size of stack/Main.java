#include<iostream>
using namespace std;
struct node
{
  long data;
  node *next;
};
node *head = NULL;
void push(long newd)
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
    new_node->next = head;
  	head = new_node;
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
  cout<<endl;
  
}

int main()
{
  long num;
  int sum=0;
  while(1)
  {
    cin>>num;
    if(num>=0)
    {
      push(num);
      sum = sum + sizeof(num);

    }
    else
      break;
  }
  
  cout<<sum;
  return 0;
}