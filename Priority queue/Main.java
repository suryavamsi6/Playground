#include<iostream>
using namespace std;
struct Node
{
  int data;
  struct Node *next;
};
Node *head = NULL;
Node *tail = NULL;
void insert(int newd)
{
  if(tail == NULL)
  {
    struct Node* new_node = new Node;
    new_node->data = newd;
    new_node->next = NULL;
    head = new_node;
    tail = new_node;
  }
  else
  {
    struct Node* new_node = new Node;
    new_node->data = newd;
    new_node->next = NULL;
    Node* ptr = head;
    while(ptr->next != NULL && ptr->next->data>newd)
    {
      ptr = ptr->next;
    }
    if(ptr==head && ptr->data<newd)
    {
      new_node->next = ptr;
      head = new_node;
    }
    else
    {
      new_node->next = ptr->next;
      ptr->next = new_node;
    }
    tail = new_node;
  }
}
    
int main()
{
 
  int num,n;
  num = 0;
  cout<<"Enter the number of values to be inserted:\n";
  cin>>n;
  cout<<"Enter the values to be inserted in priority queue:\n";
  for(int i =0;i<n;i++)
  { 
    cin>>num;
    insert(num);
  }
  cout<<"The priority queue elements are:\n";
  Node* ptr = head;
  while(ptr!= NULL)
  {
    cout<<ptr->data<<" ";
    ptr = ptr->next;
  }
  return 0;
}