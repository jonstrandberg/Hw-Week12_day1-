public class Printer {

    private int sheetsLeft;
    private int tonerVolume;
    public Printer(){
        this.sheetsLeft = 100;
        this.tonerVolume = 500;
    }
    public int getSheetsLeft() {
        return this.sheetsLeft;
    }


    public void print(int a, int b) {
        int pagesRequired = a * b;
        if (pagesRequired <= this.sheetsLeft){
            this.sheetsLeft -= pagesRequired;
            this.tonerVolume -= pagesRequired;
        }
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }
}
