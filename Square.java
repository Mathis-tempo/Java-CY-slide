public class Square {
    private int currentX;
    private int currentY;
    private boolean available;
    private boolean white;
    public Token token;

    public Square(int currentX, int currentY, boolean available, boolean white) {
        this.currentX = currentX;
        this.currentY = currentY;
        this.available = available;
        this.white = white;
    }

    public int getCurrentX() {
        return currentX;
    }

    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }

    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean getWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }
}
