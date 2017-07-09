
public class Assignment31
{

   
   public String name;

   //Instance variable//
   private double salary;
   
   //static variable//
   private static double averageSalary;

   public static final String DEPARTMENT = "Department1 ";

   public Assignment31 (String empName) {
      name = empName;
   }


   public void setSalary(double empSal) {
      salary = empSal;
   }

 
   public void printEmp() {
      System.out.println("name  : " + name );
      System.out.println("salary :" + salary);
   }

   public static void main(String args[]) {
      Assignment31 empOne = new Assignment31("Ishan");
      empOne.setSalary(1000);
      empOne.printEmp();
      averageSalary = 800;
      System.out.println(DEPARTMENT + ": Average Income In this Department is " + averageSalary);
   }
}