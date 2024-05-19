import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Plan {
    protected double rate;
    abstract void getRate();

    public void calculateBill(double units) {
        System.out.println(units * rate);
    }
}

class DomesticPlan extends Plan {
    public void getRate() {
        rate = 3.50;
    }
}

class CommercialPlan extends Plan {
    public void getRate() {
        rate = 7.50;
    }
}

class InstitutionalPlan extends Plan {
    public void getRate() {
        rate = 5.50;
    }
}

class GetPlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("domestic")) {
            return new DomesticPlan();
        } else if (planType.equalsIgnoreCase("commercial")) {
            return new CommercialPlan();
        } else if (planType.equalsIgnoreCase("institutional")) {
            return new InstitutionalPlan();
        }
        return null;
    }
}

public class FactoryMethod {
    public static void main(String[] args) throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String planName = br.readLine();
        System.out.println("Enter the amount of units you would like to calculate: ");
        double units = Double.parseDouble(br.readLine());

        Plan p = planFactory.getPlan(planName);
        if (p != null) {
            System.out.println("Bill Amount for " + planName + " of " + units + " units:");
            p.getRate();
            p.calculateBill(units);
        } else {
            System.out.println("Invalid plan type entered.");
        }
    }
}
