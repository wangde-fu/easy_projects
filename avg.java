//import java.util.Scanner;

import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //write your code here......
        int sum=0,count=0;
        while(true){
            int tmp=scan.nextInt();
            if(tmp<=0) {
                break;
            }
            sum+=tmp;count++;
        }
        //double avg=(double)sum/count;
        //必须先将sum转为double类型，否则按照int间的除法运算，即输出为整数。
        System.out.println(String.format("%.2f",(double)sum/count));
    }
}