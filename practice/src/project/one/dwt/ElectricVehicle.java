package project.one.dwt;

/**
 * 共享电动车
 */
public class ElectricVehicle extends Vehicle {

    /**
     * 调用父类构造方法完成车辆编号的赋值
     *
     * @param id
     */
    public ElectricVehicle(String id) {
        // to-do: 代码实现
        super(id);
    }

    /**
     * 覆盖父类showInfo方法，用于显示电动车的租车说明
     */
    @Override
    public String showInfo() {
        // to-do：代码实现
        if (getStatus() == 0) {
            return "共享电动车" + '\t' + "未租" + '\t' + "每小时租车5元钱";
        } else {
            return "共享电动车" + '\t' + "已租" + '\t' + "每小时租车5元钱";
        }
    }
}
