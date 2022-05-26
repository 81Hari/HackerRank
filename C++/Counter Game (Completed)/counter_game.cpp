/*

to check whether the input is Whole number or Not

floor(x) == ceil(x)

floor(2.6) = 2
ceil(2.2) = 3

*/


#include<iostream>
#include<math.h>

using namespace std;

string counterGame(long n) {

    string chance[2];
    chance[0] = "Louise";
    chance[1] = "Richard";
    int i=0;
    if(n == 1){
            return chance[1];
        }
    while(1){
        float x = log(n)/log(2);
        if(floor(x)==ceil(x)){  //Concept Learned
            n = n/2;
            if(n == 1){
                return chance[i];
            }
            i = (i+1)%2;
        }else{

            x = floor(x);
            n = n - pow(2,x);
            if(n == 1){
                return chance[i];
            }
            i = (i+1)%2; //Note

        }
    }

}

int main(){

    long n;
    cin>>n;
    string winner;
    winner = counterGame(n);
    cout<<winner<<endl;
}
