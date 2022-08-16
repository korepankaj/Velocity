package interface_extend_interface;

//here, one interface can extend another interface
//if we implement sub interface, then we have to complete methods
//from super interface and sub interface in implementation class

public interface Tatamotor extends Tata
{
    void car();
    void minibus();
}


