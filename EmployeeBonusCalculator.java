import java.util.Random;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] employeeData = new int[10][2]; // [salary, years of service]
        double[][] updatedData = new double[10][2]; // [new salary, bonus amount]
        
        // Generate random salary (between 10000 and 99999) and years of service (between 1 and 10)
        for (int i = 0; i < 10; i++) {
            employeeData[i][0] = 10000 + random.nextInt(90000);
            employeeData[i][1] = 1 + random.nextInt(10);
        }
        
        // Calculate bonus and new salary
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;
        for (int i = 0; i < 10; i++) {
            double bonusPercentage = (employeeData[i][1] > 5) ? 0.05 : 0.02;
            double bonusAmount = employeeData[i][0] * bonusPercentage;
            double newSalary = employeeData[i][0] + bonusAmount;
            
            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonusAmount;
            
            totalOldSalary += employeeData[i][0];
            totalNewSalary += newSalary;
            totalBonus += bonusAmount;
        }
        
        // Display results in a tabular format
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Emp ID", "Old Salary", "Years", "New Salary", "Bonus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.2f %-10.2f\n", (i + 1), employeeData[i][0], employeeData[i][1], updatedData[i][0], updatedData[i][1]);
        }
        
        // Display totals
        
        System.out.printf("%-10s %-10.2f %-10s %-10.2f %-10.2f\n", "Total", totalOldSalary, "", totalNewSalary, totalBonus);
    }
}
