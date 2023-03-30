package n2exercici1.PhoneNumbers;

public class CatalanPhoneNumber extends PhoneNumber {
    @Override
    public void settingPhoneNumber(String s) {
        this.phoneNumber="+34 "+s;
    }
}
