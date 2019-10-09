1. 这会打印什么
```java
public class LongDivision {
    public static void main(String[] args) {
        final long MICROS_PER_DAY = 24 * 60 * 60 * 1000 * 1000;
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000;

        System.out.println(MICROS_PER_DAY/MILLIS_PER_DAY);
    }
}
```
我以为会输出1000.实际运行出来结果为5.
查找资料表明是定义的MICROS_PER_DAY数值超过了long的范围。可参考
Integer.MIN_VALUE = -2147483648
Integer.MAX_VALUE = 2147483647
Long.MIN_VALUE = -9223372036854775808
Long.MAX_VALUE = 9223372036854775807
Float.MIN_VALUE = 1.4E-45
Float.MIN_NORMAL = 1.17549435E-38
Float.MAX_VALUE = 3.4028235E38
Double.MAX_VALUE = 1.7976931348623157E308
Double.MIN_VALUE = 4.9E-324





—————— 涛哥作答













------ 昊哥作答

我以为应该输出为1000，结果输出为5，有点自闭
后来百度一下，发现数值超过输出范围
所以应该要注意int型的取值范围是：2147483647 到 -2147483648



嗯。昊哥归档吧

