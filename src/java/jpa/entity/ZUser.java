/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entity;

import java.util.List;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "Z_USER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZUser.findAll", query = "SELECT z FROM ZUser z"),
    @NamedQuery(name = "ZUser.findById", query = "SELECT z FROM ZUser z WHERE z.id = :id"),
    @NamedQuery(name = "ZUser.findByBirthday", query = "SELECT z FROM ZUser z WHERE z.birthday = :birthday"),
    @NamedQuery(name = "ZUser.findByAge", query = "SELECT z FROM ZUser z WHERE z.age = :age")})
public class ZUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Lob
    @Size(max = 32700)
    @Column(name = "NAME")
    private String name;
    @Column(name = "BIRTHDAY")
    @Temporal(TemporalType.DATE)
    private Date birthday;
    @Column(name = "AGE")
    @Temporal(TemporalType.TIME)
    private Date age;
    
//    @OneToOne(cascade = CascadeType.ALL)
    private ZSkill zSkills;
    

    public ZUser() {
    }

    public ZUser(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZUser)) {
            return false;
        }
        ZUser other = (ZUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.ZUser[ id=" + id + " ]";
    }

    /**
     * @return the zSkills
     */
    public ZSkill getzSkills() {
        return zSkills;
    }

    /**
     * @param zSkills the zSkills to set
     */
    public void setzSkills(ZSkill zSkills) {
        this.zSkills = zSkills;
    }
            
            
    
}
