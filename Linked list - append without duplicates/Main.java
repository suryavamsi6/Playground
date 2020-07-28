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
  int flag = 0;
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
    {
        if(ptr->data == new_node->data)
        {
          flag++;
          break;
        }
      ptr = ptr->next;
     }
    if(flag == 0 && ptr->data != new_node->data)
    {
      ptr->next = new_node;
    }
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
  display();
  return 0;
}