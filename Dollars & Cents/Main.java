#include<iostream>
using namespace std;
int main()
{
	int n1,c1,n2,c2,c_s,n_s,carr;
  	cin>>n1>>c1>>n2>>c2;
  	n_s=n1+n2;
  	c_s=c1+c2;
  	if(c_s>=100)
    {
      carr=c_s-100;
      
      n_s=n_s+1;
            
      cout<<n_s<<endl;
  	cout<<carr;

    }
  	else{
  	cout<<n_s<<endl;
  	cout<<c_s;
    }
  
  
}