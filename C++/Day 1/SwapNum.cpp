#include <iostream>
using namespace std;
int main(){
	int a;
	int b;
	cout<<"Enter 1st number:";
	cin>>a;
	cout<<"Enter 2nd number:";
	cin>>b;

	int c=a;

	a=b;
	b=c;
	cout<<"1st number is:"<<a<<endl<<"2nd number is:"<<b;
}