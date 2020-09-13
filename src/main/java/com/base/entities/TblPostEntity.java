package com.base.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "tbl_post", schema = "travelblogger", catalog = "")
public class TblPostEntity {
    private int idPost;
    private String description;
    private String content;
    private String imgPost;
    private Date createDate;
    private int likes;
    private String district;
    private int idAccount;
    private String namePlace;
    private String title;
    private int activeFlag;

    @Id
    @Column(name = "id_post")
    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "img_post")
    public String getImgPost() {
        return imgPost;
    }

    public void setImgPost(String imgPost) {
        this.imgPost = imgPost;
    }

    @Basic
    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "likes")
    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Basic
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "id_account")
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    @Basic
    @Column(name = "name_place")
    public String getNamePlace() {
        return namePlace;
    }

    public void setNamePlace(String namePlace) {
        this.namePlace = namePlace;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        TblPostEntity that = (TblPostEntity) o;
        return idPost == that.idPost &&
                likes == that.likes &&
                idAccount == that.idAccount &&
                activeFlag == that.activeFlag &&
                Objects.equals(description, that.description) &&
                Objects.equals(content, that.content) &&
                Objects.equals(imgPost, that.imgPost) &&
                Objects.equals(createDate, that.createDate) &&
                Objects.equals(district, that.district) &&
                Objects.equals(namePlace, that.namePlace) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPost, description, content, imgPost, createDate, likes, district, idAccount, namePlace, title, activeFlag);
    }
}
