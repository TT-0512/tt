package project.one.dwt;

/**
 * 车
 */
public class Vehicle {

    private String id; //车辆编号

    private int status; //是否已租（0可租，1已租）


    public Vehicle() {
    }

    public Vehicle(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    //车辆租车说明，子类进行覆盖
    public String showInfo() {
        return "";
    }


}