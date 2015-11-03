/*
 * Primary key class for AccBiomaterial
 */
package unimelb.ensat.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author purat
 */
@Embeddable
public class AccBiomaterialPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "acc_biomaterial_id")
    private int accBiomaterialId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ensat_id")
    private int ensatId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "center_id")
    private String centerId;

    public AccBiomaterialPK() {
    }

    public AccBiomaterialPK(int accBiomaterialId, int ensatId, String centerId) {
        this.accBiomaterialId = accBiomaterialId;
        this.ensatId = ensatId;
        this.centerId = centerId;
    }

    public int getAccBiomaterialId() {
        return accBiomaterialId;
    }

    public void setAccBiomaterialId(int accBiomaterialId) {
        this.accBiomaterialId = accBiomaterialId;
    }

    public int getEnsatId() {
        return ensatId;
    }

    public void setEnsatId(int ensatId) {
        this.ensatId = ensatId;
    }

    public String getCenterId() {
        return centerId;
    }

    public void setCenterId(String centerId) {
        this.centerId = centerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) accBiomaterialId;
        hash += (int) ensatId;
        hash += (centerId != null ? centerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccBiomaterialPK)) {
            return false;
        }
        AccBiomaterialPK other = (AccBiomaterialPK) object;
        if (this.accBiomaterialId != other.accBiomaterialId) {
            return false;
        }
        if (this.ensatId != other.ensatId) {
            return false;
        }
        if ((this.centerId == null && other.centerId != null) || (this.centerId != null && !this.centerId.equals(other.centerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "unimelb.ensat.entity.AccBiomaterialPK[ accBiomaterialId=" + accBiomaterialId + ", ensatId=" + ensatId + ", centerId=" + centerId + " ]";
    }
    
}
