public class Location {

    //class för att ta emot och hålla spelarens position,som ett verktyg vid presentation av slutkordinat efter varje
    //förflyttning playern gjort uppdateras detta objekt.
    private int row;
    private int columns;
    private int x;
    private int y;

    public Location(int row, int columns, int x, int y) {
        this.row = row;
        this.columns = columns;
        this.x = x;
        this.y = y;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
