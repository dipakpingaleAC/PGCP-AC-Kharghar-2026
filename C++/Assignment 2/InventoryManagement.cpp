#include <iostream>
#include <iomanip>
#include<string>

using namespace std;

class Product
{
private:

    int productId;
    string name;
    double price;
    int quantity;

public:

    void acceptDetails(){

        cout<<"Enter Product ID : ";
        cin>>productId;

        cout<<"Enter Product Name : ";
        cin>>name;

        cout<<"Enter Price : ";
        cin>>price;

        cout<<"Enter Quantity : ";
        cin>>quantity;
    }

    void displayDetails() const{

        cout<<left<<setw(8) << productId
        <<setw(15)<<name
        <<setw(12)<<fixed <<setprecision(2)<< price
        <<setw(8)<< quantity
        <<setw(15)<<totalValue();

        cout<<endl;
    }

    double totalValue() const{

        return price *quantity;
    }

    bool isLowStock(int threshold) const{
        return quantity <threshold;
    }

    string getName() const{
        return name;
    }
};


double reorderCost(int qty , double unitPrice){

    return qty * unitPrice;
}

double reorderCost(double qty, double unitPrice){

    return qty * unitPrice;
}

double reorderCost(int qty, double unitPrice, double taxRate){

    double cost=qty *unitPrice;

    double tax=qty*taxRate/100;

    return cost + tax;
}

double applyDiscount(double price, double discountPercent=10.0) {

    double discount = price * discountPercent/100;

    return price -discount;
}



//main
int main(){

    Product products[5];
    cout<<"====Enter Product Details===="<<endl;

    for(int i=0;i<5;i++){
        cout<<"\nProduct "<<i+1<<endl;
        
        products[i].acceptDetails();
    }

    cout<<"\n\n =====INVENTORY REPORT ====="<<endl;

    cout<<left<<setw(8)<<"ID"
    <<setw(15)<<"NAME"
    <<setw(12)<<"PRICE"
    <<setw(8)<<"QTY"
    <<setw(15)<<"TOTAL VALUE"<<endl;


    cout<<"------------------------------------------------------30";
    cout<<endl;

    for(int i=0; i<5; i++){

        products[i].displayDetails();
    }

    int highestIndex=0;

    for (int i = 1; i < 5; i++){

        if (products[i].totalValue()>products[highestIndex].totalValue())
        {
            highestIndex = i;
        }
    }

    cout<<"\nHighest Value Product : "
    <<products[highestIndex].getName()<<"Rs. "
    <<fixed<<setprecision(2)
    <<products[highestIndex].totalValue()<<endl;


    int threshold;

    cout<<"Enter Low Stock threshold : ";
    cin>>threshold;

    cout<<"low Stock threshold : "<<threshold <<" : ";

    bool found=false;

    for(int i=0; i<5; i++){

        if(products[i].isLowStock(threshold))
        {
            if(found){
                cout<<" , ";
            }

            cout<<products[i].getName();

            found = true;
        }
    }

    if(!found){

        cout<<"None";
    }

    cout<<endl;


    cout<<"\n=====REORDER COST ======"<<endl;

    double cost1 = reorderCost(10, 100.00);

    cout<<"Integer quantity cost : Rs. "<<cost1<<endl;


    double cost2 =  reorderCost(5.5, 100.00);

    cout << "Fractional quantity cost : Rs. "<< cost2 << endl;

    double cost3 = reorderCost(10, 250.00, 18.0);

    cout << "Cost with 18% tax : Rs. "<< cost3<< endl;

    
    
    cout << "\n===== DISCOUNT =====" << endl;
   
    double discountedPrice1 = applyDiscount(1000);

    cout << "Default 10% discount : Rs. "<< discountedPrice1 << endl;


    double discountPrice2 = applyDiscount(1000, 20);

    cout<<"20% discount : Rs. "<<discountPrice2<<endl;



    return 0;
}