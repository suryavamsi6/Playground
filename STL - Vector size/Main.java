#include <iostream>
#include <vector>
using namespace std;

int main() 
{
   // Try out your code here
  	int n,input;
  	cin>>n;
  	if(n == 0)
    {
      return 0;
    }
  	
  	vector<int> a;
  	for(int i =0;i<n;i++)
    {	
		cin>>input;
      	a.push_back(input);
    }
    return 0;
}