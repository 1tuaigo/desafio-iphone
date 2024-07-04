package iphone;

public class Main {
    public static void main(String[] args) {
        iPhone myiPhone = new iPhone();

        myiPhone.setTrack("Fein - Travis Scott");
        myiPhone.play();
        myiPhone.pause();
        myiPhone.stop();

        myiPhone.call("(75)9 9999-9999");
        myiPhone.hangUp();

        myiPhone.browse("web.dio.me");
    }
}
