import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> collectionOfBuddyInfo;

    public AddressBook() {
        this.collectionOfBuddyInfo = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo needAdd) {
        collectionOfBuddyInfo.add(needAdd);
    }

    public void removeBuddy(BuddyInfo needRemove) {
        collectionOfBuddyInfo.remove(needRemove);
    }

    public static void main(String[] args) {
        System.out.println("Address Book");
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
