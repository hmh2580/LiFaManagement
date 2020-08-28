package cn.edu.guet.model;

import java.util.ArrayList;
import java.util.List;

public class Menus {
    private String id;
    private String pId;
    private String name;
    private String Icon;
    private String url;
    private Menus parentMenu;
    private List<Menus> childMenus=new ArrayList<Menus>();

    public Menus getParentMenu() {
        return parentMenu;
    }

    public void setParentMenu(Menus parentMenu) {
        this.parentMenu = parentMenu;
    }

    public List<Menus> getChildMenus() {
        return childMenus;
    }

    public void setChildMenus(List<Menus> childMenus) {
        this.childMenus = childMenus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return Icon;
    }

    public void setIcon(String icon) {
        Icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
