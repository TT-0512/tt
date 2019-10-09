package project.one.dwt;

/**
 * 共享单车
 */
public class Bike extends Vehicle {

    /**
     * 调用父类构造方法完成车辆编号的赋值
     *
     * @param id
     */
    public Bike(String id) {
        // to-do: 代码实现
        super(id);
    }

    /**
     * 覆盖父类showInfo方法，用于显示单车的租车说明
     */
    @Override
    public String showInfo() {
        // to-do：代码实现
        if (getStatus() == 0) {
            return "共享单车" + '\t' + '\t' + "未租" + '\t' + "每小时租车1元钱";
        }

        return "共享单车" + '\t' + '\t' + "已租" + '\t' + "每小时租车1元钱";

    }

}
