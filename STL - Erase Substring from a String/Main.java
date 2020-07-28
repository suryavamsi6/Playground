#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str1;
  int n,m;
  cout<<"Enter the input string:\n";
  getline(cin,str1);
  cout<<"Position after which substring to be erased:\n";
  cin>>n;
  cout<<"Length of substring to delete:\n";
  cin>>m;
  str1.erase(n,m);
  cout<<str1;
  return 0;
}