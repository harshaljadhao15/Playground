#include<iostream>
using namespace std;
int main()
{
  int r,c,i;
    cin>>r>>c>>i;
  if(i<=c)
    cout<<"Yes";
  else if(i%c==0)
        cout<<"Yes";
   else if((i-1)%c==0)
         cout<<"Yes";
     else
           cout<<"No";
}