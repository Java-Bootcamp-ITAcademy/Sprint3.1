package n2exercici1;

public class UKPhoneNumber extends PhoneNumber{

    @Override
    public void settingPhoneNumber(String s) {
        this.phoneNumber="+44 "+s;
    }
}
