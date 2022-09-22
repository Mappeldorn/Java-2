
/**
 * Data about a subscription
 *
 * @author Max Appeldorn
 * @version 1.0
 */
import java.util.ArrayList;
import java.time.Period;
import java.time.LocalDate;
public class Ice_club{
    
    private ArrayList<Member> members;
    
    public Ice_club(){
        this.members = new ArrayList<>();
    }
    
    public void sortMembersByAge (){
         this.members.sort((m1, m2)
                      -> m1.getDateOfBirth().compareTo(
                          m2.getDateOfBirth()));
    }
    
     public void sortMembersBySubscription (){
         this.members.sort((m1, m2)
                      -> m1.getSubscriptionDate().compareTo(
                          m2.getSubscriptionDate()));
    }
    //Getters
    public ArrayList<Member> getMembers(){
        return this.members;
    }
    
    public double getTotalProfit(){
        if(!this.members.isEmpty()){
            double profit = 0.0;
            for(Member member : this.members){
                int age = this.getTimeDifference(member.getDateOfBirth());
                int subscriptionTime = this.getTimeDifference(member.getSubscriptionDate());
                int multiplier = 100;
                if(subscriptionTime >= 5 ){
                    multiplier = 80;
                }
            
                if ( age < 12){
                    profit += 5 / 100f * multiplier;
                }else if(age > 12 && age < 18){
                    profit += 7.50 / 100f * multiplier;
                }else if(age >= 18 && age < 65){
                    profit += 10 / 100f * multiplier;
                }else if(age >= 65){
                    profit += 30.35 / 100f * multiplier;
                }
            }
            
            return profit;
        }
        return 0.0;
    }

    public Member getOldestMember(){
        if(!this.members.isEmpty()){
            this.sortMembersByAge();
            return this.members.get(0);
        }
        
        return null;
        
    }
    
    public Member getYoungestMember(){
        if(!this.members.isEmpty()){
            this.sortMembersByAge();
            return this.members.get(this.members.size() -1);
        }
        
        return null;
        
    }
    
    public Member getLongestSubscription(){
        if(!this.members.isEmpty()){
            this.sortMembersBySubscription();
            return this.members.get(0);
        }
        
        return null;
    }
    
    public int getTimeDifference(LocalDate date){
        return Period.between(date, LocalDate.now()).getYears();
    }
    //Setters
    public void setMember(Member member){
        this.members.add(member);
    }
}
