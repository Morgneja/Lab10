public class Cookie {
    private int numCookies;
    private int bakeTemp;
    private int bakeTime;
    private boolean baked;

    Cookie() {
        numCookies = 0;
        bakeTemp = 0;
        bakeTime = 0;
        baked = false;
    }

    Cookie(int theNumCookies, int theBaketemp, int theBakeTime, boolean isBaked) {
        numCookies = theNumCookies;
        bakeTemp = theBaketemp;
        bakeTime = theBakeTime;
        baked = isBaked;
    }

    boolean getBaked() {
        return baked;
    }

    void setNumCookies(int theNumCookies) {
        numCookies = theNumCookies;
    }

    void setBakeTemp(int theBakeTemp) {
        bakeTemp = theBakeTemp;
    }

    void setBakeTime(int theBaketime) {
        bakeTime = theBaketime;
    }

    void baked(int theBaketemp, int theBakeTime) {
        System.out.println("The cookies were baked at " + theBaketemp + " F for " + theBakeTime + " minutes");
        baked = true;

    }
}
