/*
 * 定义类Student，包含三个属性：学号number(int)，年级state(int)，成绩score(int)。创建20个学生对象，学号1到20，
 * 年级和成绩都由随机数指定。
 * 问题1：打印出3年级的学生信息
 * 问题2: 使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */

public class students {
    int number;
    int state;
    int score;

    public students(int number, int state, int score) {
        this.number = number;
        this.state = state;
        this.score = score;
    }

    public static void main(String[] args) {
        students[] theStudent = new students[20];
        for (int i = 0; i < 20; i++) {
            theStudent[i] = new students(i + 1, (int) (1 + Math.random() * (4)), (int) (1 + Math.random() * (100)));
        }
        print3(theStudent);
        printAll(theStudent);
    }

    public static void print3(students[] theStudent) {
        System.out.println("打印出3年级的学生信息:");
        for (students stu : theStudent) {
            if (stu.state == 3) {
                System.out.println("学号:" + stu.number + "  年级:" + stu.state + "  成绩" + stu.score);
            }
        }
    }

    public static void printAll(students[] theStudent) {
        System.out.println("使用冒泡排序按学生成绩排序，并遍历所有学生信息:");
        for (int i = 0; i < 20; i++) {
            boolean flag = true;

            for (int j = 0; j < 19; j++) {
                if (theStudent[j].score > theStudent[j + 1].score) {
                    students temp = theStudent[j];
                    theStudent[j] = theStudent[j + 1];
                    theStudent[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }

        for (students stu : theStudent) {
            System.out.println("学号:" + stu.number + "  年级:" + stu.state + "  成绩" + stu.score);
        }
    }
}