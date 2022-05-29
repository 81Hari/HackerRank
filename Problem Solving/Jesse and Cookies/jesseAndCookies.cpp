#include <iostream>
#include<vector>


using namespace std;


int cookies(int k, vector<int> A) {
    int count = 0;

        /*
            Above code is:
            to count number of cookies less than required sweetness
        */
     int key, j;
    // for (int i = 1; i < A.size(); i++)
    // {
    //     key = A[i];
    //     j = i - 1;
    //     while (j >= 0 && A[j] > key)
    //     {
    //         A[j + 1] = A[j];
    //         j = j - 1;
    //     }
    //     A[j + 1] = key;
    // }

    int new_cookie;

    while(A[0]<k){
        if(A.size() == 1){
            break;
        }
        new_cookie = A[0] + (2*A[1]);
        A.erase(A.begin());
        A.erase(A.begin());
        count++;

        for(int i = 0;i<A.size();i++){
            if(new_cookie>A[i]){
                A.insert(A.begin()+i,new_cookie);
            }

        }
        if (A.size() == 0)
        {
            A.push_back(new_cookie);
        }
    }
    if (A[0]<k){
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
        cout<<"input "<<i<<" ";
        cin>>temp;
        Arr.push_back(temp);
    }

    int no_of_operation = cookies(k,Arr);
    cout<<no_of_operation<<endl;
    return 0;
}
