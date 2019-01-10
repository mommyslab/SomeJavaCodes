package FourthdayJava;

public class Travelar {
	private final int customerId = 1001;
    private int travelerId;
    private int baggageAmount;
    private int expiryYear;
    private boolean nocStatus;

    public int getTravelerId() {
        return travelerId;
    }
    public void setTravelerId(int travelerId) {
        this.travelerId = travelerId;
    }
    public int getBaggageAmount() {
        return baggageAmount;
    }
    public void setBaggageAmount(int baggageAmount) {
        this.baggageAmount = baggageAmount;
    }
    public int getExpiryyear() {
        return expiryYear;
    }
    public void setExpiryyear(int expiryyear) {
        this.expiryYear = expiryyear;
    }
    public boolean isNocStatus() {
        return nocStatus;
    }
    public void setNocStatus(boolean nocStatus) {
        this.nocStatus = nocStatus;
    }
    public int getId() {
        return customerId;
    }

    public boolean checkBaggage() {
        boolean ret = false;
        if(this.baggageAmount>=0 && this.baggageAmount<=40) {
            nocStatus = true;
            ret = true;
        }
        else {
            nocStatus = true;
            System.out.println("Invalid baggage amount");
        }
        return ret;
    }

}
