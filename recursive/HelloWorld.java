/*
We have N persons sitting on a round table. Any person can do a handshake with any other person.

     1
2         3
     4

Handshake with 2-3 and 1-4 will cause cross.

In how many ways these N people can make handshakes so that no two handshakes cross each other. N would be even. 
 

Example 1:

Input:
N = 2
Output:
1
Explanation:
{1,2} handshake is
possible.

Input:
N = 4
Output:
2
Explanation:
{{1, 2}, {3, 4}} are the
two handshakes possible.
{{1, 3}, {2, 4}} is another
set of handshakes possible.
*/
using namespace std;
int Handshake(int n){
    if(n == 0)
        return 0;
    else
      return (n-1) + Handshake(n-1);
}
int main()
{
    int n = 4;
    cout <<"Handshake: " <<Handshake(n);
} 

