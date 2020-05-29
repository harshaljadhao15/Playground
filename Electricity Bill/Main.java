#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a;
  b=a*0.5;
  if(a<=200)
  {
    cout<<"Rs."<<b;
  }
  else if(a<=400)
  {
    cout<<"Rs."<<(a*0.65)+100;
  }
  else if(a<=600)
  {
    cout<<"Rs."<<(a*0.80)+200;
  }
  else if(a<=400)
  {
    cout<<"Rs."<<(a*1.25)+425;
  }
  
  return 0;
}