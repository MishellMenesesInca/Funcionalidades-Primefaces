/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PERSONA")
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByIdper", query = "SELECT p FROM Persona p WHERE p.idper = :idper"),
    @NamedQuery(name = "Persona.findByNomper", query = "SELECT p FROM Persona p WHERE p.nomper = :nomper"),
    @NamedQuery(name = "Persona.findByApepaper", query = "SELECT p FROM Persona p WHERE p.apepaper = :apepaper"),
    @NamedQuery(name = "Persona.findByApemaper", query = "SELECT p FROM Persona p WHERE p.apemaper = :apemaper"),
    @NamedQuery(name = "Persona.findByCelper", query = "SELECT p FROM Persona p WHERE p.celper = :celper"),
    @NamedQuery(name = "Persona.findByDniper", query = "SELECT p FROM Persona p WHERE p.dniper = :dniper"),
    @NamedQuery(name = "Persona.findByEmaper", query = "SELECT p FROM Persona p WHERE p.emaper = :emaper"),
    @NamedQuery(name = "Persona.findByDirper", query = "SELECT p FROM Persona p WHERE p.dirper = :dirper"),
    @NamedQuery(name = "Persona.findByEstper", query = "SELECT p FROM Persona p WHERE p.estper = :estper")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPER")
    private BigDecimal idper;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "NOMPER")
    private String nomper;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "APEPAPER")
    private String apepaper;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "APEMAPER")
    private String apemaper;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "CELPER")
    private String celper;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "DNIPER")
    private String dniper;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "EMAPER")
    private String emaper;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "DIRPER")
    private String dirper;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ESTPER")
    private Character estper;
    @JoinColumn(name = "CODUBI", referencedColumnName = "CODUBI")
    @ManyToOne(optional = false)
    private Ubigeo codubi;

    public Persona() {
    }

    public Persona(BigDecimal idper) {
        this.idper = idper;
    }

    public Persona(BigDecimal idper, String nomper, String apepaper, String apemaper, String celper, String dniper, String emaper, String dirper, Character estper) {
        this.idper = idper;
        this.nomper = nomper;
        this.apepaper = apepaper;
        this.apemaper = apemaper;
        this.celper = celper;
        this.dniper = dniper;
        this.emaper = emaper;
        this.dirper = dirper;
        this.estper = estper;
    }

    public BigDecimal getIdper() {
        return idper;
    }

    public void setIdper(BigDecimal idper) {
        this.idper = idper;
    }

    public String getNomper() {
        return nomper;
    }

    public void setNomper(String nomper) {
        this.nomper = nomper;
    }

    public String getApepaper() {
        return apepaper;
    }

    public void setApepaper(String apepaper) {
        this.apepaper = apepaper;
    }

    public String getApemaper() {
        return apemaper;
    }

    public void setApemaper(String apemaper) {
        this.apemaper = apemaper;
    }

    public String getCelper() {
        return celper;
    }

    public void setCelper(String celper) {
        this.celper = celper;
    }

    public String getDniper() {
        return dniper;
    }

    public void setDniper(String dniper) {
        this.dniper = dniper;
    }

    public String getEmaper() {
        return emaper;
    }

    public void setEmaper(String emaper) {
        this.emaper = emaper;
    }

    public String getDirper() {
        return dirper;
    }

    public void setDirper(String dirper) {
        this.dirper = dirper;
    }

    public Character getEstper() {
        return estper;
    }

    public void setEstper(Character estper) {
        this.estper = estper;
    }

    public Ubigeo getCodubi() {
        return codubi;
    }

    public void setCodubi(Ubigeo codubi) {
        this.codubi = codubi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idper != null ? idper.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idper == null && other.idper != null) || (this.idper != null && !this.idper.equals(other.idper))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidad.Persona[ idper=" + idper + " ]";
    }
    
}
