import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract class EmployeeWageCalculator {
    private int ratePerHour;
    private int workingDays;
    private String companyName;
    public int partTime = 0, fullTime = 0, hourSum = 0;

    public EmployeeWageCalculator(String companyName, int workingDays, int ratePerHour) {
        this.companyName = companyName;
        this.workingDays = workingDays;
        this.ratePerHour = ratePerHour;
    }

    abstract void compute();

    public int getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(int ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}

class WageCalculator extends EmployeeWageCalculator {
    public WageCalculator(String companyName, int workingDays, int ratePerHour) {
        super(companyName, workingDays, ratePerHour);
    }

    public void compute() {
        System.out.println("For company " + getCompanyName() + ", we are calculating its employee wage:");
        Random random = new Random();

        for (int i = 0; i < getWorkingDays(); i++) {
            int hourDaily = random.nextInt(10);
            if (hourDaily <= 4) {
                partTime++;
                System.out.println("It's part-time wage of the day: " + hourDaily * getRatePerHour());
            } else {
                System.out.println("It's full-time wage of the day: " + hourDaily * getRatePerHour());
                fullTime++;
            }
            hourSum += hourDaily;
        }

        System.out.println("Total part-time count is " + partTime + ", total full-time count is " + fullTime);
        System.out.println("Total hour count worked for the month with working days " + getWorkingDays() + " is " + hourSum);
        System.out.println("Monthly wage of employee is " + hourSum * getRatePerHour() + "\n");
    }
}

class CompanyWageManager {
    private List<EmployeeWageCalculator> companies;

    public CompanyWageManager() {
        this.companies = new ArrayList<>();
    }

    public void addCompany(EmployeeWageCalculator company) {
        companies.add(company);
    }

    public void calculateWagesForAllCompanies() {
        for (EmployeeWageCalculator company : companies) {
            company.compute();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CompanyWageManager wageManager = new CompanyWageManager();

        // Add companies
        wageManager.addCompany(new WageCalculator("JIO", 20, 100));
        wageManager.addCompany(new WageCalculator("VODAFONE", 25, 60));

        // Calculate wages for all companies
        wageManager.calculateWagesForAllCompanies();
    }
}
