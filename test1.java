import java.util.ArrayList;
/*
* 从一个装有n个球的箱子里取球，从中取出k个球时的得分为取出k个球时所有可能性的平方。
* 求对于所有可能的k，得分值之和。输出该得分对1e9+7的模。
* 例：假设共有3个球，得分为3*3+3*3+1=19。
*/
class test1{
    static int qmi(int a,int k,int p) {
        //快速幂预处理 a^k%p  将k拆成二进制
        long res=1;
        while(k>0) {
            if((k&1)!=0) {
                res = res * a % p;
            }
            a=(int)((long)a*a%p);
            k>>=1;
        }
        return (int)res;
    }

    public static int fact(int j,int p){
        int tmp=1;
        for (int i = 1; i < (j+1); i++) {
            tmp=(int)((long)tmp*i%p);
        }
        return tmp;
    }
    public static int infact(int j,int p){
        int tmp=1;
        for (int i = 1; i < (j+1); i++) {
            //费马小定理求i的逆元阶乘
            tmp=(int)((long)tmp*qmi(i,p-2,p)%p);
        }
        return tmp;
    }

    public static void main(String[] args){
        //https://blog.csdn.net/weixin_45480785/article/details/113896599,快速幂求逆元，卢卡斯定理
        int n=50;int p=(int)1e9+7;
        int res=(int)((long)fact(2*n,p)*infact(n,p)%p*infact(n,p)%p);
        System.out.println(res-1);

        /*ArrayList<Long> tmp=new ArrayList<>();
        tmp.add((long)1);
        for (int i = 0; i <n; i++) {
            for (int j = i; j >0 ; j--) {
                tmp.set(j, tmp.get(j)+ tmp.get(j-1));
            }
            tmp.add((long)1);
        }
        long sum=0L;
        for (long m:tmp){
            sum+=m*m;
        }
        sum-=1;
        System.out.println(sum%(1e9+7));*/
    }
}