
/**
 * 回形数是一个矩阵输出，从矩阵的左上角往右开始打印数字0，遇到矩阵边界时，顺时针90方向继续打印，并数字增长1。
 * 如此类推直到把矩阵填满，输入一个整形宽和高单位，每输出一个数字，占用1单位宽高空间，根据入参打印出对应的回形数
 */
import java.util.Scanner;

public class HuiXing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.close();
        if (col < 0 || col > 100 || row < 0 || row > 100) {
            throw new ArrayIndexOutOfBoundsException("请输入小于100的正数");
        } else {
            int[][] huiXing = new int[row][col];
            // 设置坐标增值
            int xPlus = 0, yPlus = 1;
            int k = Math.min(row, col);

            // 将数字们依次填入数组
            // 设置坐标
            int X = 1, Y = 1;
            Boolean changeDir = true;

            for (int i = 1; i < row * col + 1; i++) {
                huiXing[X - 1][Y - 1] = i;

                changeDir = !((X + xPlus) > 0 && (X + xPlus) < (row + 1) && (Y + yPlus) > 0 && (Y + yPlus) < (col + 1)
                        && huiXing[X + xPlus - 1][Y + yPlus - 1] == 0);
                if (changeDir) {
                    // 如果需要改变填入方向，则计算新的坐标增值。
                    xPlus = (xPlus == 0) ? ((X > Math.ceil(k / 2)) ? -1 : 1) : 0;
                    yPlus = (yPlus == 0) ? ((Y > Math.ceil(k / 2)) ? -1 : 1) : 0;
                }
                X += xPlus;
                Y += yPlus;
            }

            // 打印数组
            for (int[] tmp : huiXing) {
                for (int theNum : tmp) {
                    System.out.print(theNum + " ");
                }
                System.out.println();
            }
        }
    }
}