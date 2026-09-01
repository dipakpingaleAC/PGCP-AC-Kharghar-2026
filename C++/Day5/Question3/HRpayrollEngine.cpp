#include <iostream>
#include<string>
#include <iomanip>

using namespace std;

class Employee{

private:

    int empId;
    string name;
    string department;
    char grade;
    double basicSalary;
    bool isActive;

    static int employeeCount;

public:

    Employee(){

        empId= 1000+ ++employeeCount;

        name ="";
        department = "";
        grade='D';
        basicSalary= 0;
        isActive  =true;
    }

    void setName(const string& n){

        if (n.empty()){
            cout<<"ERROR: Name cannot be empty..";
            cout<<"NOT Valid!!!"<<endl;
        }
        else{
            name=n;
        }
    }

    void setDepartment(const string& dept){

        if(dept=="Engineering" || dept=="HR" ||
        dept=="Finance" || dept=="Operations"){
        
            department= dept;
                   
        }
        else{
            cout<<"Error: Deepartment is not Registered.."<<endl;

        }
}
    void setGrade(char g){
        if(g=='A'|| g=='B'|| g=='C' || g=='D'){

            grade=g;
        }
        else{

            cout<<"ERROR: Invalid grade.!!"<<endl;
        }
    }     

    void setBasicSalary(double salary){

        if(salary>10000 && salary<500000){
            basicSalary=salary;

        }
        else{
            cout<<"ERROR: Salary must be between 10000 and 5,00,000.."<<endl;

        }
    }

    void deactivate(){
        isActive = false;
    }

    int getEmpId()const{
        return empId;
    }

    string getName()const{
        return name;
    }

    string getDepartment()const{
        return department;
    }

    char getGrade() const{
        return grade;
    }    

    double getBasicSalary() const{
        return basicSalary;
   }

   bool getIsActive() const{
    return isActive;
   }


   double computeAllowances() const{

    if (grade == 'A'){
        return basicSalary*0.4;
    }
    else if (grade == 'B'){
        return basicSalary*0.3;
    }
    else if (grade == 'C'){
        return basicSalary*0.2;
    }

    else {
        return basicSalary*0.1;
    }
   }


   double computeGrossSalary() const{

    return basicSalary + computeAllowances();
   }

   double computeTax() const {
    double gross=computeGrossSalary();

    if(gross<=50000){
        return 0;
    }

    else if(gross<=100000){
        return (gross -50000)* 0.10;
    }

    else{
    return 5000 + (gross - 100000)* 0.20;

   }
}

    double computeNetSalary() const{
        return computeGrossSalary() - computeTax();
    }


    void acceptDetails(){

        string inputName;
        string inputDepartment;
        char inputGrade;
        double inputSalary;
        
        cout<<"\nEnter name: ";
        getline(cin>>ws,inputName); //

        setName(inputName);


        cout<<"\nEnter Department: ";
        getline(cin>>ws,inputDepartment);

        setDepartment(inputDepartment);

        cout<<"Enter grade: ";
        cin>> inputGrade;

        setGrade(inputGrade);

        cout<<"Enter Basic salary: ";
        cin>>inputSalary;
        setBasicSalary(inputSalary);

    }


    void printPaySlip() const{
        cout<<fixed <<setprecision(2);
        cout<<"\n===================================\n";
        cout<<"EMPLOYEE PAYSLIP -AUG 2026 \n";
        cout<<"\n===================================\n";

        cout<<"Emp ID     : "<<empId<<endl;
        cout<<"name       : "<<name<<endl;
        cout<<"Department : "<<department<<endl;
        cout<<"Grade      : "<<grade<<endl;
        cout<<"Status     : "<<(isActive ? "Active" : "Inactive") ;

        cout<<"\n----------------------------------\n";

        cout<<"Basic salary: Rs. "<<basicSalary<<endl;
        cout<<"Allowances  : Rs. "<<computeAllowances()<<endl;
        cout<<"Gross Salary: Rs. "<<computeGrossSalary()<<endl;

        cout<<"\n----------------------------------\n";

        cout<<"Tax Deduction: Rs. "<<computeTax()<<endl;
        cout<<"Net Salary   : Rs. "<<computeNetSalary()<<endl;

        cout<<"\n===================================\n";
    }

        static int getEmployeeCount(){
            return employeeCount;
        }

    };

    int Employee::employeeCount =0;
int main(){
    
    Employee e1;

    Employee *e2=new Employee();//
    Employee *e3=new Employee();//

    e1.acceptDetails();//.

    e2->acceptDetails();//->
    e3->acceptDetails();//->

    e1.printPaySlip();
    e2->printPaySlip();
    e3->printPaySlip();

    e3->deactivate();

    if(!e3->getIsActive()){
        cout<<e3->getName()<<" is no longer active. Payroll Skipped."<<endl;

    }

    cout<<"Total Employees : "<<Employee::getEmployeeCount()<<endl;


    delete e2;
    delete e3;

    return 0;
}