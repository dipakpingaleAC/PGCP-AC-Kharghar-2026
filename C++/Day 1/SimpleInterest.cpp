#include <iostream>
using namespace std;
int main(){
	int p , r ,t;
	cout<<"Enter deposite amount:";
	cin>>p;

	cout<<"Enter rate of interest:";
	cin>>r;

	cout<<"Number of Years: ";
	cin>>t;


	cout<<"Simple interest Amount = "<<p*t*r/100;
}