package com.base.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tbl_topics", schema = "travelblogger", catalog = "")
public class TblTopicsEntity {
    private int idTopic;
    private String nameTopic;
    private int activeFlag;

    @Id
    @Column(name = "id_topic")
    public int getIdTopic() {
        return idTopic;
    }

    public void setIdTopic(int idTopic) {
        this.idTopic = idTopic;
    }

    @Basic
    @Column(name = "name_topic")
    public String getNameTopic() {
        return nameTopic;
    }

    public void setNameTopic(String nameTopic) {
        this.nameTopic = nameTopic;
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
        TblTopicsEntity that = (TblTopicsEntity) o;
        return idTopic == that.idTopic &&
                activeFlag == that.activeFlag &&
                Objects.equals(nameTopic, that.nameTopic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idTopic, nameTopic, activeFlag);
    }
}
