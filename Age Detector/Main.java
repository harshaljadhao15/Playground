#include<iostream>
using namespace std;

int main()
{
  int a,b;
  cin>>a>>b;
  if(b==00)
  {
      b=100;
  }
  
  if(a>b)
  {
      b=b+100;
      cout<<-(a-b);
      
  }
  else
  {
      cout<<-(a-b);
  }
}