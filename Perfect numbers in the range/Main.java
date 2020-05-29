#include <iostream>
using namespace std;
int main() 
{
  //cout << "\n\n Find the perfect numbers between 1 and 500:\n";
  //cout << "------------------------------------------------\n";
  int i ,b, u = 1, sum = 0;
  cin>>i>>b;
  //cout << "\n The perfect numbers between 1 to 500 are: \n";
  while (i <= b) 
  {
    while (u <= b) 
    {
      if (u < i) 
      {
        if (i % u == 0)
          sum = sum + u;
      }
      u++;
    }
    if (sum == i) {
      cout << i << " ";
    }
    i++;
    u = 1;
    sum = 0;
  }
}