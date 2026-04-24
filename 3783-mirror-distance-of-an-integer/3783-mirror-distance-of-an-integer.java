class Solution{
public int mirrorDistance(int n){
int temp=n,rev=0;
for(;temp>0;temp/=10)rev=rev*10+temp%10;
return Math.abs(n-rev);
}
}