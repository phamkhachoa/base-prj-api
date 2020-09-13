package com.base.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tbl_like_post", schema = "travelblogger", catalog = "")
public class TblLikePostEntity {
    private int idLikePost;
    private Integer activeFlag;

    @Id
    @Column(name = "id_like_post")
    public int getIdLikePost() {
        return idLikePost;
    }

    public void setIdLikePost(int idLikePost) {
        this.idLikePost = idLikePost;
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
        TblLikePostEntity that = (TblLikePostEntity) o;
        return idLikePost == that.idLikePost &&
                Objects.equals(activeFlag, that.activeFlag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idLikePost, activeFlag);
    }
}
