#include <iostream>
#include<vector>

using namespace std;


int cookies(int k, vector<int> A) {
    int a = 1;
    int N = A.size();

    /*
     Above code is:
        to stop if we can't make cookies sweetness greater than required and to
        return -1
    */

    int count = 0;
    int flag;
    flag = 0;
    for (int i = 0; i < N; ++i)
        {
            if (A[i]<k)
            {
                flag++; // count of cookie (sweetness<k)
            }

        }

        /*
            Above code is:
            to count number of cookies less than required sweetness
        */

    while(a<N){ // if we can't make cookies sweetness greater than required

        int n = A.size(); // size of cookie container (not constant)

        if (flag <= 0){ // if no cookie sweetness is less than k
            return count;
        }
        else{

            int lsc[2],small,pos,newlsc;

            if (n ==2){

                /*
                This if statement is to avoid segmentation error
                    - when cookie container size become '2', the elese part code will try to access
                    third element but there will be only two elment which gives us segmentation error.
                */
                if(A[0]>A[1]){
                    lsc[0] = A[1];
                    lsc[1] = A[0];

                }
                else{
                    lsc[0] = A[0];
                    lsc[1] = A[1];
                }
                A.clear();
                newlsc = lsc[0] + (2*lsc[1]);
                count++;
                A.push_back(newlsc);
            }
            else{
                for (int i = 0; i < 2; ++i)
                {
                    small = A[i];
                    pos = i;
                    for (int j = i+1; j < n; ++j)
                    {
                        if(small>A[j]){
                            small = A[j];
                            pos = j;
                        }
                    }
                    lsc[i] = small;
                    A.erase(A.begin()+pos);
                    n--;
                }
                newlsc = lsc[0] + (2*lsc[1]);
                count++;
                A.push_back(newlsc);
            }

            if(newlsc<=k){ // if new cookie is also less sweet than k
                flag--;
            }
            else{ // if new cookie is also more sweet than k

                flag = flag - 2;
            }
        }

        a++;
    }
    if(A[0]<k){
        return -1;
    }
    else{
        return count;
    }


}

int main()
{
    int n,k,temp;

    cin>>n>>k;
    vector<int> Arr;

    for(int i =0; i<n; i++){
        cin>>temp;
        Arr.push_back(temp);
    }

    int no_of_operation = cookies(k,Arr);
    cout<<no_of_operation<<endl;
}
