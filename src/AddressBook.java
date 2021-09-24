import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> collectionOfBuddyInfo;
    public AddressBook() {
        this.collectionOfBuddyInfo = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo needAdd) {
        if (needAdd != null) {
            collectionOfBuddyInfo.add(needAdd);
        }
    }

    public BuddyInfo removeBuddy(int index) {
        if (index >=0 && index < collectionOfBuddyInfo.size()) {
            return collectionOfBuddyInfo.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
        System.out.println("New comment");
    }
}
