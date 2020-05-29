#include<iostream>
using namespace std;
int main()
{
  int f_am,f_dis,f_sc,s_am,s_dis,s_sc,a_am,a_dis,a_sc,f_fp,s_fp,a_fp;
  cin>>f_am>>f_dis>>f_sc>>s_am>>s_dis>>s_sc>>a_am>>a_dis>>a_sc;
  f_fp=((f_am*(100-f_dis))/100)+f_sc;
  s_fp=((s_am*(100-s_dis))/100)+s_sc;
  a_fp=((a_am*(100-a_dis))/100)+a_sc;
  cout<<"In Flipkart Rs."<<f_fp<<endl;
   cout<<"In Snapdeal Rs."<<s_fp<<endl;
   cout<<"In Amazon Rs."<<a_fp<<endl;
  if(f_fp<=s_fp&&f_fp<=a_fp)
    cout<<"He will prefer Flipkart";
  else if(s_fp<f_fp&&s_fp<a_fp)
    cout<<"He will prefer Snapdeal";
   else if(a_fp<f_fp&&a_fp<s_fp)
    cout<<"He will prefer Amazon";
}