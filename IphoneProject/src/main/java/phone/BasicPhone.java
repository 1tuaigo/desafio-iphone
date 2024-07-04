package phone;

public class BasicPhone implements Phone {
    private String currentCall;

    @Override
    public void call(String number) {
        this.currentCall = number;
        System.out  .println("Calling" + number);
    }
    @Override
    public void hangUp(){
        System.out.println("Hanging up call with: "+currentCall);
        this.currentCall = null;
    }
}
