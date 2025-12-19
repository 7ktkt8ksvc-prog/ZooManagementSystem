public class Zoo {

    private String zooName;
    private String location;

    // Constructor
    public Zoo(String zooName, String location) {
        this.zooName = zooName;
        this.location = location;
    }

    // Getters and Setters
    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Method
    public void displayInfo() {
        System.out.println("Zoo: " + zooName + ", Location: " + location);
    }
}
