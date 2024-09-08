public class SilverPlan extends HealthInsurancePlan {
    SilverPlan() {
        setCoverage(0.7);
    }

    @Override
    public double computeMonthlyPremium(double salary) {
        return salary*0.06;
    }
}