#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  int count=0,k,z=0,a,no,c;
  k=n;
  c=n;
  while(n!=0)
  {
    n=n/10;
  	count++;
  }
  while(k!=0)
  {
    a=k%10;
    no=power(a,count);
    z=z+no;
    k=k/10;
  }
  if(c==z)
  {
    return 1;
  }
  else
  {
    return 0;
  }
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}