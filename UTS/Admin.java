package UTS;

public class Admin extends user {

    public void update_vehicleDetail(int vehicle_id) {
        System.out.println("Update : " + vehicle_id);
    }

    public vehicle Vehicleadd() {
        vehicle addVehicle = new vehicle();
        System.out.println("Adding new vehicle ! ");
        return addVehicle;
    }

    public void retrieve_Complain() {
        System.out.println("Getting Complain ....");
    }

    public void verifyUser() {
        System.out.println("Verifying User data ....");
    }

}
