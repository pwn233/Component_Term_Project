/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pwn233 {github.com/pwn233}
 */
@Entity
@Table(name = "THCVSOAP")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Thcvsoap.findAll", query = "SELECT t FROM Thcvsoap t"),
    @NamedQuery(name = "Thcvsoap.findById", query = "SELECT t FROM Thcvsoap t WHERE t.id = :id"),
    @NamedQuery(name = "Thcvsoap.findByYears", query = "SELECT t FROM Thcvsoap t WHERE t.years = :years"),
    @NamedQuery(name = "Thcvsoap.findByWeeknum", query = "SELECT t FROM Thcvsoap t WHERE t.weeknum = :weeknum"),
    @NamedQuery(name = "Thcvsoap.findByNewCase", query = "SELECT t FROM Thcvsoap t WHERE t.newCase = :newCase"),
    @NamedQuery(name = "Thcvsoap.findByTotalCase", query = "SELECT t FROM Thcvsoap t WHERE t.totalCase = :totalCase"),
    @NamedQuery(name = "Thcvsoap.findByNewCaseExcludeabroad", query = "SELECT t FROM Thcvsoap t WHERE t.newCaseExcludeabroad = :newCaseExcludeabroad"),
    @NamedQuery(name = "Thcvsoap.findByTotalCaseExcludeabroad", query = "SELECT t FROM Thcvsoap t WHERE t.totalCaseExcludeabroad = :totalCaseExcludeabroad"),
    @NamedQuery(name = "Thcvsoap.findByNewRecovered", query = "SELECT t FROM Thcvsoap t WHERE t.newRecovered = :newRecovered"),
    @NamedQuery(name = "Thcvsoap.findByTotalRecovered", query = "SELECT t FROM Thcvsoap t WHERE t.totalRecovered = :totalRecovered"),
    @NamedQuery(name = "Thcvsoap.findByNewDeath", query = "SELECT t FROM Thcvsoap t WHERE t.newDeath = :newDeath"),
    @NamedQuery(name = "Thcvsoap.findByTotalDeath", query = "SELECT t FROM Thcvsoap t WHERE t.totalDeath = :totalDeath"),
    @NamedQuery(name = "Thcvsoap.findByCaseForeign", query = "SELECT t FROM Thcvsoap t WHERE t.caseForeign = :caseForeign"),
    @NamedQuery(name = "Thcvsoap.findByCasePrison", query = "SELECT t FROM Thcvsoap t WHERE t.casePrison = :casePrison"),
    @NamedQuery(name = "Thcvsoap.findByCaseWalkin", query = "SELECT t FROM Thcvsoap t WHERE t.caseWalkin = :caseWalkin"),
    @NamedQuery(name = "Thcvsoap.findByCaseNewPrev", query = "SELECT t FROM Thcvsoap t WHERE t.caseNewPrev = :caseNewPrev"),
    @NamedQuery(name = "Thcvsoap.findByCaseNewDiff", query = "SELECT t FROM Thcvsoap t WHERE t.caseNewDiff = :caseNewDiff"),
    @NamedQuery(name = "Thcvsoap.findByDeathNewPrev", query = "SELECT t FROM Thcvsoap t WHERE t.deathNewPrev = :deathNewPrev"),
    @NamedQuery(name = "Thcvsoap.findByDeathNewDiff", query = "SELECT t FROM Thcvsoap t WHERE t.deathNewDiff = :deathNewDiff"),
    @NamedQuery(name = "Thcvsoap.findByUpdateDate", query = "SELECT t FROM Thcvsoap t WHERE t.updateDate = :updateDate")})
public class Thcvsoap implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Column(name = "YEARS")
    private Integer years;
    @Column(name = "WEEKNUM")
    private Integer weeknum;
    @Column(name = "NEW_CASE")
    private Integer newCase;
    @Column(name = "TOTAL_CASE")
    private Integer totalCase;
    @Column(name = "NEW_CASE_EXCLUDEABROAD")
    private Integer newCaseExcludeabroad;
    @Column(name = "TOTAL_CASE_EXCLUDEABROAD")
    private Integer totalCaseExcludeabroad;
    @Column(name = "NEW_RECOVERED")
    private Integer newRecovered;
    @Column(name = "TOTAL_RECOVERED")
    private Integer totalRecovered;
    @Column(name = "NEW_DEATH")
    private Integer newDeath;
    @Column(name = "TOTAL_DEATH")
    private Integer totalDeath;
    @Column(name = "CASE_FOREIGN")
    private Integer caseForeign;
    @Column(name = "CASE_PRISON")
    private Integer casePrison;
    @Column(name = "CASE_WALKIN")
    private Integer caseWalkin;
    @Column(name = "CASE_NEW_PREV")
    private Integer caseNewPrev;
    @Column(name = "CASE_NEW_DIFF")
    private Integer caseNewDiff;
    @Column(name = "DEATH_NEW_PREV")
    private Integer deathNewPrev;
    @Column(name = "DEATH_NEW_DIFF")
    private Integer deathNewDiff;
    @Size(max = 100)
    @Column(name = "UPDATE_DATE")
    private String updateDate;

    public Thcvsoap() {
    }

    public Thcvsoap(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public Integer getWeeknum() {
        return weeknum;
    }

    public void setWeeknum(Integer weeknum) {
        this.weeknum = weeknum;
    }

    public Integer getNewCase() {
        return newCase;
    }

    public void setNewCase(Integer newCase) {
        this.newCase = newCase;
    }

    public Integer getTotalCase() {
        return totalCase;
    }

    public void setTotalCase(Integer totalCase) {
        this.totalCase = totalCase;
    }

    public Integer getNewCaseExcludeabroad() {
        return newCaseExcludeabroad;
    }

    public void setNewCaseExcludeabroad(Integer newCaseExcludeabroad) {
        this.newCaseExcludeabroad = newCaseExcludeabroad;
    }

    public Integer getTotalCaseExcludeabroad() {
        return totalCaseExcludeabroad;
    }

    public void setTotalCaseExcludeabroad(Integer totalCaseExcludeabroad) {
        this.totalCaseExcludeabroad = totalCaseExcludeabroad;
    }

    public Integer getNewRecovered() {
        return newRecovered;
    }

    public void setNewRecovered(Integer newRecovered) {
        this.newRecovered = newRecovered;
    }

    public Integer getTotalRecovered() {
        return totalRecovered;
    }

    public void setTotalRecovered(Integer totalRecovered) {
        this.totalRecovered = totalRecovered;
    }

    public Integer getNewDeath() {
        return newDeath;
    }

    public void setNewDeath(Integer newDeath) {
        this.newDeath = newDeath;
    }

    public Integer getTotalDeath() {
        return totalDeath;
    }

    public void setTotalDeath(Integer totalDeath) {
        this.totalDeath = totalDeath;
    }

    public Integer getCaseForeign() {
        return caseForeign;
    }

    public void setCaseForeign(Integer caseForeign) {
        this.caseForeign = caseForeign;
    }

    public Integer getCasePrison() {
        return casePrison;
    }

    public void setCasePrison(Integer casePrison) {
        this.casePrison = casePrison;
    }

    public Integer getCaseWalkin() {
        return caseWalkin;
    }

    public void setCaseWalkin(Integer caseWalkin) {
        this.caseWalkin = caseWalkin;
    }

    public Integer getCaseNewPrev() {
        return caseNewPrev;
    }

    public void setCaseNewPrev(Integer caseNewPrev) {
        this.caseNewPrev = caseNewPrev;
    }

    public Integer getCaseNewDiff() {
        return caseNewDiff;
    }

    public void setCaseNewDiff(Integer caseNewDiff) {
        this.caseNewDiff = caseNewDiff;
    }

    public Integer getDeathNewPrev() {
        return deathNewPrev;
    }

    public void setDeathNewPrev(Integer deathNewPrev) {
        this.deathNewPrev = deathNewPrev;
    }

    public Integer getDeathNewDiff() {
        return deathNewDiff;
    }

    public void setDeathNewDiff(Integer deathNewDiff) {
        this.deathNewDiff = deathNewDiff;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
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
        if (!(object instanceof Thcvsoap)) {
            return false;
        }
        Thcvsoap other = (Thcvsoap) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Thcvsoap[ id=" + id + " ]";
    }
    
}
