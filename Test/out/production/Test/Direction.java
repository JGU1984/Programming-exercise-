public interface Direction {

    //Force player to have and handle movement
    void facingNorth(int n, Location location);
    void facingEast(int n, Location location);
    void facingSouth(int n, Location location);
    void facingWest(int n, Location location);
}
