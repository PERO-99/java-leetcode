class Solution{
public boolean isHappy(int n){
while(n!=1&&n!=4){
int sum=0;
for(;n>0;n/=10){
int d=n%10;
sum+=d*d;
}
n=sum;
}
return n==1;
}
}