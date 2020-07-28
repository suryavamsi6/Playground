#include<iostream>
using namespace std;
int front = -1, rear = -1, queue[100],n;
void insert()
{
  int data;
  if(rear == n-1)
    cout<<"Queue Overflow";
  else
  {
    if(front == -1)
      front = 0;
    rear++;
    cout<<"Insert the element in queue :\n";
    cin>>data;
    queue[rear] = data;
  }
}
void display()
{ 
  if (front == - 1)
   cout<<"Queue is empty"<<endl;
  else
  {
   cout<<"Queue elements are :\n";
   for(int i=front; i<=rear ; i++)
     cout<<queue[i]<<" ";
  }
}
int main()
{
 cin>>n;
 for(int i = 0;i < n;i++)
  insert();
 display();
 return 0;
}