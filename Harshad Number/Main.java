#include<iostream>
using namespace std;
int main()
{
  int n,i,sum=0,a,b;
  cin>>n;
  b=n;
  for(;n!=0;)
  {
    	a=n%10;
    	sum=sum+a;
    	n=n/10;
  }
 // cout<<sum;
 if(b%sum==0)
   {
     cout<<"Harshad Number";
   }
  else{
  cout<<"Not Harshad Number";
  }
}