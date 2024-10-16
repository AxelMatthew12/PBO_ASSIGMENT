package UTS;

public class Customer extends user {

    private boolean verification_status = false;

    public boolean get_verification_status() {
        return verification_status;
    }

    public void apply_verification(String[] doc) {
        System.out.println("Applying verification ! ");
        for (String docs : doc) {
            System.out.println(docs);
        }
        verification_status = true;
    }
}
