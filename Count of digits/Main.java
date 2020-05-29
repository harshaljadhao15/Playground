#include<iostream>
using namespace std;
int main()
{
  int no,i=0;
  cin>>no;
  do{
    no=no/10;
    i++;
  }while(no!=0);
    cout<<i;
    
}