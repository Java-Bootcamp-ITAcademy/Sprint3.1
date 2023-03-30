package n2exercici1.PhoneNumbers;

import n2exercici1.PhoneNumbers.PhoneNumber;

public class UKPhoneNumber extends PhoneNumber {

    @Override
    public void settingPhoneNumber(String s) {
        this.phoneNumber="+44 "+s;
    }
}
