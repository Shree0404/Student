public class Student {
    String name ;
    int age ;
    String dob;
    

    void details(String n,int a,String d){
        this.name=n;
        this.age=a;
        this.dob=d;
    }

    void display(){
        System.out.println("Student Name:"+ name);
        System.out.println("Age:"+age);        
        System.out.println("Date of Birth:"+dob);        

    }

    public static void main(String[] args) {

        Student s1= new Student();
        s1.details("Sandy", 21,"24-April-2004");

        s1.display();
    }
             
}
