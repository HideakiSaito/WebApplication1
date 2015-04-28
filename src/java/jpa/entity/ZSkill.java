/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macuser
 */
@Entity
@Table(name = "Z_SKILL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZSkill.findAll", query = "SELECT z FROM ZSkill z"),
    @NamedQuery(name = "ZSkill.findByUserId", query = "SELECT z FROM ZSkill z WHERE z.userId = :userId"),
    @NamedQuery(name = "ZSkill.findByAplicationDevelop", query = "SELECT z FROM ZSkill z WHERE z.aplicationDevelop = :aplicationDevelop")})
public class ZSkill implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "USER_ID")
    private Integer userId;
    @Column(name = "APLICATION_DEVELOP")
    private Integer aplicationDevelop;
    @Lob
    @Size(max = 32700)
    @Column(name = "SUBSCRIPTION")
    private String subscription;
    @Lob
    @Size(max = 32700)
    @Column(name = "JAVA_SE")
    private String javaSe;
    @Lob
    @Size(max = 32700)
    @Column(name = "JAVA_EE")
    private String javaEe;

    public ZSkill() {
    }

    public ZSkill(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAplicationDevelop() {
        return aplicationDevelop;
    }

    public void setAplicationDevelop(Integer aplicationDevelop) {
        this.aplicationDevelop = aplicationDevelop;
    }

    public String getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = subscription;
    }

    public String getJavaSe() {
        return javaSe;
    }

    public void setJavaSe(String javaSe) {
        this.javaSe = javaSe;
    }

    public String getJavaEe() {
        return javaEe;
    }

    public void setJavaEe(String javaEe) {
        this.javaEe = javaEe;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZSkill)) {
            return false;
        }
        ZSkill other = (ZSkill) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZSkill[ userId=" + userId + " ]";
    }
    
}
