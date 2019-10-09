package project.one.dwt;

import java.util.Arrays;
import java.util.Scanner;

public class UserMenu {
    public void enter() {
        VehicleManager v = new VehicleManager();
        String[] name = {"段文涛", "刘罗欢", "杨浩", "孟庆鑫", "高燕", "秦蔚卓"};
        String[] pwd = {"0512", "0910", "0423", "1006", "1001", "1128"};
        boolean canContinue = true;
        while (canContinue) {
            System.out.println("进入用户享车系统菜单请选择：1.登录 2.退出系统 3.注册 ");
            Scanner reader = new Scanner(System.in);
            int number = reader.nextInt();
            switch (number) {
                //用户登录
                case 1:
                    System.out.println("请输入用户名");
                    String na = reader.next();
                    System.out.println("请输入用密码");
                    String pw = reader.next();
                    for (int i = 0; i < name.length; i++) {
                        if (na.equals(name[i]) && pw.equals(pwd[i])) {
                            System.out.println("登录成功！进入享车管理系统......");
                            v.start();
                            break;
                        } else {
                            if (i > name.length - 2) {
                                System.out.println("用户名不存在或者密码错误！");
                            }
                        }
                    }
                    break;
                //退出系统
                case 2:
                    canContinue = false;
                    System.out.println("退出系统成功！");
                    break;
                //注册用户
                case 3:
                    System.out.println("请输入需要注册几个用户");
                    int amount = reader.nextInt();
                    String[] newName = new String[amount];
                    String[] newPwd = new String[amount];
                    for (int j = 0; j < newName.length; j++) {
                        System.out.println("请注册第" + (j + 1) + "个用户名");
                        newName[j] = reader.next();
                        System.out.println("请注册第" + (j + 1) + "个用户名的密码");
                        newPwd[j] = reader.next();
                    }
                    int strLen1 = name.length;
                    int strLen2 = newName.length;
                    name = Arrays.copyOf(name, strLen1 + strLen2);
                    System.arraycopy(newName, 0, name, strLen1, strLen2);
                    int strLen3 = pwd.length;
                    int strLen4 = newPwd.length;
                    pwd = Arrays.copyOf(pwd, strLen3 + strLen4);
                    System.arraycopy(newPwd, 0, pwd, strLen3, strLen4);

                    for (int j = 0; j < newName.length; j++) {
                        System.out.print(newName[j] + " ");
                    }
                    System.out.println("注册成功！");
                    break;
            }
        }
    }
}