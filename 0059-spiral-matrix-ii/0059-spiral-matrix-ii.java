class Solution{
public int[][] generateMatrix(int n){
int[][]a=new int[n][n];
int top=0,bottom=n-1,left=0,right=n-1,num=1;
for(;top<=bottom&&left<=right;){
for(int j=left;j<=right;j++)a[top][j]=num++;
top++;
for(int i=top;i<=bottom;i++)a[i][right]=num++;
right--;
if(top<=bottom){
for(int j=right;j>=left;j--)a[bottom][j]=num++;
bottom--;
}
if(left<=right){
for(int i=bottom;i>=top;i--)a[i][left]=num++;
left++;
}
}
return a;
}
}