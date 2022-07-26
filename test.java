
// import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * 测试函数
 */
public class test {
    // Consumer<String> con = new Consumer<String>() {
    // @Override
    // public void accept(String s) {
    // // System.out.println(s);
    // }
    // };

    public static void main(String[] args) {
        Consumer<String> c1 = (String s) -> {
            System.out.println("lasdkdfhsoa" + s);
        };
        c1.accept("啦啦啦");
    }
}