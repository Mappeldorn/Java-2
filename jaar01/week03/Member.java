
/**
 * Data about a person
 *
 * @author Max Appeldorn
 * @version 1.0
 */
 
import java.time.LocalDate;    
import java.time.format.DateTimeFormatter; 
public class Member
{
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;
    private LocalDate subscriptionDate;
   
    public Member(String name, String lastName, String dateOfBirth, String subscriptionDate) {
       this.name = name;
       this.lastName = lastName;
       this.dateOfBirth = LocalDate.parse(dateOfBirth ,DateTimeFormatter.ofPattern("d/MM/yyyy"));
       this.subscriptionDate = LocalDate.parse(subscriptionDate ,DateTimeFormatter.ofPattern("d/MM/yyyy"));
    }
    
    //Getters
    public String getName(){
        return this.name;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }
    
    public LocalDate getSubscriptionDate(){
        return this.subscriptionDate;
    }
    
    //Setters
    public void setName(String name){
        this.name = name;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    
    public void getSubscriptionDate(LocalDate subscriptionDate){
        this.subscriptionDate = subscriptionDate;
    }

}
