
/**
 * Class about a cat
 *
 * @author Max Appeldorn
 * @version 1.0
 */
public class Cat
{
    private String name;
    private double pleasureLevel;
    
    public Cat(String name)
    {
        this.name = name;
        //default level when you get a new cat
        this.pleasureLevel = 0.0;
    }
    
    public void pleasureCat()
    {
       this.pleasureLevel += 0.3;
       
       if(this.pleasureLevel > 5.0){
           this.pleasureLevel = 5.0;
       }
    }
    
    public boolean isHappy()
    {
        return this.pleasureLevel > 3.5;
    }
    
    //Getters
    public String getName()
    {
        return this.name;
    }
    
    public double getPleasureLevel(){
        return this.pleasureLevel;
    }
    
    //Setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setPleasureLevel(double pleasureLevel){
        this.pleasureLevel = pleasureLevel;
    }
    
    
}