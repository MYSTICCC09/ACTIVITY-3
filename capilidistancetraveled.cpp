/* SECOND PROGRAMMING EXERCISE */
/* SUBMITTED BY: ANDREI N. CAPILI (BSCPE 1-1 - PUP BC) */
/* C++ ACTIVITY */ 

#include <iostream>
#include <iomanip>
using namespace std;

string greetUser (){
        string userName;
        cout<<"Hi! What's your name?:";
        cin>>userName;
        cout<<"Greetings! " + userName + ", This program will help you calculate your BMI distance traveled."<<endl;
        cout<<"All you need to do is provide the necessary information below."<<endl;
        return userName;
    };

int main(){
    string userName;
    userName = greetUser();
    int hours;
    int hourCounter = 0;
    int speed = 0;
    int unit;
    
    cout << "Type 1 for metric or 2 for english units \n";
    cin >> unit;

    if(unit == 1){
        cout << "Enter the speed of the vehicle in kilometers per hour (km/h) \n";
        cin >> speed;
    }else if (unit == 2){
        cout<< "Enter the speed of the vehicle in miles per hour (mp/h) \n";
        cin >> speed;
    }else{
        cout << "You have entered an invalid input. Please rerun the program \n";
        exit(0);
    }

    cout << "Enter the hours the vehicle has traveled \n";
    cin >> hours;

    cout << "Time Spent           Distance Traveled \n";
    cout << "_____________________________________________ \n";

    if (unit == 1){
        for(int loop = 1; loop < hours+1; loop++){
            if(loop == 1){
                hourCounter++;
                cout << hourCounter << " Hour" << "              " << (hourCounter*speed) << " Kilometers \n";
            }else{
                hourCounter++;
                cout << hourCounter << " Hours " << "            " << (hourCounter*speed) << " Kilometers \n";
            }            
        }
    }else{
        for(int loop = 1; loop < hours+1; loop++){
            if(loop == 1){
                hourCounter++;
                cout << hourCounter << " Hour" << "             " << (hourCounter*speed) << " Miles \n";
            }else{
                hourCounter++;
                cout << hourCounter << " Hours " << "            " << (hourCounter*speed) << " Miles \n";
            }            
        }
    }
}