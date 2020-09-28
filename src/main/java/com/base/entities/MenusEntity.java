package com.base.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "menus", schema = "travelblogger", catalog = "")
@Data // lombok
public class MenusEntity {
    private Integer menuId;
    private String menuCode;
    private String menuAction;

    @Id
    @Column(name = "menu_id")
    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    @Id
    @Column(name = "menu_code")
    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    @Id
    @Column(name = "menu_action")
    public String getMenuAction() {
        return menuAction;
    }

    public void setMenuAction(String menuAction) {
        this.menuAction = menuAction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenusEntity that = (MenusEntity) o;
        return Objects.equals(menuId, that.menuId) &&
                Objects.equals(menuCode, that.menuCode) &&
                Objects.equals(menuAction, that.menuAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, menuCode, menuAction);
    }
}
