package com.base.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tbl_account", schema = "travelblogger", catalog = "")
public class TblAccountEntity {
    private int idAccount;
    private String username;
    private String email;
    private String phoneNumber;
    private String password;
    private String salt;
    private String aliases;
    private int activeFlag;
    private long id;

    @Id
    @Column(name = "id_account")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "salt")
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Basic
    @Column(name = "aliases")
    public String getAliases() {
        return aliases;
    }

    public void setAliases(String aliases) {
        this.aliases = aliases;
    }

    @Basic
    @Column(name = "active_flag")
    public int getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(int activeFlag) {
        this.activeFlag = activeFlag;
    }

    @Basic
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblAccountEntity that = (TblAccountEntity) o;
        return idAccount == that.idAccount &&
                activeFlag == that.activeFlag &&
                id == that.id &&
                Objects.equals(username, that.username) &&
                Objects.equals(email, that.email) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(password, that.password) &&
                Objects.equals(salt, that.salt) &&
                Objects.equals(aliases, that.aliases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAccount, username, email, phoneNumber, password, salt, aliases, activeFlag, id);
    }
}
