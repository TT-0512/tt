1. 试图写一个方法判断传入的参数是否为奇数
















--- 以下是例子

1. 封装的好处？



-----  这是分割线。只能在下面回答
```java
import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        System.out.println("请输入一个整数");
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        OddEven.getOddEven(number);
    }

    public static void getOddEven(int number) {
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("这个数为正偶数");
            } else {
                System.out.println("这个数为正奇数");
            }
        } else if (number < 0) {
            if (number % 2 == 0) {
                System.out.println("这个数为负偶数");
            } else {
                System.out.println("这个数为负奇数");
            }
        } else {
            System.out.println("你输入的这个数为0");
        }
    }
}
```




—————— 涛哥作答


我会在这给出建议，选择谁的回答，谁就吧这个问题整理下放在 base.md 文件里，规范见 base.md 里说明


------ 昊哥作答
   import java.util.*;
   class HomeWork{
       public static void main(String[] args) {
           System.out.println("请输入一个数");
           Scanner sc=new Scanner(System.in);
           int parameter=sc.nextInt();
           if (parameter%2==1){
               System.out.println("这个数是奇数");
           }
           else
               System.out.println("这个数是偶数");
       }
   }


应该抽离出来一个方法，看 src/com/Change类里，抽出出来

比如
```java
   public static boolean isOdd (int i){
        return i %2 ==1;
    }
```
 
有没有考虑到int值为负数的情况，上面回答的，-1 是不是就证明不是奇数了。修改后归档吧，可以以问答的形式放在 java/base.md 里面，以 markdown 语法写。另外如果想提升性能的话，还可以考虑用位运算来做。
