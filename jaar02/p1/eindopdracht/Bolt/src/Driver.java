public class Driver {
    private String name;

    public Driver(String name) {
        if(name.trim().isEmpty()){
            this.name = "BoltDriver";
        }else{
            this.name = name;
        }
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
