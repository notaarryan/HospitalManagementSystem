public class Billing {

    public static double[] computePaymentAmount(Patient patient, double amount) {
        double[] payments = new double[2];

        HealthInsurancePlan patientInsurancePlan = patient.getInsurancePlan();

        if (patientInsurancePlan == null) {
            payments[0] = 0.0;
            payments[1] = amount;
        } else {
            double coverage = patientInsurancePlan.getCoverage();
            payments[0] = coverage;
            payments[1] = amount-coverage;
        }

        return payments;
    }

}