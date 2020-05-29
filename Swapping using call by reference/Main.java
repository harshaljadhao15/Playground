#include<iostream>
using namespace std;
void swap(int &no1,int &no2)
{
  int temp=0;
  temp=no1;
  no1=no2;
  no2=temp;
}
int main()
{
  int a,b;
  cin>>a>>b;
    cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
    cout<<"After swapping a= "<<a<<" and b="<<b;
  return 0;
}