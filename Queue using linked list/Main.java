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
    while(ptr->next != NULL)
    {
      ptr = ptr->next;
    }
    ptr->next = new_node;
    tail = new_node;
  }
}
    
int main()
{
 
  int num;
  num = 0;
  cin>>num;
  while(num>=0)
  {
    insert(num);
    cin>>num;
  }
  Node* ptr = head;
  while(ptr!= NULL)
  {
    cout<<ptr->data<<" ";
    ptr = ptr->next;
  }
  return 0;
}