#include<iostream>
using namespace std;
int main()
{
  int n,i,sum=11;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    cout<<sum*sum<<" ";
    sum=sum+4;
    
  }
}