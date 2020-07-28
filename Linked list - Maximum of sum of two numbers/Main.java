#include<iostream>
#include <bits/stdc++.h>
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
void max()
{
  node *ptr = head;
  node *ptr2 ;
  int sum = 0;
  while(ptr!=NULL)
  {
    ptr2 = ptr->next;
    while(ptr2!=NULL)
    {
      if(sum < (ptr->data + ptr2->data))
        sum = ptr->data + ptr2->data;
      ptr2 = ptr2->next;
    }
    ptr = ptr->next;
  } 
  cout<<sum;
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
  max();
  return 0;
}