#include <iostream>
using namespace std;

int main(){
	double p ,r ,t;
		cout<<"Enter deposite amount:";
		cin>>p;

		cout<<"Enter rate of interest:";
		cin>>r;

		cout<<"Number of Years: ";
		cin>>t;

        double f=(1+(r/100));
        double c=1;
        
		for(int i=1; i<=t;i++)
		{
			c =c*f;
			
		}
			cout<<p*c;
}
