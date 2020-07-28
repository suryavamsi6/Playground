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

void display()
{
 
  node *ptr = head;
  while(ptr!=NULL)
  {
	cout<<ptr->data<<endl;
     ptr = ptr->next;
  }
  
}
void removeDuplicates(struct node *start) 
{ 
    struct node *ptr1, *ptr2, *dup; 
    ptr1 = start; 
  
    /* Pick elements one by one */
    while (ptr1 != NULL && ptr1->next != NULL) 
    { 
        ptr2 = ptr1; 
  
        /* Compare the picked element with rest 
           of the elements */
        while (ptr2->next != NULL) 
        { 
            /* If duplicate then delete it */
            if (ptr1->data == ptr2->next->data) 
            { 
                /* sequence of steps is important here */
                dup = ptr2->next; 
                ptr2->next = ptr2->next->next; 
                delete(dup); 
            } 
            else /* This is tricky */
                ptr2 = ptr2->next; 
        } 
        ptr1 = ptr1->next; 
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
  cout<<"Linked list before removal of duplicates\n";
  display();
  cout<<"Linked list after removal of duplicates\n";
  removeDuplicates(head); 
  display();
  return 0;
}