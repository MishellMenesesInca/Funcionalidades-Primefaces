/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

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

/**
 *
 * @author hugom
 */
@Entity
@Table(name = "UBIGEOS")
@NamedQueries({
    @NamedQuery(name = "Ubigeos.findAll", query = "SELECT u FROM Ubigeos u"),
    @NamedQuery(name = "Ubigeos.findByCodubi", query = "SELECT u FROM Ubigeos u WHERE u.codubi = :codubi"),
    @NamedQuery(name = "Ubigeos.findByDepubi", query = "SELECT u FROM Ubigeos u WHERE u.depubi = :depubi"),
    @NamedQuery(name = "Ubigeos.findByProvubi", query = "SELECT u FROM Ubigeos u WHERE u.provubi = :provubi"),
    @NamedQuery(name = "Ubigeos.findByDistubi", query = "SELECT u FROM Ubigeos u WHERE u.distubi = :distubi")})
public class Ubigeos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(name = "CODUBI")
    private String codubi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DEPUBI")
    private String depubi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "PROVUBI")
    private String provubi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DISTUBI")
    private String distubi;

    public Ubigeos() {
    }

    public Ubigeos(String codubi) {
        this.codubi = codubi;
    }

    public Ubigeos(String codubi, String depubi, String provubi, String distubi) {
        this.codubi = codubi;
        this.depubi = depubi;
        this.provubi = provubi;
        this.distubi = distubi;
    }

    public String getCodubi() {
        return codubi;
    }

    public void setCodubi(String codubi) {
        this.codubi = codubi;
    }

    public String getDepubi() {
        return depubi;
    }

    public void setDepubi(String depubi) {
        this.depubi = depubi;
    }

    public String getProvubi() {
        return provubi;
    }

    public void setProvubi(String provubi) {
        this.provubi = provubi;
    }

    public String getDistubi() {
        return distubi;
    }

    public void setDistubi(String distubi) {
        this.distubi = distubi;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codubi != null ? codubi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ubigeos)) {
            return false;
        }
        Ubigeos other = (Ubigeos) object;
        if ((this.codubi == null && other.codubi != null) || (this.codubi != null && !this.codubi.equals(other.codubi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidad.Ubigeos[ codubi=" + codubi + " ]";
    }
    
}
