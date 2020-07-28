#include <iostream>
#include <vector>
using namespace std;

int main() 
{
   // Try out your code here
  	int n,input;
   cout << "Enter the value to be assigned and how many times:\n";
  	cin>>input>>n;
  	if(n == 0)
    {
      cout<<"No value has been inserted";
      return 0;
    }
   
  	
  	vector<int> a;
  	a.assign(n,input);
  	cout<<"The assigned values are:\n";
  	for(auto i = a.begin();i != a.end();i++)
      cout<<*i<<" ";
  	cout << "\nEnter the number of values to be inserted:\n";
  	cin>>n;
   	for(int i =0;i<n;i++)
    {	
      	cout<<"Enter the value:\n";
		cin>>input;
      	a.push_back(input);
    }
    cout<<"The values are:\n";
  	for(auto i = a.begin();i != a.end();i++)
      cout<<*i<<" ";
  	int er = *(a.begin());
  	a.erase(a.begin());
  	cout<<"\nThe first element erased is "<<er<<endl;
  	cout<<"Enter the value to be inserted at the beginning:\n";
	cin>>input;
  	a.emplace(a.begin(),input);
  	cout<<"Enter the value to be inserted at the end:\n";
	cin>>input;
  	a.emplace_back(input);
  	for(auto i = a.begin();i != a.end();i++)
      cout<<*i<<" ";
    return 0;
}