#include<iostream>
using namespace std;

int main()
{
  int a,n,i,sum=6;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    cout<<sum<<" ";
    sum=sum+(5*i);
    //cout<<sum<<" ";
  }
}