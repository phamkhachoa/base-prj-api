package com.base.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tbl_role", schema = "travelblogger", catalog = "")
public class TblRoleEntity {
    private int idRole;
    private String nameRole;
    private int activeFlag;

    @Id
    @Column(name = "id_role")
    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    @Basic
    @Column(name = "name_role")
    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    @Basic
    @Column(name = "active_flag")
    public int getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(int activeFlag) {
        this.activeFlag = activeFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblRoleEntity that = (TblRoleEntity) o;
        return idRole == that.idRole &&
                activeFlag == that.activeFlag &&
                Objects.equals(nameRole, that.nameRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idRole, nameRole, activeFlag);
    }
}
