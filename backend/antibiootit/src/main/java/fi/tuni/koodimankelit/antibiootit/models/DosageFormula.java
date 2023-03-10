package fi.tuni.koodimankelit.antibiootit.models;

/**
 * Represents how antibiotic dosage result was calculated
 */
public class DosageFormula {

    private final Measurement strength;
    private final Measurement dosage;


    /**
     * Default constructor
     * @param strength strength of the antibiotic
     * @param dosage How much needs to be given according to weight
     */
    public DosageFormula(Measurement strength, Measurement dosage) {
        this.strength = strength;
        this.dosage = dosage;
    }


    
    /** 
     * Returns the strength of the antibiotic
     * @return Measurement strength
     */
    public Measurement getStrength() {
        return this.strength;
    }


    
    /** 
     * Returns how much antibiotic needs to be given according to weight
     * @return Measurement dosage
     */
    public Measurement getDosage() {
        return this.dosage;
    }


}
