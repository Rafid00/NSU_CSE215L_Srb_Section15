public class Info1 {
    int numer;
    int denom;

    public Info1(int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
    }

    public void displayRaw() {
        System.out.println("constructor passed values " + numer + " and " + denom);
    }

    public void add(Info1 fraction) {
        this.numer = fraction.numer;
        this.denom = fraction.denom;
        System.out.println(numer + "/" + denom);
    }

    public String toString() {
        return "the passed parameters are " + numer + " and " + denom;
    }
}
