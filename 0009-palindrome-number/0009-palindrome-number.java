class Solution{
public boolean isPalindrome(int x){
if(x<0)return false;
int temp=x,rev=0;
for(;temp>0;temp/=10)rev=rev*10+temp%10;
return x==rev;
}
}