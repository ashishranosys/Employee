class ContactInfo extends Person{
    protected long phone;
    public ContactInfo(){
        phone=1234567895L;
    }
    public ContactInfo(String name,String surname,long phone){
        super(name,surname);
        this.phone=phone;
    }
    public ContactInfo(ContactInfo c){
        super(c);
        phone=c.phone;
    }
    public void show(){
        super.show();
        System.out.println("phone : "+phone);
    }
}
