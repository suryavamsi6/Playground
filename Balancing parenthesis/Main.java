#include<iostream>
#include<string.h>
using namespace std;
int top=-1;
char stack[100];
int push(char num)
{
    top++;
    stack[top] = num;
    return 1;
}
char pop()
{
    char x = stack[top];
    top--;
    return x;
}
void display()
{
  if(top>=0)
  {
    for(int i=top;i>=0;i--)
    {
      cout<<stack[i];
    }
  }
	else
    {
      cout<<"Stack is empty";
    }
}
int main()
{
  char data,ret;
  char n[100];
  cin>>n;
  int len = strlen(n);
  for(int i = 0;i<len;i++)
  {
	if(n[i] == '{' || n[i] == '[' || n[i] == '(')
       push(n[i]);
    else
    {
      if(n[i] == '}')
      {
        ret = pop();
        if(ret!='{')
        {
          cout<<"Not Balanced";
          return 0;
        }
      }
     if(n[i] == ')')
      {
        ret = pop();
        if(ret!='(')
        {
          cout<<"Not Balanced";
         return 0;
        }
      }
     if(n[i] == ']')
      {
        ret = pop();
        if(ret!='[')
        {
          cout<<"Not Balanced";
         return 0;
        }
      }
    }
  }
    cout<<"Balanced";
  return 0;
}