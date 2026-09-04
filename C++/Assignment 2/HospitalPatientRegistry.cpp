#include<iostream>
# include<string>
using namespace std;

class patient{

private:

    int patientId;
    string name;
    int age;
    string ward;

    const string bloodGroup;

public:

    patient() : patientId(0), name("unknown"), age(0), ward ("General") , bloodGroup("O+") {

        cout<<"[Constructor] Default Patient registered. "<<endl;

    }

    patient(int id, const string& name) : patientId(id), name(name), age(0), ward("Emergency"), bloodGroup("O+") {

        cout<<"[Constructor] Emergency"<<name<<endl;

    }

    patient(int id , const string &name , int age, const string &ward, const string& bg)
    : patientId(id), name(name), age (age), ward(ward), bloodGroup(bg)  {

        cout<<"[Constructor ] Full Admission "<<name <<endl;

    }
    
    ~patient()
    {
        cout<<"[Destructor] Patient "<<name<< " discharged. "<<endl;
    }


    void displayRecord() const{

        cout<<"\nPatient Record : "<<endl;
        cout<<"ID               : "<<patientId<<endl;
        cout<<"Name             : "<<name<<endl;
        cout<<"Age              : "<<age<<endl;
        cout<<"Ward             : "<<ward<<endl;
        cout<<"Blood group      : "<<bloodGroup<<endl;
    }


    void transferWard(const string &newWard){

        cout<<"New Ward : "<<name<< " --->> "<<newWard<<endl;
        
        ward = newWard;
    }
};
int main(){

    cout<<"====== STACK PATIENT ======"<<endl;

    patient p1(1001,"dipak",23,"cardiology" , "B+");

    patient p2(1002, "Raj ");

    patient p3;

    cout<<"\n===== DISPLAY FULL PATIENT ======"<<endl;

    p1.displayRecord();

    cout<<"\n====== DYNAMIC PATIENT ARRAY ======== "<<endl;

    patient *patients =new patient[4];

    for(int i=0; i<4; i++){

        cout<<" Patient "<< i+1 <<" : ";
        patients[i].displayRecord();
    }

    cout<<"\n======WARD TRANSFER ======"<<endl;

    patients[1].transferWard("ICU");

     
    
    cout << "\n===== DELETING DYNAMIC ARRAY =====" << endl;

     delete[]patients;

     cout<<"\n====== END OF MAIN ======="<<endl;

     return 0;


}