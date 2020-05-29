#include<iostream>
using namespace std;
 int main()
 {
   int no1,no2,c;
   cout<<"Enter first number : Enter second number : Menu\n";
   cout<<"1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
   cin>>no1>>no2>>c;
   //cout<<"Enter first number : Enter second number : Menu";
   switch(c)
   {
     case 1: cout<<no1+no2;
       break;
     case 2: cout<<no1-no2;
       break;
     case 3: cout<<no1*no2;
       break;
     case 4: cout<<no1/no2;
       break;
     case 5: cout<<no1%no2;
       break;
     default: cout<<"Invalid operation";
       break;
   }
       
       return 0;
   }
       
   