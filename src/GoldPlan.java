public class GoldPlan extends HealthInsurancePlan {
    GoldPlan() {
        setCoverage(0.8);
    }

    @Override
    public double computeMonthlyPremium(double salary) {
        return salary*0.07;
    }
}