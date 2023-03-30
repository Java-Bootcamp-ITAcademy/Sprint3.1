package n2exercici1;

public class CatalanAddress extends Address{
    @Override
    public void settingAddress(String street, String number, String floor) {
        this.street = "Carrer "+street;
        this.num = "Nº "+number;
        this.floor = " Pis "+floor;
    }
}
