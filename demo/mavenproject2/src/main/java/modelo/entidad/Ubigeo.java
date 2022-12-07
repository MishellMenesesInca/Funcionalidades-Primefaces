/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "UBIGEO")
@NamedQueries({
    @NamedQuery(name = "Ubigeo.findAll", query = "SELECT u FROM Ubigeo u"),
    @NamedQuery(name = "Ubigeo.findByCodubi", query = "SELECT u FROM Ubigeo u WHERE u.codubi = :codubi"),
    @NamedQuery(name = "Ubigeo.findByDepubi", query = "SELECT u FROM Ubigeo u WHERE u.depubi = :depubi"),
    @NamedQuery(name = "Ubigeo.findByProubi", query = "SELECT u FROM Ubigeo u WHERE u.proubi = :proubi"),
    @NamedQuery(name = "Ubigeo.findByDisubi", query = "SELECT u FROM Ubigeo u WHERE u.disubi = :disubi")})
public class Ubigeo implements Serializable {

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
    @Column(name = "PROUBI")
    private String proubi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DISUBI")
    private String disubi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codubi")
    private List<Proveedor> proveedorList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codubi")
    private List<Persona> personaList;

    public Ubigeo() {
    }

    public Ubigeo(String codubi) {
        this.codubi = codubi;
    }

    public Ubigeo(String codubi, String depubi, String proubi, String disubi) {
        this.codubi = codubi;
        this.depubi = depubi;
        this.proubi = proubi;
        this.disubi = disubi;
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

    public String getProubi() {
        return proubi;
    }

    public void setProubi(String proubi) {
        this.proubi = proubi;
    }

    public String getDisubi() {
        return disubi;
    }

    public void setDisubi(String disubi) {
        this.disubi = disubi;
    }

    public List<Proveedor> getProveedorList() {
        return proveedorList;
    }

    public void setProveedorList(List<Proveedor> proveedorList) {
        this.proveedorList = proveedorList;
    }

    public List<Persona> getPersonaList() {
        return personaList;
    }

    public void setPersonaList(List<Persona> personaList) {
        this.personaList = personaList;
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
        if (!(object instanceof Ubigeo)) {
            return false;
        }
        Ubigeo other = (Ubigeo) object;
        if ((this.codubi == null && other.codubi != null) || (this.codubi != null && !this.codubi.equals(other.codubi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.entidad.Ubigeo[ codubi=" + codubi + " ]";
    }
    
}
