import java.util.*;

public class LCM {
    // 找出最小公倍数
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        int result = getCM(m, n);
        System.out.println(result);
    }

    public static int getCM(int m, int n) {
        // write your code here......
        int min = Math.min(m, n);
        m = (m == min) ? n : m;
        int tmp = 1;

        for (int i = 2; i <= min / 2; i++) {
            if (min % i == 0 & m % i == 0) {
                min = min / i;
                m = m / i;
                tmp = tmp * i;
                i -= 1;
            }
        }
        int res = m * min * tmp;
        return res;
    }
}
