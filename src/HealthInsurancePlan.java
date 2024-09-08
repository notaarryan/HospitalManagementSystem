public abstract class HealthInsurancePlan {
    private double coverage;
    public abstract double computeMonthlyPremium(double salary);

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    private InsuranceBrand offeredBy;

    public InsuranceBrand getOfferedBy() {
        return offeredBy;
    }

    public void setOfferedBy(InsuranceBrand offeredBy) {
        this.offeredBy = offeredBy;
    }
}
