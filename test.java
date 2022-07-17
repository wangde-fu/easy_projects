import java.util.Scanner;

/**
 * 测试函数
 */
public class test {

        public static void main(String[] args) {
            String string = "H e l l o ! n o w c o d e r";
            Scanner scanner= new Scanner(System.in);
            String word = scanner.next();
            scanner.close();
            System.out.println(check(string, word));
        }

        public static int check(String str, String word) {

            //write your code here......
            int count=0;
            int strL=str.length();
            int wordL=word.length();
            for(int i=0;i<strL-wordL+1;i++){
                String tmp=str.substring(i,i+wordL);
                if(tmp.equals(word)){count++;}
            }
            return count;
        }

}