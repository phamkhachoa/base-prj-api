package com.base.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tbl_comment_post", schema = "travelblogger", catalog = "")
public class TblCommentPostEntity {
    private int idCommentPost;
    private String comment;
    private int activeFlag;

    @Id
    @Column(name = "id_comment_post")
    public int getIdCommentPost() {
        return idCommentPost;
    }

    public void setIdCommentPost(int idCommentPost) {
        this.idCommentPost = idCommentPost;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
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
        TblCommentPostEntity that = (TblCommentPostEntity) o;
        return idCommentPost == that.idCommentPost &&
                activeFlag == that.activeFlag &&
                Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCommentPost, comment, activeFlag);
    }
}
