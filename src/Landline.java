public class Landline implements Phone{
    private String myPhoneNo;
    boolean isPowerOn;
    boolean isRinging;

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging = false;
        this.isPowerOn = true;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    @Override
    public void PowerOn() {
        this.isPowerOn = true;

    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn == true ){
            System.out.println("You are Dialing the no : "+phoneNo);
        }
        else {
            System.out.println("Your Landline if OFF.");
        }

    }

    @Override
    public void reciveCall(String phoneNo) {

        if(isPowerOn==true && myPhoneNo.equals(phoneNo)){
            this.isRinging = true;
            System.out.println("You are Recieving the call.");
        }
        else {
            System.out.println("Call not recived");

        }
    }

    @Override
    public boolean answerCall() {
        if(isRinging==true){
            System.out.println("Answering the call");
            this.isRinging = false;
            return true;
        }
        else{
            return  false;
        }
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
