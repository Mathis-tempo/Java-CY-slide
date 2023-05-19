public class Square {
    private boolean white;
    public Token token;

    public Square(int valueToken) {
        if (valueToken == -1) {
            this.white = true;
        }else{
            this.white = false;
            this.token = new Token(valueToken);
        }
    }

    public boolean getWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }
}
