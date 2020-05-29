#include<iostream>
using namespace std;
int main()
{
  int tw,a,c,d;
  cin>>tw>>a>>c;
  d=a*75+c*30;
  if(tw>=d)
  {
    cout<<"Boat is stable";
  }
  else
    cout<<"Boat will drow";
  
  return 0;
  
}