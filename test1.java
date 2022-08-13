/*
* 从一个装有n个球的箱子里取球，从中取出k个球时的得分为取出k个球时所有可能性的平方。
* 求对于所有可能的k，得分值之和。输出该得分对1e9+7的模。
* 例：假设共有3个球，得分为3*3+3*3+1=19。
*/
class test1{
    //public static  int f(int n,int m){//在n个球中取m个球
    //    if (m==0||m==n){return 1;}
    //    return f(n-1,m-1)+f(n-1,m);
    //}

    public static void main(String[] args){
        int n=50;
        long la[][]=new long[n+1][n+1];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < i+1; j++) {
                if (j==0||j==i){
                    la[i][j]=1;
                }
                else{
                    la[i][j]=la[i-1][j-1]+la[i-1][j];
                }
            }
        }

        long sum=0L;
        for (long m:la[n]) {
            sum+=(m*m);
        }
        sum-=1;
        System.out.println(sum%(1e9+7));
    }
}