//Collaboration statement: I worked alone on this assignment and I got the image for the
//background of my app from google.
//The link is: https://www.google.com/search?q=pizza+on+white+background+images&tbm=isch&ved=2ahUKEwjn7q602-H8AhUJId8KHRw5CKQQ2-cCegQIABAA&oq=pizza+on+white+background+images&gs_lcp=CgNpbWcQAzoECCMQJ1CtEViYG2DDHmgAcAB4AIABgAGIAbkEkgEDNC4ymAEAoAEBqgELZ3dzLXdpei1pbWfAAQE&sclient=img&ei=QpnQY-fFEYnC_Aac8qCgCg&bih=821&biw=1440#imgrc=oJoNPnII1XsL1M
//Honor code: "On my honor, I have not given, nor received, nor witnessed any unauthorized assistance on this work.

package nedoziem.pizzaparty;

public class PizzaCalculator {

    public enum HungerLevel {
        LIGHT, MEDIUM, RAVENOUS
    }

    public final static int SLICES_PER_PIZZA = 8;

    private HungerLevel mHungerLevel;
    private int mPartySize;

    public PizzaCalculator(int partySize, HungerLevel level) {
        setHungerLevel(level);
        setPartySize(partySize);
    }

    public HungerLevel getHungerLevel() {
        return mHungerLevel;
    }

    public void setHungerLevel(HungerLevel level) {
        mHungerLevel = level;
    }

    public int getPartySize() {
        return mPartySize;
    }

    public void setPartySize(int partySize) {
        if (partySize >= 0) {
            mPartySize = partySize;
        }
    }

    public int getTotalPizzas() {
        int slicesPerPerson;
        if (mHungerLevel == HungerLevel.LIGHT) {
            slicesPerPerson = 2;
        }
        else if (mHungerLevel == HungerLevel.MEDIUM) {
            slicesPerPerson = 3;
        }
        else {
            slicesPerPerson = 4;
        }
        return (int) Math.ceil(mPartySize * slicesPerPerson / (double) SLICES_PER_PIZZA);
    }
}
