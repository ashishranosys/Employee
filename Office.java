class Office{
    public static void main(String args[]){
        Employee e1 = new Employee();
        Employee e2 = new Employee("name2","surname2",1122334455,11111);
        Employee e3 = new Employee(e2);
        e1.show();
        e2.show();
        e3.show();
    }
}
