#include<iostream>
#include<string>
using namespace std;

void factory()
{
    cout<<"Enter Sensor temperature : "<<endl;
    
    double s1;
   
    cin>>s1;
    
    cout<<"Temperature :"<<s1<<" C"<<" / "<<(s1*9/5)+32<<" F"<<endl;
    int code;
    
    if(s1<0){
        code=-1;        
    }
    else if (s1>=0 && s1<=29){
        code=0;
    }
    else if(s1>=30 && s1<=44){
        code=1;
    }
    else if(s1>=45 && s1<=59){
        code=2;
    }
    else if(s1>=60){
        code=3;
    }
    
        switch(code){
        case -1:
            cout<<"Status: SENSOR "<<endl<<"Action : Sensor Fault.."<<endl;
        break;

        case 0:
        cout<<"Status: NORMAL "<<endl<<"Action : No Action required"<<endl;
        break;

        case 1:
        cout<<"Status: WARNING"<<endl<<"Action : Alert sent to supervisor"<<endl;
        break;


        case 2:
        cout<<"Status: CRITICAL"<<endl<<"Action : Cooling system triggered"<<endl;
        break;

        case 3:
        cout<<"Status: SHUTDOWN"<<endl<<"Action : Emergency shutdown initiated "<<endl;
        break;
        }
        

    string average=(s1<=25)? "Below Average" :"Above Average";

    cout<<"Average : "<<average;

       
};
int main(){
    factory();
    return 0;
}