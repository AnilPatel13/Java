package AdvanceJava.Module1;

enum Status {
 Running, Failed, Pending, Success ;
}

public class EnumIfSwitch {
    public static void main(String[] args) {

        Status s = Status.Running;
        if (s == Status.Running)
            System.out.println("Running");
        else if (s==Status.Success)
            System.out.println("Success");
        else if (s==Status.Failed)
            System.out.println("Failed");
        else
            System.out.println("Pending");

        switch(s)
        {
            case Running:
                System.out.println("Running");
                break;
            case Success:
                System.out.println("Success");
                break;
            case Failed:
                System.out.println("Failed");
                break;
            case Pending:
                System.out.println("Pending");
                break;
            default:
                System.out.println("Invalid Status");
                break;
        }

    }
}
