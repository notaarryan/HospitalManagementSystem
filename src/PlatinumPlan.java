public class PlatinumPlan extends HealthInsurancePlan{
    PlatinumPlan() {
        setCoverage(0.9);
    }

    @Override
    public double computeMonthlyPremium(double salary) {
        return salary*0.08;
    }
}
