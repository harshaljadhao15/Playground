#include<iostream>
using namespace std;
int main()
{
  int input,last_no,first_no,sum;
  cin>>input;
  last_no=input%10;
  first_no=input/1000;
  sum=last_no+first_no;
  cout<<sum;
}