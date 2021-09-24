public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this.name = "Unknown";
        this.address = "No information";
        this.phoneNumber = "xxx-xxx-xxxx";
    }

    public String getName() {
        return name;
    }


    public static void main(String[] args) {
        BuddyInfo testHomer = new BuddyInfo("Homer", "Unknown Address", "111-111-1111");
        System.out.println("Hello " + testHomer.getName());
        System.out.println("test");
        System.out.println("Add a new method");
    }
}
