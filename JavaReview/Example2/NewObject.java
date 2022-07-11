package Example2;
public class NewObject {

    // states and behaviors   
    public int id;

    // a constructor
    public NewObject(){
        System.out.println("New object is currently being created.");
    }
    // I can overload methods and constructors (having multiple methods with the same name but different parameters)
    public NewObject(int id){
        this.id = id;
    }
    // a method
    public String test(){
        return "The test is complete";
    }
    
}
