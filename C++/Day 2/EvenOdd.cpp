#include<iostream>
using namespace std;

int main(){
    cout<<"Enter Array elements: ";
    int arr[5];
    for(int i=0; i<=4; i++){
    
        cin>>arr[i];
        
    }
    int even=0;
    int odd=0;
    int zero=0;

    for(int j=0; j<=4; j++){
        if(arr[j]==0){
            zero++;
        }
        else if(arr[j]%2!=0){
            odd++;
        }
        else{
            even++;
        }
    }
    cout<<"Even: "<<even<<endl;
    cout<<"Odd : "<<odd<<endl;
    cout<<"Zero : "<<zero<<endl;

}