  public class Flight {

    private String flightNo = "BA 98";
    private int passengerCount=0;
    private String[] passengerList = new String[25];

    public boolean reserveSeat(String name) {
        if (passengerCount < 25) {
            getPassengerList()[passengerCount] = name;
            passengerCount++;
            System.out.println("Reservation is successful.");
            return true;
        } else {
            System.out.println("Sorry... This flight is full.");
        }
        return false;
    }

    public boolean cancelReservation(String name) {
        if (passengerCount > 0) {
            for (int i=0; i<passengerCount; i++) {
                if (getPassengerList()[i].equals(name)) {
                    for(int j=i; j<(passengerCount-1); j++){
                        getPassengerList()[j] = getPassengerList()[j+1];
                    }
                    getPassengerList()[passengerCount-1] = "Not reserved...";
                    passengerCount--;
                    return true;
                }
            }
                System.out.println("There is no passenger named " + name + ". Please check your name on list and try again.");
        }
        else if(passengerCount == 0) {
            System.out.println("There is no passenger to cancel reservation.");
        }
        return false;
    }

    public boolean searchPassenger(String name){
        for(int i=0; i<passengerCount; i++){
            if(getPassengerList()[i].equals(name)){
                System.out.println("You have ticket for " + flightNo + " at seat " + (i+1) + ". Have a nice flight.");
                return true;
            }
        }
        System.out.println("There is no one named " + name + " on passenger list.");
        return false;
    }

    public int numberOfPassengers(){
        return passengerCount;
    }

    public void printPassengers(){
        System.out.println("Flight no: " + flightNo);
        for(int i = 0; i< getPassengerList().length; i++){
            System.out.println("Seat: " + (i + 1) + "\tPassenger: " + getPassengerList()[i]);
        }
    }

    public String[] getPassengerList() {
        return passengerList;
    }

    public void setPassengerList(String[] passengerList) {
        this.passengerList = passengerList;
    }
}
