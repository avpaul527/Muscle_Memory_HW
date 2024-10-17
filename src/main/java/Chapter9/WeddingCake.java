package Chapter9;

public class WeddingCake extends Cake{

    private int tiers;

    public WeddingCake(){
        super("Strawberry");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
