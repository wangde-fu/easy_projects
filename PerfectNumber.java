/**
 * 一个数如果恰好等于它的真因子之和，这个数就称为“完数”。例如6=1+2+3。编程找出1000以内的所有完数。（因子：除去这个数本身的其它约数）
 */
public class PerfectNumber {
    public static void main(String[] args) {
        for (int i = 2; i < 1000; i++) {
            int j = 0;
            for (int k = 1; k < i; k++) {
                if (i % k == 0) {
                    j += k;
                }
            }
            if (j == i) {
                System.out.println(i);
            }
        }
    }
}