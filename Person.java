class Person{
    protected String name;
    protected String surname;
    public Person(){
        name="name1";
        surname="surname1";
    }
    public Person(String n,String sn){
        this.name=n;
        this.surname=sn;
    }
    public Person(Person p){
        name=p.name;
        surname=p.surname;
    }
    public void show(){
        System.out.println(name+" "+surname);
    }
}
