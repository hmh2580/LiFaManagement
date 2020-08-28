package cn.edu.guet.model;

public class ServiceType {
    private String serviceId;
    private  String serviceName;
    private float price;
    private float comMoney;
    private String stype;
    private String state;

    private String st="已下架";


    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getComMoney() {
        return comMoney;
    }

    public void setComMoney(float comMoney) {
        this.comMoney = comMoney;
    }

    public String getStype() {
        return stype;
    }

    public void setStype(String stype) {
        this.stype = stype;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
