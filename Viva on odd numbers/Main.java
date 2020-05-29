#include<iostream>
using namespace std;
int main()
{
  //cin>>n
  int i,n;
  float marks=0;
    for(i=1;i<=3;i++)
    {
      cin>>n;
      if(n>=1)
      {
        if(n==1||n%2!=0)
        {
          marks++;
        }
        else
        {
          marks=marks-0.5;
          i--;
        }
        
      }
      else{
        marks=marks-1;
      break;
      }
    }
  cout<<marks;
}