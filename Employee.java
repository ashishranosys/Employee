class Employee extends ContactInfo{
    protected double salary;
    public Employee(){
        salary=25000;
    }
    public Employee(String name,String surname,long phone,double salary){
        super(name,surname,phone);
        this.salary=salary;
    }
    public Employee(Employee e){
        super(e);
        salary=e.salary;
    }
    public void show(){
        super.show();
        System.out.println("Salary : "+salary);
    }
}

