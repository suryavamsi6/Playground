#include<iostream>
using namespace std;
int n,stack[100],top=-1;
int push(int num)
{
  if(top == n-1)
  {
    cout<<"Stack Overflow";
    return -1;
  }
  else
  {
    top++;
    stack[top] = num;
    return 1;
  }
}
void display()
{
  if(top>=0)
  {
    cout<<"Stack elements are:\n";
    for(int i=top;i>=0;i--)
    {
      cout<<stack[i]<<" ";
    }
  }
	else
    {
      cout<<"Stack is empty";
    }
}
int main()
{
  int data=0,ret;
  cin>>n;
  while(1)
  {
    cin>>data;
    if(data!=stack[top])
     ret = push(data);
    else
      break;
    if(ret == -1)
    {
      break;
    }
    
  }
  if(ret != -1)
    display();
  return 0;
}