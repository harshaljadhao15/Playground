#include<iostream>
using namespace std;
int main()
{
  float a,sum=0.5;
  int n,i;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    cout<<sum<<" ";
    sum=sum*3;
  }
}