
/**
 * Class about owner
 *
 * @author Max Appeldorn
 * @version 1.0
 */
public class Owner
{
    private String name;
    private Cat cat;
    
    public Owner(String name, Cat cat)
    {
      this.name = name;
      this.cat = cat;
    }
    
    public String getCatName(){
        if(this.cat != null){
            return this.cat.getName();
        }
        return "No cat available";
    }
    
    public boolean isCatHappy(){
        if(this.cat != null){
        return this.cat.isHappy();
        }
        return false;
    }
    //Getters
    public String getName(){
        return this.name;
    }
    
    public Cat getCat(){
        return this.cat;
    }
    
    //Setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setCat(Cat cat){
        this.cat = cat;
    }
    
}