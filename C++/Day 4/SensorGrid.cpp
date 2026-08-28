#include<iostream>
#include<climits>

using namespace std;
void grid(){

    int i,j;
    double arr[3][3];
    cout<<"Enter array elements: ";
     
    for(i=0; i<3; i++){
        for(j=0; j<3; j++){

            cin>>arr[i][j];
        }
    }

    for(i=0;  i<3; i++){
        cout<<"Floor "<<i+1<<" : ";
        for(j=0; j<3; j++){

            cout<<arr[i][j]<<"  ";
        }
        cout<<endl;
    }

    double max=INT_MIN;
    int f;
    int r;
    for(i=0; i<3; i++){
        for(j=0; j<3; j++){
 
            if(arr[i][j]>=max){
                max=arr[i][j];
                
            }    
        }
    }

    cout<<"Hottest Room : ";
     for(i=0; i<3; i++){
        for(j=0; j<3; j++){
 
            if(arr[i][j]==max){
              
                cout<<" Floor :"<<i+1<<" , "<<"Room :"<<j+1<<"  --  "<< max<<" C"<<endl;

                
            }    
        }
    }
     double sum1 =0;
     double sum2 =0;
     double sum3 =0;

    for(i=0; i<3; i++){
        for(j=0; j<3; j++){
 
            

        if(i==0){
        sum1=sum1+arr[i][j];
        }
        if(i==1){
            sum2=sum2+arr[i][j];
        }
        if(i==2){
            sum3=sum3+arr[i][j];
        }
    }
    }

    double avg1=sum1/3;
    double avg2=sum2/3;
    double avg3=sum3/3;
  
    if (avg1>=avg2 && avg1>=avg3){
        cout<<"Hottest Floor : "<< " Floor : "<< "1  "<<"(avg = "<<avg1 <<" C )";
    }
    
    if (avg2>=avg1 && avg2>=avg3){
        cout<<"Hottest Floor : "<< " Floor : "<< "2  "<<"(avg = "<<avg2 <<" C )";
    }
    
    if (avg3>=avg1 && avg3>=avg2){
        cout<<"Hottest Floor : "<< " Floor : "<< "3  "<<"(avg = "<<avg3 <<" C )";
    }


};
int main(){
    grid();
    return 0;

}