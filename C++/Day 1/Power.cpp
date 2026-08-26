#include <iostream>
using namespace std;

int main(){
	int a;
	int b;

	cout<<"Enter number:";
	cin>>a;

	cout<<"Enter power:";
   cin>>b;


   int x=1;
   for(int i=1; i<=b ; i++){

   	x=x*a;
   }
   cout<<"power "<<a<<"^"<<b<<" is: "<<x;
}