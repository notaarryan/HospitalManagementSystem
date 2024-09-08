public class BronzePlan extends HealthInsurancePlan {
    BronzePlan() {
        setCoverage(0.6);
    }

    @Override
    public double computeMonthlyPremium(double salary) {
        return salary*0.05;
    }
}