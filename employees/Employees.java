package employees;

class Employee {
    String firstName;
    String lastName;
    String employeeTitle;
    static String company;

    static {
        company = "Frosted Plates";

        System.out.println("static block called!");
        System.out.println("----------------------");
    }

    public Employee(String firstName, String lastName, String employeeTitle){
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeTitle = employeeTitle;
        System.out.println("Constructor called ");
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getEmployeeTitle(){
        return this.employeeTitle;
    }

}