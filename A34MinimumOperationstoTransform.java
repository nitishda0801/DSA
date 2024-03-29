/*
Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

You have the following three operations permitted on a word:

Insert a character
Delete a character
Replace a character
Input Format

The first line contains a string s1 denoting the word1
The second line contains a string s2 denoting the word2
Constraints

0 <= word1.length, word2.length <= 500
word1 and word2 consist of lowercase English letters.
Output Format

Print the integer which is the answer toh the question

Sample Input 0

horse
ros
Sample Output 0

3
Sample Input 1

qntjmvock
fvbd
Sample Output 1


8

*/
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String r = scanner.nextLine();
        int n = s.length();
        int m = r.length();
        int[][] dp = new int[n + 1][m + 1];
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                } else if (s.charAt(i - 1) == r.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                }
            }
        }
        
        System.out.println(dp[n][m]);
    }
}
// s=input()
// r=input()
// n,m=len(s),len(r)
// dp=[[0]*(m+1) for i in range(n+1)]
// for i in range(n+1):
//     for j in range(m+1):
//         if i==0:dp[i][j]=j
//         elif j==0:dp[i][j]=i
//         elif s[i-1]==r[j-1]:dp[i][j]=dp[i-1][j-1]
//         else: dp[i][j]=1+min(dp[i-1][j],dp[i][j-1],dp[i-1][j-1])
// print(dp[n][m])




