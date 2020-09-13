package com.base.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "tbl_save_post", schema = "travelblogger", catalog = "")
public class TblSavePostEntity {
    private int idSavePost;
    private Date saveDate;
    private Integer activeFlag;

    @Id
    @Column(name = "id_save_post")
    public int getIdSavePost() {
        return idSavePost;
    }

    public void setIdSavePost(int idSavePost) {
        this.idSavePost = idSavePost;
    }

    @Basic
    @Column(name = "save_date")
    public Date getSaveDate() {
        return saveDate;
    }

    public void setSaveDate(Date saveDate) {
        this.saveDate = saveDate;
    }

    @Basic
    @Column(name = "active_flag")
    public Integer getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(Integer activeFlag) {
        this.activeFlag = activeFlag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblSavePostEntity that = (TblSavePostEntity) o;
        return idSavePost == that.idSavePost &&
                Objects.equals(saveDate, that.saveDate) &&
                Objects.equals(activeFlag, that.activeFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSavePost, saveDate, activeFlag);
    }
}
