package n2exercici1;

public class GermanPhoneNumber extends PhoneNumber{
    @Override
    public void settingPhoneNumber(String s) {
        this.phoneNumber="+49 "+s;
    }
}
