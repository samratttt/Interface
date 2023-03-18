
// Interfaces => kind of like blueprint of an class
// only contains abstract method: no method body
// can have constants
// interfaces are implemented on top of class

interface Ivechile{

    void engine();
}

class car implements Ivechile{

    public void engine(){
        System.out.println("This is a bloody car engine ");
    }
}

public class Main{

    public static void main(String[] args){
        car newcar = new car();
        newcar.engine();
    }
}