public interface Phone {
    void PowerOn();
    void callNumber(String phoneNo);
    void reciveCall(String phoneNo);
    boolean answerCall();
    boolean isRinging();

}
