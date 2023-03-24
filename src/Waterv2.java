public class Waterv2 extends Drank {
    private int formaat;

    public Waterv2() {
        this.formaat = 2;
    }

    public Waterv2(String formaat) {

        int t = 0;

        if (formaat.equals("klein")) {
            t  = 1;
        } else if (formaat.equals("normaal")) {
            t = 2;
        } else if (formaat.equals("groot")) {
            t = 3;
        } else {
            System.out.println("Hebben we niet!");
            t = 1;
        } this.formaat = t;
    }

    @Override
    public String toString() {
        return getOmschrijving() + " " + getPrijs();
    }

    @Override
    double getPrijs() {
        return 0.0;
    }

    @Override
    String getOmschrijving() {
        String size;
        if (this.formaat == 1) {
            size = "klein";
        } else if (this.formaat == 2) {
            size = "normaal";
        } else if (this.formaat == 3) {
            size = "groot";
        } else {
            size = "onbekend";
        }
        return "een " + size + " glas water";
    }
}
