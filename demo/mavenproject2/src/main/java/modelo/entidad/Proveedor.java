/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author hugom
 */
@Entity
@Table(name = "PROVEEDOR")
@NamedQueries({
    @NamedQuery(name = "Proveedor.findAll", query = "SELECT p FROM Proveedor p"),
    @NamedQuery(name = "Proveedor.findByIdprov", query = "SELECT p FROM Proveedor p WHERE p.idprov = :idprov"),
    @NamedQuery(name = "Proveedor.findByRazsocprov", query = "SELECT p FROM Proveedor p WHERE p.razsocprov = :razsocprov"),
    @NamedQuery(name = "Proveedor.findByRucprov", query = "SELECT p FROM Proveedor p WHERE p.rucprov = :rucprov"),
    @NamedQuery(name = "Proveedor.findByEmaprov", query = "SELECT p FROM Proveedor p WHERE p.emaprov = :emaprov"),
    @NamedQuery(name = "Proveedor.findByDirprov", query = "SELECT p FROM Proveedor p WHERE p.dirprov = :dirprov"),
    @NamedQuery(name = "Proveedor.findByTipprov", query = "SELECT p FROM Proveedor p WHERE p.tipprov = :tipprov"),
    @NamedQuery(name = "Proveedor.findByEstprov", query = "SELECT p FROM Proveedor p WHERE p.estprov = :estprov"),
    @NamedQuery(name = "Proveedor.findByCelprov", query = "SELECT p FROM Proveedor p WHERE p.celprov = :celprov")})
public class Proveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPROV")
    private BigDecimal idprov;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "RAZSOCPROV")
    private String razsocprov;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "RUCPROV")
    private String rucprov;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "EMAPROV")
    private String emaprov;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "DIRPROV")
    private String dirprov;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "TIPPROV")
    private String tipprov;
    @Column(name = "ESTPROV")
    private Character estprov;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "CELPROV")
    private String celprov;
    @JoinColumn(name = "CODUBI", referencedColumnName = "CODUBI")
    @ManyToOne(optional = false)
    private Ubigeo codubi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idprov")
    private List<Prenda> prendaList;

    public Proveedor() {
    }

    public Proveedor(BigDecimal idprov) {
        this.idprov = idprov;
    }

    public Proveedor(BigDecimal idprov, String razsocprov, String rucprov, String emaprov, String dirprov, String tipprov, String celprov) {
        this.idprov = idprov;
        this.razsocprov = razsocprov;
        this.rucprov = rucprov;
        this.emaprov = emaprov;
        this.dirprov = dirprov;
        this.tipprov = tipprov;
        this.celprov = celprov;
    }

    public BigDecimal getIdprov() {
        return idprov;
    }

    public void setIdprov(BigDecimal idprov) {
        this.idprov = idprov;
    }

    public String getRazsocprov() {
        return razsocprov;
    }

    public void setRazsocprov(String razsocprov) {
        this.razsocprov = razsocprov;
    }

    public String getRucprov() {
        return rucprov;
    }

    public void setRucprov(String rucprov) {
        this.rucprov = rucprov;
    }

    public String getEmaprov() {
        return emaprov;
    }

    public void setEmaprov(String emaprov) {
        this.emaprov = emaprov;
    }

    public String getDirprov() {
        return dirprov;
    }

    public void setDirprov(String dirprov) {
        this.dirprov = dirprov;
    }

    public String getTipprov() {
        return tipprov;
    }

    public void setTipprov(String tipprov) {
        this.tipprov = tipprov;
    }

    public Character getEstprov() {
        return estprov;
    }

    public void setEstprov(Character estprov) {
        this.estprov = estprov;
    }

    public String getCelprov() {
        return celprov;
    }

    public void setCelprov(String celprov) {
        this.celprov = celprov;
    }

    public Ubigeo getCodubi() {
        return codubi;
    }

    public void setCodubi(Ubigeo codubi) {
        this.codubi = codubi;
    }

    public List<Prenda> getPrendaList() {
        return prendaList;
    }

    public void setPrendaList(List<Prenda> prendaList) {
        this.prendaList = prendaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprov != null ? idprov.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proveedor)) {
            return false;
        }
        Proveedor other = (Proveedor) object;
        if ((this.idprov == null && other.idprov != null) || (this.idprov != null && !this.idprov.equals(other.idprov))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidad.Proveedor[ idprov=" + idprov + " ]";
    }
    
}
