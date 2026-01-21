package Inheritance;

class Teacher{
    int id;
    String name;
    String address;
    float sal;

    public void setId(int id){
        this.id=id;
    }
    int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address=address;
    }
    String getAddress(){
        return address;
    }
    public void setSal(float sal){
        this.sal=sal;
    }
    float getSal(){
        return sal;
    }
}

