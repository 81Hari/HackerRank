#include<iostream>
#include<math.h>
#include<unordered_map>

using namespace std;

/*
 * Complete the 'isValid' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

string isValid(string s) {

    int n = s.size();
    int i,temp;
    unordered_map<char, int> count;
    for(i =0;i<n;i++){
        count[s[i]]++;
    }

    for(i =0;i<n-1;i++){
        if(temp<=1){
            break;
        }
        if(count[s[i]] != count[s[i+1]]){
            if(abs(count[s[i]] - count[s[i+1]]) != 1){
                temp++;
            }
            else{
                temp = temp + 2;
            }
        }
    }
cout<<count['e'];

if(temp<=1){
    return "YES";
}
else{
    return "NO";
}
}

int main()
{

    string s;
    cin>>s;

    string result = isValid(s);

    cout << result << "\n";


    return 0;
}

