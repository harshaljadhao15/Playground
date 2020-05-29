#include<iostream>
using namespace std;
int main()
{
  int m,n,req,a;
  cin>>m>>n>>req;
  a=m;
  for(int i=1;i<n;i++)
  {
    m=m*a;
  }
  if(m>=req)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
}