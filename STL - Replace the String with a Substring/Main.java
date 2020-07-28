#include<iostream>
using namespace std;
int main()
{
  string str1,str2;
  cout<<"Enter the input string:\n";
  getline(cin,str1);
  cout<<"Enter the substring to be inserted:\n";
  getline(cin,str2);
  cout<<"Enter the start position of substring:\n";
  int n,m;
  cin>>n>>m;
  str1.replace(n,m,str2);
  cout<<str1;
  return 0;
}