package Chapter6;


public class Main {
    public static void main(String[] args) {

        PhoneBill phonebill = new PhoneBill();

            phonebill.setBaseCost(45);
            phonebill.setAllottedMinutes(500);
            phonebill.setMinutesUsed(750);

            phonebill.printItemizedBill();
    }

}
