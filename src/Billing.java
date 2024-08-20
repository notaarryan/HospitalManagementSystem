public class Billing {

    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];
        double paymentByInsurance = 0.0;

        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        if(patientInsurancePlan != null) {
            paymentByInsurance = patientInsurancePlan.getCoverage()*amount;
            payments[0] = paymentByInsurance;
        }

        if (patientInsurancePlan instanceof PlatinumPlan) {
            payments[1] = amount - paymentByInsurance - 50;
        } else if (patientInsurancePlan instanceof GoldPlan) {
            payments[1] = amount - paymentByInsurance - 40;
        } else if (patientInsurancePlan instanceof SilverPlan) {
            payments[1] = amount - paymentByInsurance - 30;
        } else if (patientInsurancePlan instanceof BronzePlan) {
            payments[1] = amount - paymentByInsurance - 25;
        } else {
            payments[1] = amount - 20;
        }

        return payments;
    }

}