1. 试图猜测以下会输入什么，并了解为啥会输出这样的
```java
public class Change {

    public static void main(String[] args) {
        System.out.println(2.00-1.10);
    }
}

```
会输出很长一段小数大小和0.9接近， 这个是损失了精度的问题。
这个问题一般在金融方面十分明显可以用类似一下的方法解决。
```java
double bmi = weight / (height * height);
        BigDecimal bBmi = new BigDecimal(bmi);
        bmi = bBmi.setScale(1, RoundingMode.HALF_UP).doubleValue();
```

 




—————— 涛哥作答












------ 昊哥作答
这道题我也以为答案会是0.9000000
没想到答案是0.899999999999
后来知道是浮点数，二进制无法精确表示，都是一个模糊精度，就导致了这种状况
应该先做乘法去掉小数点
或者精确计算都用BigDecimal




可以简短整理一下
参考      https://www.zhihu.com/question/56115530/answer/686039533