/**
 * Entity class for AccBiomaterialAliquotsTransfer
 */
package unimelb.ensat.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * @author purat
 */
@Entity
@Table(name = "acc_biomaterial_aliquots_transfer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccBiomaterialAliquotsTransfer.findAll", query = "SELECT a FROM AccBiomaterialAliquotsTransfer a"),
    @NamedQuery(name = "AccBiomaterialAliquotsTransfer.findByAccBiomaterialTransferId", query = "SELECT a FROM AccBiomaterialAliquotsTransfer a WHERE a.accBiomaterialTransferId = :accBiomaterialTransferId"),
    @NamedQuery(name = "AccBiomaterialAliquotsTransfer.findByAccBiomaterialId", query = "SELECT a FROM AccBiomaterialAliquotsTransfer a WHERE a.accBiomaterialId = :accBiomaterialId"),
    @NamedQuery(name = "AccBiomaterialAliquotsTransfer.findByEnsatId", query = "SELECT a FROM AccBiomaterialAliquotsTransfer a WHERE a.ensatId = :ensatId"),
    @NamedQuery(name = "AccBiomaterialAliquotsTransfer.findByCenterId", query = "SELECT a FROM AccBiomaterialAliquotsTransfer a WHERE a.centerId = :centerId"),
    @NamedQuery(name = "AccBiomaterialAliquotsTransfer.findByAccBiomaterialLocationId", query = "SELECT a FROM AccBiomaterialAliquotsTransfer a WHERE a.accBiomaterialLocationId = :accBiomaterialLocationId"),
    @NamedQuery(name = "AccBiomaterialAliquotsTransfer.findByAccBiomaterialTransferGroupId", query = "SELECT a FROM AccBiomaterialAliquotsTransfer a WHERE a.accBiomaterialTransferGroupId = :accBiomaterialTransferGroupId"),
    @NamedQuery(name = "AccBiomaterialAliquotsTransfer.findByDestinationCenterId", query = "SELECT a FROM AccBiomaterialAliquotsTransfer a WHERE a.destinationCenterId = :destinationCenterId"),
    @NamedQuery(name = "AccBiomaterialAliquotsTransfer.findByTransferedDate", query = "SELECT a FROM AccBiomaterialAliquotsTransfer a WHERE a.transferedDate = :transferedDate"),
    @NamedQuery(name = "AccBiomaterialAliquotsTransfer.findByStatus", query = "SELECT a FROM AccBiomaterialAliquotsTransfer a WHERE a.status = :status")})
public class AccBiomaterialAliquotsTransfer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "acc_biomaterial_transfer_id")
    private Integer accBiomaterialTransferId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "acc_biomaterial_id")
    private int accBiomaterialId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ensat_id")
    private int ensatId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "center_id")
    private String centerId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "acc_biomaterial_location_id")
    private int accBiomaterialLocationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "acc_biomaterial_transfer_group_id")
    private int accBiomaterialTransferGroupId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "destination_center_id")
    private String destinationCenterId;
    @Column(name = "transfered_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transferedDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "status")
    private String status;

    public AccBiomaterialAliquotsTransfer() {
    }

    public AccBiomaterialAliquotsTransfer(Integer accBiomaterialTransferId) {
        this.accBiomaterialTransferId = accBiomaterialTransferId;
    }

    public AccBiomaterialAliquotsTransfer(Integer accBiomaterialTransferId, int accBiomaterialId, int ensatId, String centerId, int accBiomaterialLocationId, int accBiomaterialTransferGroupId, String destinationCenterId, String status) {
        this.accBiomaterialTransferId = accBiomaterialTransferId;
        this.accBiomaterialId = accBiomaterialId;
        this.ensatId = ensatId;
        this.centerId = centerId;
        this.accBiomaterialLocationId = accBiomaterialLocationId;
        this.accBiomaterialTransferGroupId = accBiomaterialTransferGroupId;
        this.destinationCenterId = destinationCenterId;
        this.status = status;
    }

    public Integer getAccBiomaterialTransferId() {
        return accBiomaterialTransferId;
    }

    public void setAccBiomaterialTransferId(Integer accBiomaterialTransferId) {
        this.accBiomaterialTransferId = accBiomaterialTransferId;
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

    public int getAccBiomaterialLocationId() {
        return accBiomaterialLocationId;
    }

    public void setAccBiomaterialLocationId(int accBiomaterialLocationId) {
        this.accBiomaterialLocationId = accBiomaterialLocationId;
    }

    public int getAccBiomaterialTransferGroupId() {
        return accBiomaterialTransferGroupId;
    }

    public void setAccBiomaterialTransferGroupId(int accBiomaterialTransferGroupId) {
        this.accBiomaterialTransferGroupId = accBiomaterialTransferGroupId;
    }

    public String getDestinationCenterId() {
        return destinationCenterId;
    }

    public void setDestinationCenterId(String destinationCenterId) {
        this.destinationCenterId = destinationCenterId;
    }

    public Date getTransferedDate() {
        return transferedDate;
    }

    public void setTransferedDate(Date transferedDate) {
        this.transferedDate = transferedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accBiomaterialTransferId != null ? accBiomaterialTransferId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccBiomaterialAliquotsTransfer)) {
            return false;
        }
        AccBiomaterialAliquotsTransfer other = (AccBiomaterialAliquotsTransfer) object;
        if ((this.accBiomaterialTransferId == null && other.accBiomaterialTransferId != null) || (this.accBiomaterialTransferId != null && !this.accBiomaterialTransferId.equals(other.accBiomaterialTransferId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "unimelb.ensat.entity.AccBiomaterialAliquotsTransfer[ accBiomaterialTransferId=" + accBiomaterialTransferId + " ]";
    }
    
}
