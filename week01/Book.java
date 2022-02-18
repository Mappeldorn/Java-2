
/**
 * class Book
 *
 * @author Max Appeldorn
 * @version 69
 */
public class Book
{
    private String name;
    private String author;
    private Boolean hardcover;
    private Double price;
    private Integer timesRead;
    
    public Book(String name, String author, Boolean hardcover, Double price){
        this.name = name;
        this.author = author;
        this.hardcover = hardcover;
        this.price = price;
    }
    
    public void setTimesRead(Integer timesRead){
        this.timesRead = timesRead;
    }
    
    public Integer getTimeRead(){
        return this.timesRead;
    }
}
