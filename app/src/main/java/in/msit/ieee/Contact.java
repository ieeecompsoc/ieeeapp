package in.msit.ieee;

/**
 * Created by Akanksha Jolly on 23-06-2017.
 */

public class Contact {
    //name of the respective branch to be contacted
    private String contactName;
    //email id of respective contact
    private String contactEmailID;

    /**
     *
     * @param cname contact name
     * @param cID contact email id
     */
    public Contact(String cname,String cID){
        contactName=cname;
        contactEmailID=cID;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactEmailID() {
        return contactEmailID;
    }
}
