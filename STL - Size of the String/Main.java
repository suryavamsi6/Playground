#include<iostream>
using namespace std;
int main()
{
  string str1,str2;
  cout<<"Enter the input string:\n";
  getline(cin,str1);
  int n = str1.size();
  cout<<"Size of the string: "<<n;
  return 0;
}