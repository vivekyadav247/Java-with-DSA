class emplInformation{
    private int emplid;
    private String emplname;
    private String empladdress;
    private String Company ;

    //setter methods
    public void setemplID(int emplid){
        this.emplid=emplid;
    }
    public void setemplName(String emplname){
        this.emplname =emplname;
    }
    public void setemplAddress(String empladdress){
        this.empladdress =empladdress;
    }
    public void setCompany(String Company){
        this.Company =Company;
    }
    //getter methods
    public int getemplID(){
        return emplid;
    }
    public String getemplName(){
        return emplname;
    }
    public String getemplAddress(){
        return empladdress;
    }
    public String getCompany(){
        return Company;
    }
}
public class EmployeeApp {
    public static void main(String[] args)
    {
        emplInformation emp1 = new emplInformation();

        //calling setter methods
        emp1.setemplID(2407);
        emp1.setemplName("Vivek");
        emp1.setemplAddress("Mumbai");
        emp1.setCompany("Google");

        //calling getter methods
        System.out.println("Employee ID       is :: "+emp1.getemplID());
        System.out.println("Employee Name     is :: "+emp1.getemplName());
        System.out.println("Employee Address  is :: "+emp1.getemplAddress());
        System.out.println("Employee Company  is :: "+emp1.getCompany());

    }
}

