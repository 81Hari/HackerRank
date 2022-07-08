#include <bits/stdc++.h>

using namespace std;

string ltrim(const string &);
string rtrim(const string &);
vector<string> split(const string &);

/*
 * Complete the 'flippingMatrix' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY matrix as parameter.
 */

void print_matrix(vector<vector<int>> matrix, int n){
    for (int i = 0; i < 2*n; ++i)
    {
        for (int j = 0; j < 2*n; ++j)
        {
            cout<<matrix[i][j]<<" ";
        }
        cout<<endl;
    }
    cout<<endl;
}

vector<vector<int>> v_column_reverse(vector<vector<int>> matrix, int j,int n){
    int temp;
    for(int i=0;i<n/2;i++){
        temp = matrix[i][j];
        matrix[i][j] = matrix[2*n-i-1][j];
        matrix[2*n-i-1][j] = temp;
    }
    return matrix;
}

int flippingMatrix(vector<vector<int>> matrix) {
    int n = matrix.size()/2;
    int a,b,c,d;
    print_matrix(matrix,n);
    for(int i = 0;i<n;i++){
        for(int j=0;j<n;j++){
            a = matrix[i][j];
            b = matrix[i][2*n-j-1];
            c = matrix[2*n-i-1][j];
            d = matrix[2*n-i-1][2*n-j-1];

            if(i == 0 && j == 0){
                if(b>a && b>c && b>d){
                    reverse(matrix[i].begin(),matrix[i].end());
                }
                else if(c>a && c>d){
                    matrix = v_column_reverse(matrix,j,n);
                }
                else if(d>a){
                    reverse(matrix[2*n-i-1].begin(),matrix[2*n-i-1].end());
                    matrix = v_column_reverse(matrix,j,n);

                }

            }
            else if(i == 0){
                if(b>a && b>c && b>d){

                     for(int k=0;k<j;k++){
                         matrix = v_column_reverse(matrix,k,n);
                     }

                    reverse(matrix[i].begin(),matrix[i].end());

                    for(int k=0;k<j;k++){
                         matrix = v_column_reverse(matrix,k,n);
                     }
                }
                else if(c>a && c>d){
                    matrix = v_column_reverse(matrix,j,n);
                }
                 else if(d>a){
                    reverse(matrix[2*n-i-1].begin(),matrix[2*n-i-1].end());
                    matrix = v_column_reverse(matrix,j,n);

                }



            }
            else if(j == 0){
                 if(b>a && b>c && b>d){
                    reverse(matrix[i].begin(),matrix[i].end());
                }
                else if(c>a && c>d){
                     for(int k=0;k<i;k++){
                         reverse(matrix[2*n-i-1].begin(),matrix[2*n-i-1].end());
                     }
                    matrix = v_column_reverse(matrix,j,n);

                    for(int k=0;k<i;k++){
                         reverse(matrix[2*n-i-1].begin(),matrix[2*n-i-1].end());
                     }
                }
                else if(d>a){
                    reverse(matrix[2*n-i-1].begin(),matrix[2*n-i-1].end());
                    for(int k=0;k<i;k++){
                         reverse(matrix[k].begin(),matrix[k].end());
                     }
                    matrix = v_column_reverse(matrix,j,n);
                    for(int k=0;k<i;k++){
                         reverse(matrix[k].begin(),matrix[k].end());
                     }

                }
            }
            else{
                 if(b>a && b>c && b>d){

                     for(int k=0;k<j;k++){
                         matrix = v_column_reverse(matrix,k,n);
                     }

                    reverse(matrix[i].begin(),matrix[i].end());

                    for(int k=0;k<j;k++){
                         matrix = v_column_reverse(matrix,k,n);
                     }
                }
                else if(c>a && c>d){
                     for(int k=0;k<i;k++){
                         reverse(matrix[2*n-i-1].begin(),matrix[2*n-i-1].end());
                     }
                    matrix = v_column_reverse(matrix,j,n);

                    for(int k=0;k<i;k++){
                         reverse(matrix[2*n-i-1].begin(),matrix[2*n-i-1].end());
                     }
                }
                else if(d>a){
                    reverse(matrix[2*n-i-1].begin(),matrix[2*n-i-1].end());
                    for(int k=0;k<i;k++){
                         reverse(matrix[k].begin(),matrix[k].end());
                     }
                    matrix = v_column_reverse(matrix,j,n);
                    for(int k=0;k<i;k++){
                         reverse(matrix[k].begin(),matrix[k].end());
                     }

                }


            }
            print_matrix(matrix,n);
        }

    }

    int sum =0;
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            sum = sum + matrix[i][j];
        }
    }

    cout<<"Sum: "<<sum<<endl;
    return sum;

}

int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    string q_temp;
    getline(cin, q_temp);

    int q = stoi(ltrim(rtrim(q_temp)));

    for (int q_itr = 0; q_itr < q; q_itr++) {
        string n_temp;
        getline(cin, n_temp);

        int n = stoi(ltrim(rtrim(n_temp)));

        vector<vector<int>> matrix(2 * n);

        for (int i = 0; i < 2 * n; i++) {
            matrix[i].resize(2 * n);

            string matrix_row_temp_temp;
            getline(cin, matrix_row_temp_temp);

            vector<string> matrix_row_temp = split(rtrim(matrix_row_temp_temp));

            for (int j = 0; j < 2 * n; j++) {
                int matrix_row_item = stoi(matrix_row_temp[j]);

                matrix[i][j] = matrix_row_item;
            }
        }

        int result = flippingMatrix(matrix);

        fout << result << "\n";
    }

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

vector<string> split(const string &str) {
    vector<string> tokens;

    string::size_type start = 0;
    string::size_type end = 0;

    while ((end = str.find(" ", start)) != string::npos) {
        tokens.push_back(str.substr(start, end - start));

        start = end + 1;
    }

    tokens.push_back(str.substr(start));

    return tokens;
}
