package Example2;

public class Driver {

    public static void main(String[] args){
        /*
        NewObject obj1 = new NewObject();
        String out = obj1.test();
        System.out.println(out);
        */
        // in a way, an upgradedobject is a newobject because upgradedobject extends newobject
        /*
        NewObject obj2 = new UpgradedObject(7);
        System.out.println(obj2.test());
        */
        NewObject obj3 = new NewObject(7);
        System.out.println(obj3.id);
    }
    
}
