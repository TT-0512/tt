package project.one.dwt;


import java.util.Scanner;

public class VehicleManager {

    private Vehicle[] vehicleList = new Vehicle[10];
    private Scanner scanner = new Scanner(System.in);

    /**
     * VehicleManager()中完成往vehicleList数组中费别放5辆单车和5辆电动车的数据
     */
    public VehicleManager() {
        // to-do: 放5辆单车和5辆电动车对象到vehicleList中
        for (int i = 0; i < vehicleList.length; i++) {
            if (i < 5) {
                vehicleList[i] = new Bike("V" + (i + 1));
            } else {
                vehicleList[i] = new ElectricVehicle("V" + (i + 1));
            }
        }

    }

    public static void main(String[] args) {
        // to-do: 创建UserMenu对象，调用enter方法开始系统
        UserMenu user = new UserMenu();
        user.enter();
    }

    //开始菜单
    public void start() {
        System.out.println("**************************");
        System.out.println("*******享车管理系统********");
        System.out.println("**************************");

        boolean canContinue = true;
        while (canContinue) {
            System.out.println("---------------------------------------------------------------");
            System.out.println("***请选择操作：");
            System.out.println("***1.查看车辆");
            System.out.println("***2.租赁车辆");
            System.out.println("***3.归还车辆");
            System.out.println("***4.退出");
            // to-do：完成系统菜单控制功能，根据用户的菜单选择，调用对应的方法流程实现
            Scanner reader = new Scanner(System.in);
            int number = reader.nextInt();
            switch (number) {
                case 1:
                    view();
                    break;
                case 2:
                    rental();
                    break;
                case 3:
                    back();
                    break;
                case 4:
                    System.out.println("退出成功！");
                    canContinue = false;
            }


        }
    }

    /**
     * 查看车辆功能流程实现
     */
    private void view() {
        System.out.println("编号\t类型\t\t状态\t\t租车说明");
        // to-do：完成查看车辆功能
        // 提示：遍历vehicleList数组时，可以通过instanceof判断当前对象为单车还是电动车，以此输出类型那一列数据；租车说明直接调用showInfo，感受多态的应用
        for (int i = 0; i < vehicleList.length; i++) {
            if (i < 5) {
                System.out.println(vehicleList[i].getId() + '\t' + '\t' + vehicleList[i].showInfo());
            } else {
                System.out.println(vehicleList[i].getId() + '\t' + '\t' + vehicleList[i].showInfo());
            }
        }
    }

    /**
     * 租赁车辆功能流程实现，将租赁成功的车辆状态修改为1；租赁已被借出的车辆和不存在的车辆情况给出错误信息
     */
    private void rental() {
        System.out.println("请输入租车编号：");
        String id = scanner.nextLine();
        // to-do：完成车辆租赁功能
        for (int i = 0; i < vehicleList.length; i++) {
            if (id.equals(vehicleList[i].getId())) {
                if (vehicleList[i].getStatus() == 0) {
                    vehicleList[i].setStatus(1);
                    System.out.println("租车成功！");
                } else {
                    System.out.println("编号为" + id + "的车辆已被租，请选择其他车辆！");
                }
                break;
            } else {
                if (i > vehicleList.length - 2) {
                    System.out.println("你输入的车辆不存在，请重新租车！");
                }
            }
        }

    }

    /**
     * 归还车辆功能流程实现，将可以归还的车辆状态修改为0；不需要归还和归还不存在的车辆情况给出错误信息
     */
    private void back() {
        System.out.println("请输入还车编号：");
        // to-do：完成车辆归还功能
        String id = scanner.nextLine();
        for (int i = 0; i < vehicleList.length; i++) {
            if (id.equals(vehicleList[i].getId())) {
                if (vehicleList[i].getStatus() == 1) {
                    vehicleList[i].setStatus(0);
                    System.out.println("编号为" + id + "的车辆归还成功！");
                } else {
                    System.out.println("编号为" + id + "的车辆没有被租，不需要归还！");
                }
                break;
            } else {
                if (i > vehicleList.length - 2) {
                    System.out.println("你输入的车辆不存在，请重新选择归还车辆！");
                }
            }
        }
    }

}
