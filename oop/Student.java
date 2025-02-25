public class Student{
private String name;
private String regNo=107;
private double cgpa;
private String address;
private String phoneNumber;
private static int counter=1;


//constructor
public Student(String name,double cgpa,String phoneNumber,String address){
this.name=name;
this.cgpa=cgpa;
this.phoneNumber=phoneNumber;
this.address=address;
regNo=String.format""+ ++counter""
}
//Displaying Power details
public void display(){
System.out.println("Name : %s /n ", name);
System.out.println("regNo: %s /n ",regNo);
System.out.println("CGPA: %f /n ",cgpa);
System.out.println("phone Number:%s \n", phonenumber);
System.out.println("Address: %s \n",address);

}public void setCGPA(double gpa){
if(cgpa>0)
this.cgpa=cgpa;
//
public class Main{
public static void main(string args[]){
//Student(String name,String address,double cgpa,String phoneNumber){
Student std1=new;
Student("Bushra","Lahore",3.0,"1111");
Student std2=new Student("Zoha","Lahore",3.0,"22222");
