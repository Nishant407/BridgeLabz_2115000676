import java.util.Random;

public class level3Q11 {

    public static double[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        double[][] employeeData = new double[numEmployees][2];
        
        for (int i = 0; i < numEmployees; i++) {
            double salary = rand.nextInt(90000) + 10000;
            int yearsOfService = rand.nextInt(20);
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }
        return employeeData;
    }

    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3];
        
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus = 0;
            
            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }
            
            double newSalary = salary + bonus;
            
            updatedData[i][0] = salary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }
        
        return updatedData;
    }

    public static void displayEmployeeBonusDetails(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        
        System.out.printf("%-10s%-20s%-15s%-15s\n", "Employee", "Old Salary", "Bonus", "New Salary");
        System.out.println("--------------------------------------------------------");
        
        for (int i = 0; i < updatedData.length; i++) {
            double oldSalary = updatedData[i][0];
            double bonus = updatedData[i][1];
            double newSalary = updatedData[i][2];
            
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
            
            System.out.printf("%-10d%-20.2f%-15.2f%-15.2f\n", i + 1, oldSalary, bonus, newSalary);
        }
        
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-20s%-15.2f%-15.2f%-15.2f\n", "Total", totalOldSalary, totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData);
        displayEmployeeBonusDetails(updatedData);
    }
}
