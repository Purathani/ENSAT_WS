/**
 * Entity class for AccBiomaterialFreezerInformation
 */
package unimelb.ensat.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author purat
 */
@Entity
@Table(name = "acc_biomaterial_freezer_information")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findAll", query = "SELECT a FROM AccBiomaterialFreezerInformation a"),
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findByAccBiomaterialLocationId", query = "SELECT a FROM AccBiomaterialFreezerInformation a WHERE a.accBiomaterialFreezerInformationPK.accBiomaterialLocationId = :accBiomaterialLocationId"),
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findByAccBiomaterialId", query = "SELECT a FROM AccBiomaterialFreezerInformation a WHERE a.accBiomaterialFreezerInformationPK.accBiomaterialId = :accBiomaterialId"),
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findByEnsatId", query = "SELECT a FROM AccBiomaterialFreezerInformation a WHERE a.accBiomaterialFreezerInformationPK.ensatId = :ensatId"),
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findByCenterId", query = "SELECT a FROM AccBiomaterialFreezerInformation a WHERE a.accBiomaterialFreezerInformationPK.centerId = :centerId"),
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findByAliquotSequenceId", query = "SELECT a FROM AccBiomaterialFreezerInformation a WHERE a.aliquotSequenceId = :aliquotSequenceId"),
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findByMaterial", query = "SELECT a FROM AccBiomaterialFreezerInformation a WHERE a.material = :material"),
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findByFreezerNumber", query = "SELECT a FROM AccBiomaterialFreezerInformation a WHERE a.freezerNumber = :freezerNumber"),
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findByFreezershelfNumber", query = "SELECT a FROM AccBiomaterialFreezerInformation a WHERE a.freezershelfNumber = :freezershelfNumber"),
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findByRackNumber", query = "SELECT a FROM AccBiomaterialFreezerInformation a WHERE a.rackNumber = :rackNumber"),
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findByShelfNumber", query = "SELECT a FROM AccBiomaterialFreezerInformation a WHERE a.shelfNumber = :shelfNumber"),
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findByBoxNumber", query = "SELECT a FROM AccBiomaterialFreezerInformation a WHERE a.boxNumber = :boxNumber"),
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findByPositionNumber", query = "SELECT a FROM AccBiomaterialFreezerInformation a WHERE a.positionNumber = :positionNumber"),
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findByBioId", query = "SELECT a FROM AccBiomaterialFreezerInformation a WHERE a.bioId = :bioId"),
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findByMaterialUsed", query = "SELECT a FROM AccBiomaterialFreezerInformation a WHERE a.materialUsed = :materialUsed"),
    @NamedQuery(name = "AccBiomaterialFreezerInformation.findByMaterialTransferred", query = "SELECT a FROM AccBiomaterialFreezerInformation a WHERE a.materialTransferred = :materialTransferred")})
public class AccBiomaterialFreezerInformation implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AccBiomaterialFreezerInformationPK accBiomaterialFreezerInformationPK = new AccBiomaterialFreezerInformationPK();
    @Basic(optional = false)
    @NotNull
    @Column(name = "aliquot_sequence_id")
    private int aliquotSequenceId;
    @Size(max = 100)
    @Column(name = "material")
    private String material;
    @Size(max = 10)
    @Column(name = "freezer_number")
    private String freezerNumber;
    @Size(max = 10)
    @Column(name = "freezershelf_number")
    private String freezershelfNumber;
    @Size(max = 10)
    @Column(name = "rack_number")
    private String rackNumber;
    @Size(max = 10)
    @Column(name = "shelf_number")
    private String shelfNumber;
    @Size(max = 10)
    @Column(name = "box_number")
    private String boxNumber;
    @Size(max = 10)
    @Column(name = "position_number")
    private String positionNumber;
    @Size(max = 100)
    @Column(name = "bio_id")
    private String bioId;
    @Size(max = 4)
    @Column(name = "material_used")
    private String materialUsed;
    @Size(max = 100)
    @Column(name = "material_transferred")
    private String materialTransferred;

    public AccBiomaterialFreezerInformation() {
    }

    public AccBiomaterialFreezerInformation(AccBiomaterialFreezerInformationPK accBiomaterialFreezerInformationPK) {
        this.accBiomaterialFreezerInformationPK = accBiomaterialFreezerInformationPK;
    }

    public AccBiomaterialFreezerInformation(AccBiomaterialFreezerInformationPK accBiomaterialFreezerInformationPK, int aliquotSequenceId) {
        this.accBiomaterialFreezerInformationPK = accBiomaterialFreezerInformationPK;
        this.aliquotSequenceId = aliquotSequenceId;
    }

    public AccBiomaterialFreezerInformation(int accBiomaterialLocationId, int accBiomaterialId, int ensatId, String centerId) {
        this.accBiomaterialFreezerInformationPK = new AccBiomaterialFreezerInformationPK(accBiomaterialLocationId, accBiomaterialId, ensatId, centerId);
    }

    public AccBiomaterialFreezerInformationPK getAccBiomaterialFreezerInformationPK() {
        return accBiomaterialFreezerInformationPK;
    }

    public void setAccBiomaterialFreezerInformationPK(AccBiomaterialFreezerInformationPK accBiomaterialFreezerInformationPK) {
        this.accBiomaterialFreezerInformationPK = accBiomaterialFreezerInformationPK;
    }

    public int getAliquotSequenceId() {
        return aliquotSequenceId;
    }

    public void setAliquotSequenceId(int aliquotSequenceId) {
        this.aliquotSequenceId = aliquotSequenceId;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFreezerNumber() {
        return freezerNumber;
    }

    public void setFreezerNumber(String freezerNumber) {
        this.freezerNumber = freezerNumber;
    }

    public String getFreezershelfNumber() {
        return freezershelfNumber;
    }

    public void setFreezershelfNumber(String freezershelfNumber) {
        this.freezershelfNumber = freezershelfNumber;
    }

    public String getRackNumber() {
        return rackNumber;
    }

    public void setRackNumber(String rackNumber) {
        this.rackNumber = rackNumber;
    }

    public String getShelfNumber() {
        return shelfNumber;
    }

    public void setShelfNumber(String shelfNumber) {
        this.shelfNumber = shelfNumber;
    }

    public String getBoxNumber() {
        return boxNumber;
    }

    public void setBoxNumber(String boxNumber) {
        this.boxNumber = boxNumber;
    }

    public String getPositionNumber() {
        return positionNumber;
    }

    public void setPositionNumber(String positionNumber) {
        this.positionNumber = positionNumber;
    }

    public String getBioId() {
        return bioId;
    }

    public void setBioId(String bioId) {
        this.bioId = bioId;
    }

    public String getMaterialUsed() {
        return materialUsed;
    }

    public void setMaterialUsed(String materialUsed) {
        this.materialUsed = materialUsed;
    }

    public String getMaterialTransferred() {
        return materialTransferred;
    }

    public void setMaterialTransferred(String materialTransferred) {
        this.materialTransferred = materialTransferred;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accBiomaterialFreezerInformationPK != null ? accBiomaterialFreezerInformationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccBiomaterialFreezerInformation)) {
            return false;
        }
        AccBiomaterialFreezerInformation other = (AccBiomaterialFreezerInformation) object;
        if ((this.accBiomaterialFreezerInformationPK == null && other.accBiomaterialFreezerInformationPK != null) || (this.accBiomaterialFreezerInformationPK != null && !this.accBiomaterialFreezerInformationPK.equals(other.accBiomaterialFreezerInformationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "unimelb.ensat.entity.AccBiomaterialFreezerInformation[ accBiomaterialFreezerInformationPK=" + accBiomaterialFreezerInformationPK + " ]";
    }

}
