public class Main {
    public static void main(String[] args){
        //e
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee[] directory = {e1, e2};
        e1.id = 0;
        e1.firstName = "Mark";
        e1.lastName = "Sloan";
        e1.age = 67;
        e1.occupation = "Chief of internal medicine";
        e1.hasMedicalLicense = true;
        e2.firstName = "Zaid";
        System.out.println(directory[0].firstName+","+e2.firstName);
    }
}
