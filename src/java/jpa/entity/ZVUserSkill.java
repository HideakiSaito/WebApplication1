/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macuser
 */
@Entity
@Table(name = "Z_V_USER_SKILL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZVUserSkill.findAll", query = "SELECT z FROM ZVUserSkill z"),
    @NamedQuery(name = "ZVUserSkill.findById", query = "SELECT z FROM ZVUserSkill z WHERE z.id = :id"),
    @NamedQuery(name = "ZVUserSkill.findByBirthday", query = "SELECT z FROM ZVUserSkill z WHERE z.birthday = :birthday")})
public class ZVUserSkill implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private int id;
    @Lob
    @Size(max = 32700)
    @Column(name = "NAME")
    private String name;
    @Column(name = "BIRTHDAY")
    @Temporal(TemporalType.DATE)
    private Date birthday;
    @Lob
    @Size(max = 32700)
    @Column(name = "SUBSCRIPTION")
    private String subscription;

    public ZVUserSkill() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }
    
}
