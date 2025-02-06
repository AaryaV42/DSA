
#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
using namespace std;

#define ll long long
#define N 2000006
#define mod 1000000007
#define endl "\n"
#define bug(x) cout << #x << " : "<< x << "\n"

void Cry(int& tc) {
    string s; cin >> s;
    vector <int> v(s.size());

    for (int i = 0; i < s.size(); i++) {
        v[i] = s[i] - '0';
    }


    for (int i = 1; i < v.size(); i++) {

        int temp = i;

        if (v[temp] - 1 > v[temp - 1]) {

            int j = temp - 1;

            while (j >= 0 && v[temp] - 1 > v[j]) {
                v[temp]--;
                swap(v[j], v[temp]);
                temp--;
                j--;
            }
        }
    }

    for (int i = 0; i < v.size(); i++) cout << v[i];
    cout << endl;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int testCase = 1;
    cin >> testCase;

    for (int i = 1; i <= testCase; i++) {
        Cry(testCase);
    }

    return 0;
}