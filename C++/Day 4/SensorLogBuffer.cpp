#include<iostream>
#include<climits>
using namespace std;

void function(){
    
    int i;
    int n;
    cout<<"Enter Number of readings from(1 to 100) : "<<endl;
    cin>>n;
    double arr[n];
    cout<<"Enter valid inputs : "<<endl;
    for (i=0;i<n; i++){
        
        cin>>arr[i];
        
    }

    cout<<"Reading entered : "<<n<<endl;
    cout<<"Valid readings : ";
    int j;
    int skipped=0;
    int k=0;
    double arr1[k];
    for (j=0; j<n; j++){
         if(arr[j]>0){

            arr1[k]=arr[j];
          cout<<arr1[k]<<"  ";
            k++;
         }   
         else{
            skipped=skipped+1;
         }  
         
        //  if(arr[j]>=45){
        //     cout<<"Index : "<<j<<"  -- "<<arr[j];
        //     break;  

         }
    
    cout<<endl<<"Skipped (Errors) : "<<(skipped)<<endl<<endl;

    
    for(j=0; j<n; j++){
        if( arr[j]>= 45){
            cout<<"First CRITICAL   :INDEX "<<j<<"  --  "<<arr[j]<<endl;
            break;
        }
        // else{
        //     cout<<"There are no Critical readings ...";
        // }
    }
    

    double min=INT_MAX;
    double max =INT_MIN;
    double sum=0;
    for(j=0; j<k; j++){

        if(arr1[j]<=min ){
            min=arr[j];
            
        }
        else if(arr1[j]>=max){
                max=arr[j];
        }
        sum=sum+arr1[j];
        
    }
    cout<<endl<<"Min : "<<min<<"    Max : "<<max<<"    Avg : "<<sum / k <<endl<<endl;


    int normal=0;
    int warning=0;
    int critical=0;
    int shutdown=0;

    for(int a=0; a<k; a++)
    {
        if(arr1[a]<=29){
            normal=normal+1;
        }
        else if(arr1[a]<=44){
            warning=warning+1;
        }
        else if(arr1[a]<=59){
            critical=critical+1;
        }
        else if(arr[1]>=60){
            shutdown=shutdown+1;

        }
    }
        cout<<"Normal : "<<normal<<"  Warning : "<< warning<<"  Critical: "<<critical<<"  Shutdown : "<<shutdown<<endl;


    
};
int main(){
    function();
    return 0;
}