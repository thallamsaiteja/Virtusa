
import java.util.*;
class Student
{

    private int Studentid;
    private String Studentname;
    private String gender;
    private String aadharno;
    private int age;
    private String fathers_phonno;
    private String nationality;
    Student(int Studentid,String Studentname,int age,String gender,String aadharno,String fathers_phonno,String nationality)
    {
        this.Studentid=Studentid;
        this.Studentname=Studentname;
        this.age=age;
        this.gender=gender;
        this.aadharno=aadharno;
        this.fathers_phonno=fathers_phonno;
        this.nationality=nationality;
    }
    public int getStudentid()
    {
        return Studentid;
    }
    public String getStudentName()
    {
        return Studentname;
    }
    public int  getAge()
    {
        return age;
    }
    public String getGender()
    {
        return gender;
    }
    public String getAadharno()
    {
        return aadharno;
    }
    public String getfathers_phonnoPhonno()
    {
        return fathers_phonno;
    }
    public String getNationality()
    {
        return nationality;
    }
    public String toString()
    {
        return "stu_id : "+Studentid+" \n"+"stu_name : "+Studentname+" \n"+"Age= : "+age+" \n"+"Gender : "+gender+" \n"+"Adharno : "+aadharno+" \n"+"fathers_Phonnum : "+fathers_phonno+" \n"+"Nationality : "+nationality;
    }
}
class Management
{
    public static void main(String args[])
    {
        ArrayList<Student> c=new ArrayList<Student>();
        int ch;
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        do {
            System.out.println("--------------------------------------------------");
            System.out.println("1.seat booking");
            System.out.println("2.View Student information");
            System.out.println("3.Update Student details");
            System.out.println("4.Cancel seat booking");
            System.out.println("5.View all bookings made");
            System.out.println("0.Exit");
            System.out.print("Enter your choice : ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter Student id : ");
                    int Studentid1=sc.nextInt();
                    System.out.print("Enter Student name : ");
                    String cname=sc1.nextLine();
                    System.out.print("Enter Student age : ");
                    int age=sc.nextInt();
                    System.out.print("Enter gender : ");
                    String gender=sc1.nextLine();
                    System.out.print("Enter aadhar number : ");
                    String aadharno=sc1.nextLine();
                    System.out.print("Enter  fathers phone number  : ");
                    String fathers_phonno=sc1.nextLine();
                    System.out.print("Enter nationality : ");
                    String nationality=sc1.nextLine();
                    c.add(new Student(Studentid1,cname,age,gender,aadharno,fathers_phonno,nationality));
                    break;
                case 2:
                    boolean found=false;
                    System.out.print("Enter customer id : ");
                    int Studentiid=sc.nextInt();
                    System.out.println("--------------------------------------------------");
                    Iterator<Student> i=c.iterator();
                    while(i.hasNext())
                    {
                        Student e=i.next();
                        if(e.getStudentid()==Studentiid)
                        {
                            System.out.println(e);
                            found=true;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Record not found");
                    }
                    System.out.println("--------------------------------------------------");

                    break;
                case 3:
                    found=false;
                    System.out.print("Enter Student id to update details : ");
                    Studentiid=sc.nextInt();
                    System.out.println("--------------------------------------------------");
                    ListIterator<Student>li=c.listIterator();
                    while(li.hasNext())
                    {
                        Student e=li.next();
                        if(e.getStudentid()==Studentiid)
                        {
                            System.out.print("Enter new Student name : ");
                            cname=sc1.nextLine();
                            System.out.print("Enter new Student age : ");
                            age=sc.nextInt();
                            System.out.print("Enter updated gender : ");
                            gender=sc1.nextLine();
                            System.out.print("Enter new Aadhar number : ");
                            aadharno=sc1.nextLine();
                            System.out.print("Enter new father phone number  : ");
                            fathers_phonno=sc1.nextLine();
                            System.out.print("Enter new  nationality : ");
                            nationality=sc1.nextLine();
                            li.set(new Student(Studentiid,cname,age,gender,aadharno,fathers_phonno,nationality));
                            found=true;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Record not found");
                    }
                    else
                    {
                        System.out.println("Information of Student has been succesfully updated");
                    }
                    break;
                case 4:
                    found=false;
                    System.out.print("Enter customer id whose booking to be cancelled : ");
                    Studentiid=sc.nextInt();
                    System.out.println("--------------------------------------------------");
                    i=c.iterator();
                    while(i.hasNext())
                    {
                        Student e=i.next();
                        if(e.getStudentid()==Studentiid)
                        {
                            i.remove();
                            found=true;
                        }
                    }
                    if(!found)
                    {
                        System.out.println("Record not found");
                    }
                    else
                    {
                        System.out.println("Booking cancelled successfully");
                    }
                    System.out.println("--------------------------------------------------");
                    break;
                case 5:
                    System.out.println("--------------------------------------------------");
                    i=c.iterator();
                    while(i.hasNext())
                    {
                        Student e=i.next();
                        System.out.println(e);
                    }
                    System.out.println("--------------------------------------------------");
                    break;
            }
        }
        while(ch!=0);
    }
}
