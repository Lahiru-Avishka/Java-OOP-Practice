class Customer {
    private String id;
    private String name;
    private int age;
    private double salary;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

class Demo {
    public static void main(String args[]) {
        Customer c1 = new Customer();
        c1.setId("C001"); // c1.id="C001";
        c1.setName("Nirot");// c1.name="Niroth";
        c1.setAge(10); // c1.age=10;
        c1.setSalary(3400); // c1.salary=3400;
        System.out.println("id : " + c1.getId());
        System.out.println("name : " + c1.getName());
        System.out.println("age : " + c1.getAge());
        System.out.println("salary : " + c1.getSalary());
    }
}