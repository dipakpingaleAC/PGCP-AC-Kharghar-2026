#include <iostream>
#include<climits>

using namespace std;

double computeRMS(double *signal , int n){

    cout<<"RMS: ";
    double sum=0;
    for(int i=0; i<n; i++){
       sum= sum+(*(signal+i)**(signal+i));

    }
    cout<<sum/7<<endl;
    return 0;
}

void normalise(double* signal , int n){
   
    int j;
    double max=INT_MIN;
    cout<<endl;
    for (j=0; j<n; j++){

        if(*(signal+j)>=max){
            max=*(signal+j);
        }
    }
    cout <<"After Normalise : ";
    for(j=0; j<n; j++){
        cout<<*(signal+j)/max<<"  ";
    }
    cout<<endl;
}

int countZeroCrossing(double* signal , int n){

    int k;
    int count=0;
    // cout<<"count zero: ";
    for(k=0; k<n; k++){
      if(k<n){

        if (*(signal+k)>0 && *(signal+(k+1))<0 ){
            count=count+1;

            }
         if (*(signal+k)<0 && *(signal+(k+1))>0)  {
            count=count+1;
         }
        }
    }
    cout<<"Count: "<<count<<endl;

    return 0;

}


void applyGain(double* signal , int n , double gainfactor){

    int i;
    cout<<"After Applying Gain Factor: ";
    for (i=0; i<n; i++){

        cout<<*(signal+i)/gainfactor<<"  ";
      }

    
}

int main(){

    int n=7;
    int i ;
    double arr[n];
    cout<<"Enter inputs :";
    for(i=0; i<n; i++){
        cin>>arr[i];
    }

    cout<<endl<<"Test Signal :";
    for (i=0; i<n; i++){
        cout<<arr[i]<<"  ";
    }
    cout<<endl<<endl;
    computeRMS(arr , n);

     cout<<endl<<"Before Normalise: ";
    for (i=0; i<n; i++){
        cout<<arr[i]<<"  ";
    }

    cout<<endl;
    
    normalise(arr , n);

    cout<<endl;
    countZeroCrossing(arr , n);

    cout<<endl;
    double Gfactor=2;
    applyGain(arr,n,Gfactor);
    return 0;

}