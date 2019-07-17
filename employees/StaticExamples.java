package employees;
 
 class StaticExamples {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Yannick", "Davids", "Cleaner");
        System.out.println("------------------");
        Employee employee2 = new Employee("Tanisha", "Johnson", "Supervisor");
        System.out.println("------------------");

        System.out.println(employee1.company);
        System.out.println("------------------");
        System.out.println(employee2.company);
    }

}