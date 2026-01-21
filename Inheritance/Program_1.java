package Inheritance;

class use{
    public static void main(String[] args) {

        // store data into object - for this use setter method.
        Student s =  new Student();
        s.setId(1001);
        s.setName("Raju");
        s.setAddress("Premnagar");
        s.setMarks(100);

        // retrieve data using getter methods and display
        System.out.println("id : "+s.getId());
        System.out.println("Name : "+s.getName());
        System.out.println("Address : "+s.getAddress());
        System.out.println("Marks : "+s.getMarks());
    }
}

