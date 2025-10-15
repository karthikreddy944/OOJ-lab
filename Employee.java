class Employee{
    String empId;
    int salary;
    String name;

    public Employee(String empId,int salary,String name){
        this.empId=empId;
        this.salary=salary;
        this.name=name;
    }

    public void display(){
        System.out.println("Employee Id: "+this.empId);
        System.out.println("Salary of the Employee: "+this.salary);
        System.out.println("Name of the Employee: "+this.name);
    }

    public static void main(String arr[]){
        Employee emp=new Employee("1TGH376",200000,"Karthik");
        emp.display();
    }
}