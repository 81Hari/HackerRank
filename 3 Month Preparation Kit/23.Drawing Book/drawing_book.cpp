#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);

/*
 * Complete the 'pageCount' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER p
 */

int pageCount(int n, int p) {
    int count = 0;
    int i;
    if(n%2 != 0){
        n--; // Reason is written below
    }

    /*
        if n is even{
            1,(2,3),(4,5),(6,7)...(n-2,n-1),n

            if no_of_page turned is 0{
                we can read either 1 from front or n from back
            }
            if no_of_page turned is 1{
                we can read either (2 and 3) from front or (n-2 and n-1) from back
            }
        }

        but if n is odd{
            1,(2,3),(4,5),(6,7)....(n-1,n)

            if no_of_page turned is 0{
                we can read either 1 from front or (n and n-1) from back
            }
            if no_of_page turned is 1{
                we can read either (2 and 3) from front or (n-3 and n-2) from back
            }

            from back we are one page ahead.

            ------(so we are doing n-- if n is odd.)----
        }
    */
    if(n-p<p-1){
        i = n;
        while(i>p){
            count++;
            i-=2;
        }
    }
    else{
        i =1;
        while(i<p){
            count++;
            i+=2;
        }

    }

    return count;

}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string n_temp;
    getline(cin, n_temp);

    int n = stoi(ltrim(rtrim(n_temp)));

    string p_temp;
    getline(cin, p_temp);

    int p = stoi(ltrim(rtrim(p_temp)));

    int result = pageCount(n, p);

    fout << result << "\n";

    fout.close();

    return 0;
}

string ltrim(const string &str) {
    string s(str);

    s.erase(
        s.begin(),
        find_if(s.begin(), s.end(), not1(ptr_fun<int, int>(isspace)))
    );

    return s;
}

string rtrim(const string &str) {
    string s(str);

    s.erase(
        find_if(s.rbegin(), s.rend(), not1(ptr_fun<int, int>(isspace))).base(),
        s.end()
    );

    return s;
}
