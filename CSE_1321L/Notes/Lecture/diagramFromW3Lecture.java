import java.util.Scanner;

public class diagramFromW3Lecture {
    public static void parentsInvolved(){
        String x;
        String y = ("Yes");
        String n = ("No");
        Scanner sc = new Scanner(System.in);
        System.out.println("Have your parents asked about it?");
        x = sc.nextLine();
        if(x.equalsIgnoreCase(y)){
            notClear();
        }
        else if(x.equalsIgnoreCase(n)){
            clear();
        }
        else{
            System.out.print("restart the program");
        }
    }
    public static void clear(){
        System.out.println("Ask for $$");
    }
    public static void notClear(){
        System.out.println("Blame it on someone else.");
        System.out.println("Lay low and keep hidden.");

    }
    public static void main(String[]     args) {
        ///////////////////////////////////////

        ///////////
        String x;
        String y = ("Yes");
        String n = ("No");

        System.out.println("Answer with Yes or No");
        System.out.println("Did you break anything?");
        Scanner sc = new Scanner(System.in);
        x = sc.nextLine();
        if(x.equalsIgnoreCase(y)){
            parentsInvolved();
        }
        else if(x.equalsIgnoreCase(n)){
            System.out.println("Are you lying?");
        }
        else{
            System.out.print("restart the program");
        }

        x = sc.nextLine();
        if(x.equalsIgnoreCase(y)){
            parentsInvolved();
        }
        else if(x.equalsIgnoreCase(n)){
            System.out.println("Are you passing your classes?");
        }
        else{
            System.out.print("restart the program");
        }

        x = sc.nextLine();
        if(x.equalsIgnoreCase(n)){
            parentsInvolved();
        }
        else if(x.equalsIgnoreCase(n)){
            clear();
        }
        else{
            System.out.print("restart the program");
        }


    }
}