/**
 * Entity class for AccBiomaterial
 */
package unimelb.ensat.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author purat
 */
@Entity
@Table(name = "acc_biomaterial")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccBiomaterial.findAll", query = "SELECT a FROM AccBiomaterial a"),
    @NamedQuery(name = "AccBiomaterial.findByAccBiomaterialId", query = "SELECT a FROM AccBiomaterial a WHERE a.accBiomaterialPK.accBiomaterialId = :accBiomaterialId"),
    @NamedQuery(name = "AccBiomaterial.findByEnsatId", query = "SELECT a FROM AccBiomaterial a WHERE a.accBiomaterialPK.ensatId = :ensatId"),
    @NamedQuery(name = "AccBiomaterial.findByCenterId", query = "SELECT a FROM AccBiomaterial a WHERE a.accBiomaterialPK.centerId = :centerId"),
    @NamedQuery(name = "AccBiomaterial.findByBiomaterialDate", query = "SELECT a FROM AccBiomaterial a WHERE a.biomaterialDate = :biomaterialDate"),
    @NamedQuery(name = "AccBiomaterial.findByTumorTissueFrozen", query = "SELECT a FROM AccBiomaterial a WHERE a.tumorTissueFrozen = :tumorTissueFrozen"),
    @NamedQuery(name = "AccBiomaterial.findByTumorTissueEnsatSop", query = "SELECT a FROM AccBiomaterial a WHERE a.tumorTissueEnsatSop = :tumorTissueEnsatSop"),
    @NamedQuery(name = "AccBiomaterial.findByTumorTissueParaffin", query = "SELECT a FROM AccBiomaterial a WHERE a.tumorTissueParaffin = :tumorTissueParaffin"),
    @NamedQuery(name = "AccBiomaterial.findByTumorTissueDna", query = "SELECT a FROM AccBiomaterial a WHERE a.tumorTissueDna = :tumorTissueDna"),
    @NamedQuery(name = "AccBiomaterial.findByLeukocyteDna", query = "SELECT a FROM AccBiomaterial a WHERE a.leukocyteDna = :leukocyteDna"),
    @NamedQuery(name = "AccBiomaterial.findByPlasma", query = "SELECT a FROM AccBiomaterial a WHERE a.plasma = :plasma"),
    @NamedQuery(name = "AccBiomaterial.findByHeparinPlasma", query = "SELECT a FROM AccBiomaterial a WHERE a.heparinPlasma = :heparinPlasma"),
    @NamedQuery(name = "AccBiomaterial.findBySerum", query = "SELECT a FROM AccBiomaterial a WHERE a.serum = :serum"),
    @NamedQuery(name = "AccBiomaterial.findByHUrine", query = "SELECT a FROM AccBiomaterial a WHERE a.hUrine = :hUrine"),
    @NamedQuery(name = "AccBiomaterial.findByHUrineVol", query = "SELECT a FROM AccBiomaterial a WHERE a.hUrineVol = :hUrineVol"),
    @NamedQuery(name = "AccBiomaterial.findBySpotUrine", query = "SELECT a FROM AccBiomaterial a WHERE a.spotUrine = :spotUrine"),
    @NamedQuery(name = "AccBiomaterial.findByNormalTissue", query = "SELECT a FROM AccBiomaterial a WHERE a.normalTissue = :normalTissue"),
    @NamedQuery(name = "AccBiomaterial.findByNormalTissueParaffin", query = "SELECT a FROM AccBiomaterial a WHERE a.normalTissueParaffin = :normalTissueParaffin"),
    @NamedQuery(name = "AccBiomaterial.findByNormalTissueDna", query = "SELECT a FROM AccBiomaterial a WHERE a.normalTissueDna = :normalTissueDna"),
    @NamedQuery(name = "AccBiomaterial.findByWholeBlood", query = "SELECT a FROM AccBiomaterial a WHERE a.wholeBlood = :wholeBlood"),
    @NamedQuery(name = "AccBiomaterial.findByBloodClot", query = "SELECT a FROM AccBiomaterial a WHERE a.bloodClot = :bloodClot"),
    @NamedQuery(name = "AccBiomaterial.findByAssociatedStudy", query = "SELECT a FROM AccBiomaterial a WHERE a.associatedStudy = :associatedStudy"),
    @NamedQuery(name = "AccBiomaterial.findByAssociatedStudyPhaseVisit", query = "SELECT a FROM AccBiomaterial a WHERE a.associatedStudyPhaseVisit = :associatedStudyPhaseVisit"),
    @NamedQuery(name = "AccBiomaterial.findByFreezerInformation", query = "SELECT a FROM AccBiomaterial a WHERE a.freezerInformation = :freezerInformation")})
public class AccBiomaterial implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @EmbeddedId
    protected AccBiomaterialPK accBiomaterialPK = new AccBiomaterialPK();
    @Column(name = "biomaterial_date")
    @Temporal(TemporalType.DATE)
    private Date biomaterialDate;
    @Size(max = 14)
    @Column(name = "tumor_tissue_frozen")
    private String tumorTissueFrozen;
    @Size(max = 14)
    @Column(name = "tumor_tissue_ensat_sop")
    private String tumorTissueEnsatSop;
    @Size(max = 14)
    @Column(name = "tumor_tissue_paraffin")
    private String tumorTissueParaffin;
    @Size(max = 4)
    @Column(name = "tumor_tissue_dna")
    private String tumorTissueDna;
    @Size(max = 14)
    @Column(name = "leukocyte_dna")
    private String leukocyteDna;
    @Size(max = 14)
    @Column(name = "plasma")
    private String plasma;
    @Size(max = 30)
    @Column(name = "heparin_plasma")
    private String heparinPlasma;
    @Size(max = 14)
    @Column(name = "serum")
    private String serum;
    @Size(max = 14)
    @Column(name = "24h_urine")
    private String hUrine;
    @Size(max = 30)
    @Column(name = "24h_urine_vol")
    private String hUrineVol;
    @Size(max = 14)
    @Column(name = "spot_urine")
    private String spotUrine;
    @Size(max = 40)
    @Column(name = "normal_tissue")
    private String normalTissue;
    @Size(max = 40)
    @Column(name = "normal_tissue_paraffin")
    private String normalTissueParaffin;
    @Size(max = 40)
    @Column(name = "normal_tissue_dna")
    private String normalTissueDna;
    @Size(max = 14)
    @Column(name = "whole_blood")
    private String wholeBlood;
    @Size(max = 30)
    @Column(name = "blood_clot")
    private String bloodClot;
    @Size(max = 100)
    @Column(name = "associated_study")
    private String associatedStudy;
    @Size(max = 100)
    @Column(name = "associated_study_phase_visit")
    private String associatedStudyPhaseVisit;
    @Size(max = 100)
    @Column(name = "freezer_information")
    private String freezerInformation;

    public AccBiomaterial() {
    }

    public AccBiomaterial(AccBiomaterialPK accBiomaterialPK) {
        this.accBiomaterialPK = accBiomaterialPK;
    }

    public AccBiomaterial(int accBiomaterialId, int ensatId, String centerId) {
        this.accBiomaterialPK = new AccBiomaterialPK(accBiomaterialId, ensatId, centerId);
    }

    public AccBiomaterialPK getAccBiomaterialPK() {
        return accBiomaterialPK;
    }

    public void setAccBiomaterialPK(AccBiomaterialPK accBiomaterialPK) {
        this.accBiomaterialPK = accBiomaterialPK;
    }

    public Date getBiomaterialDate() {
        return biomaterialDate;
    }

    public void setBiomaterialDate(Date biomaterialDate) {
        this.biomaterialDate = biomaterialDate;
    }

    public String getTumorTissueFrozen() {
        return tumorTissueFrozen;
    }

    public void setTumorTissueFrozen(String tumorTissueFrozen) {
        this.tumorTissueFrozen = tumorTissueFrozen;
    }

    public String getTumorTissueEnsatSop() {
        return tumorTissueEnsatSop;
    }

    public void setTumorTissueEnsatSop(String tumorTissueEnsatSop) {
        this.tumorTissueEnsatSop = tumorTissueEnsatSop;
    }

    public String getTumorTissueParaffin() {
        return tumorTissueParaffin;
    }

    public void setTumorTissueParaffin(String tumorTissueParaffin) {
        this.tumorTissueParaffin = tumorTissueParaffin;
    }

    public String getTumorTissueDna() {
        return tumorTissueDna;
    }

    public void setTumorTissueDna(String tumorTissueDna) {
        this.tumorTissueDna = tumorTissueDna;
    }

    public String getLeukocyteDna() {
        return leukocyteDna;
    }

    public void setLeukocyteDna(String leukocyteDna) {
        this.leukocyteDna = leukocyteDna;
    }

    public String getPlasma() {
        return plasma;
    }

    public void setPlasma(String plasma) {
        this.plasma = plasma;
    }

    public String getHeparinPlasma() {
        return heparinPlasma;
    }

    public void setHeparinPlasma(String heparinPlasma) {
        this.heparinPlasma = heparinPlasma;
    }

    public String getSerum() {
        return serum;
    }

    public void setSerum(String serum) {
        this.serum = serum;
    }

    public String getHUrine() {
        return hUrine;
    }

    public void setHUrine(String hUrine) {
        this.hUrine = hUrine;
    }

    public String getHUrineVol() {
        return hUrineVol;
    }

    public void setHUrineVol(String hUrineVol) {
        this.hUrineVol = hUrineVol;
    }

    public String getSpotUrine() {
        return spotUrine;
    }

    public void setSpotUrine(String spotUrine) {
        this.spotUrine = spotUrine;
    }

    public String getNormalTissue() {
        return normalTissue;
    }

    public void setNormalTissue(String normalTissue) {
        this.normalTissue = normalTissue;
    }

    public String getNormalTissueParaffin() {
        return normalTissueParaffin;
    }

    public void setNormalTissueParaffin(String normalTissueParaffin) {
        this.normalTissueParaffin = normalTissueParaffin;
    }

    public String getNormalTissueDna() {
        return normalTissueDna;
    }

    public void setNormalTissueDna(String normalTissueDna) {
        this.normalTissueDna = normalTissueDna;
    }

    public String getWholeBlood() {
        return wholeBlood;
    }

    public void setWholeBlood(String wholeBlood) {
        this.wholeBlood = wholeBlood;
    }

    public String getBloodClot() {
        return bloodClot;
    }

    public void setBloodClot(String bloodClot) {
        this.bloodClot = bloodClot;
    }

    public String getAssociatedStudy() {
        return associatedStudy;
    }

    public void setAssociatedStudy(String associatedStudy) {
        this.associatedStudy = associatedStudy;
    }

    public String getAssociatedStudyPhaseVisit() {
        return associatedStudyPhaseVisit;
    }

    public void setAssociatedStudyPhaseVisit(String associatedStudyPhaseVisit) {
        this.associatedStudyPhaseVisit = associatedStudyPhaseVisit;
    }

    public String getFreezerInformation() {
        return freezerInformation;
    }

    public void setFreezerInformation(String freezerInformation) {
        this.freezerInformation = freezerInformation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accBiomaterialPK != null ? accBiomaterialPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccBiomaterial)) {
            return false;
        }
        AccBiomaterial other = (AccBiomaterial) object;
        if ((this.accBiomaterialPK == null && other.accBiomaterialPK != null) || (this.accBiomaterialPK != null && !this.accBiomaterialPK.equals(other.accBiomaterialPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "unimelb.ensat.entity.AccBiomaterial[ accBiomaterialPK=" + accBiomaterialPK + " ]";
    }
    
}
