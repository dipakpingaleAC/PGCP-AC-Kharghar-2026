#include <iostream>
#include <cmath>

using namespace std;

inline double distanceBetween(double x1, double y1,double x2,double y2){

    return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));

}

inline double toRadians(double degree){

    return degree *(M_PI / 180.0);

}

inline double clamp(double value, double minVal, double maxVal){

    if(value<minVal){
        return minVal;
    }
    if (value>maxVal){
        return maxVal;
    }
    return value;
}


inline bool isInSafeZone(double x,double y, double cx ,double cy, double radius){

    double distance=distanceBetween(x, y, cx, cy);

    return distance<= radius;
}


int main()
{
    double homeX=0.0;
    double homeY=0.0;

    double radius=50.0;

    double x1=30.0;
    double y1=40.0;

    double x2=10.0;
    double y2=10.0;

    double x3=60.0;
    double y3=0.0;

    double angle=toRadians(180);
    cout<<"'180' Degree in Radian : "<<angle<<endl;

    double value =clamp(120,0,100);
    cout<<"Clamped Value: "<<value<<endl;


    cout<<endl<<"________Waypoint 1 :_______ "<<endl;
    cout<<"Distance : "<<distanceBetween(homeX, homeY , x1, y1)<<endl;
    cout<<"Inside Safe Zone: "<<(isInSafeZone(homeX, homeY , x1, y1,radius)?" Yes" :"No")<<endl;

    cout<<endl<<"________Waypoint 2 :_______ "<<endl;
    cout<<"Distance : "<<distanceBetween(homeX, homeY , x2, y2)<<endl;
    cout<<"Inside Safe Zone: "<<(isInSafeZone(homeX, homeY , x2, y2,radius)?" Yes" :"No")<<endl;
    
    cout<<endl<<"________Waypoint 3 :_______ "<<endl;
    cout<<"Distance : "<<distanceBetween(homeX, homeY , x3, y3)<<endl;
    cout<<"Inside Safe Zone: "<<isInSafeZone(homeX, homeY , x3, y3,radius)?" Yes" :"No";

}