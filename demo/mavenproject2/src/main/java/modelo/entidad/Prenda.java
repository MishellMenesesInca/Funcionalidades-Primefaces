/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author hugom
 */
@Entity
@Table(name = "PRENDA")
@NamedQueries({
    @NamedQuery(name = "Prenda.findAll", query = "SELECT p FROM Prenda p"),
    @NamedQuery(name = "Prenda.findByIdpre", query = "SELECT p FROM Prenda p WHERE p.idpre = :idpre"),
    @NamedQuery(name = "Prenda.findByTippre", query = "SELECT p FROM Prenda p WHERE p.tippre = :tippre"),
    @NamedQuery(name = "Prenda.findByNompre", query = "SELECT p FROM Prenda p WHERE p.nompre = :nompre"),
    @NamedQuery(name = "Prenda.findByPrepre", query = "SELECT p FROM Prenda p WHERE p.prepre = :prepre"),
    @NamedQuery(name = "Prenda.findByTalpre", query = "SELECT p FROM Prenda p WHERE p.talpre = :talpre"),
    @NamedQuery(name = "Prenda.findByColpre", query = "SELECT p FROM Prenda p WHERE p.colpre = :colpre"),
    @NamedQuery(name = "Prenda.findByMarpre", query = "SELECT p FROM Prenda p WHERE p.marpre = :marpre"),
    @NamedQuery(name = "Prenda.findByDespre", query = "SELECT p FROM Prenda p WHERE p.despre = :despre"),
    @NamedQuery(name = "Prenda.findByEstpre", query = "SELECT p FROM Prenda p WHERE p.estpre = :estpre"),
    @NamedQuery(name = "Prenda.findByStockpre", query = "SELECT p FROM Prenda p WHERE p.stockpre = :stockpre")})
public class Prenda implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPRE")
    private BigDecimal idpre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "TIPPRE")
    private String tippre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NOMPRE")
    private String nompre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PREPRE")
    private BigDecimal prepre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "TALPRE")
    private String talpre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "COLPRE")
    private String colpre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "MARPRE")
    private String marpre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "DESPRE")
    private String despre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTPRE")
    private Character estpre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STOCKPRE")
    private BigInteger stockpre;
    @JoinColumn(name = "IDPROV", referencedColumnName = "IDPROV")
    @ManyToOne(optional = false)
    private Proveedor idprov;

    public Prenda() {
    }

    public Prenda(BigDecimal idpre) {
        this.idpre = idpre;
    }

    public Prenda(BigDecimal idpre, String tippre, String nompre, BigDecimal prepre, String talpre, String colpre, String marpre, String despre, Character estpre, BigInteger stockpre) {
        this.idpre = idpre;
        this.tippre = tippre;
        this.nompre = nompre;
        this.prepre = prepre;
        this.talpre = talpre;
        this.colpre = colpre;
        this.marpre = marpre;
        this.despre = despre;
        this.estpre = estpre;
        this.stockpre = stockpre;
    }

    public BigDecimal getIdpre() {
        return idpre;
    }

    public void setIdpre(BigDecimal idpre) {
        this.idpre = idpre;
    }

    public String getTippre() {
        return tippre;
    }

    public void setTippre(String tippre) {
        this.tippre = tippre;
    }

    public String getNompre() {
        return nompre;
    }

    public void setNompre(String nompre) {
        this.nompre = nompre;
    }

    public BigDecimal getPrepre() {
        return prepre;
    }

    public void setPrepre(BigDecimal prepre) {
        this.prepre = prepre;
    }

    public String getTalpre() {
        return talpre;
    }

    public void setTalpre(String talpre) {
        this.talpre = talpre;
    }

    public String getColpre() {
        return colpre;
    }

    public void setColpre(String colpre) {
        this.colpre = colpre;
    }

    public String getMarpre() {
        return marpre;
    }

    public void setMarpre(String marpre) {
        this.marpre = marpre;
    }

    public String getDespre() {
        return despre;
    }

    public void setDespre(String despre) {
        this.despre = despre;
    }

    public Character getEstpre() {
        return estpre;
    }

    public void setEstpre(Character estpre) {
        this.estpre = estpre;
    }

    public BigInteger getStockpre() {
        return stockpre;
    }

    public void setStockpre(BigInteger stockpre) {
        this.stockpre = stockpre;
    }

    public Proveedor getIdprov() {
        return idprov;
    }

    public void setIdprov(Proveedor idprov) {
        this.idprov = idprov;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpre != null ? idpre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prenda)) {
            return false;
        }
        Prenda other = (Prenda) object;
        if ((this.idpre == null && other.idpre != null) || (this.idpre != null && !this.idpre.equals(other.idpre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidad.Prenda[ idpre=" + idpre + " ]";
    }
    
}
