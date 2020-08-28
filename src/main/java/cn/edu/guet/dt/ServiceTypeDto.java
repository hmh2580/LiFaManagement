package cn.edu.guet.dt;

public class ServiceTypeDto {
    private String serviceId;
    private String state;


    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = "已下架";
    }
}
