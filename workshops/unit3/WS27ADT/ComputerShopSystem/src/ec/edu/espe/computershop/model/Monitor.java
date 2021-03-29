package ec.edu.espe.computershop.model;

public class Monitor {
    private String inputstypes;
    private int numberofinputs;
    private boolean electricityconsumption;
    private int frequency;
    private String definition;
    private String compatibility;

    public Monitor(String inputstypes, int numberofinputs, boolean electricityconsumption, int frequency, String definition, String compatibility) {
        this.inputstypes = inputstypes;
        this.numberofinputs = numberofinputs;
        this.electricityconsumption = electricityconsumption;
        this.frequency = frequency;
        this.definition = definition;
        this.compatibility = compatibility;
    }

    /**
     * @return the inputstypes
     */
    public String getInputstypes() {
        return inputstypes;
    }

    /**
     * @param inputstypes the inputstypes to set
     */
    public void setInputstypes(String inputstypes) {
        this.inputstypes = inputstypes;
    }

    /**
     * @return the numberofinputs
     */
    public int getNumberofinputs() {
        return numberofinputs;
    }

    /**
     * @param numberofinputs the numberofinputs to set
     */
    public void setNumberofinputs(int numberofinputs) {
        this.numberofinputs = numberofinputs;
    }

    /**
     * @return the electricityconsumption
     */
    public boolean isElectricityconsumption() {
        return electricityconsumption;
    }

    /**
     * @param electricityconsumption the electricityconsumption to set
     */
    public void setElectricityconsumption(boolean electricityconsumption) {
        this.electricityconsumption = electricityconsumption;
    }

    /**
     * @return the frequency
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * @param frequency the frequency to set
     */
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    /**
     * @return the definition
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * @param definition the definition to set
     */
    public void setDefinition(String definition) {
        this.definition = definition;
    }

    /**
     * @return the compatibility
     */
    public String getCompatibility() {
        return compatibility;
    }

    /**
     * @param compatibility the compatibility to set
     */
    public void setCompatibility(String compatibility) {
        this.compatibility = compatibility;
    }

}
