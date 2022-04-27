public class Player implements Direction {

    private String currentDirection = "N";
    private int overBoard = 0;
    private final static String OVER_BOARD = "-1, -1";

    public String getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(String currentDirection) {
        this.currentDirection = currentDirection;
    }

    public int getOverBoard() {
        return overBoard;
    }

    public void setOverBoard(int overBoard) {
        this.overBoard = overBoard;
    }

    public void movingPlayer(int i, Location location) {
        switch (getCurrentDirection()) {
            case "N":
                facingNorth(i, location);
                break;

            case "E":
                facingEast(i, location);
                break;

            case "S":
                facingSouth(i, location);
                break;

            case "W":
                facingWest(i, location);
                break;
        }
    }

    @Override
    public void facingNorth(int n, Location location) {
        if (n == 1) {
            if (location.getY() - 1 < 0) {
                outOfBounds();
            } else {
                location.setY(location.getY() - 1);
            }
        } else {
            if (location.getY() + 1 > location.getColumns()) {
                outOfBounds();
            } else {
                location.setY(location.getY() + 1);
            }
        }
    }

    @Override
    public void facingEast(int e, Location location) {
        if (e == 1) {
            if (location.getX() + 1 > location.getRow()) {
                outOfBounds();
            } else {
                location.setX(location.getX() + 1);
            }
        } else {
            if (location.getX() - 1 < 0) {
                outOfBounds();
            } else {
                location.setX(location.getX() - 1);
            }
        }
    }

    @Override
    public void facingSouth(int s, Location location) {
        if (s == 1) {
            if (location.getY() + 1 > location.getColumns()) {
                outOfBounds();
            } else {
                location.setY(location.getY() + 1);
            }
        } else {
            if (location.getY() - 1 < 0) {
                outOfBounds();
            } else {
                location.setY(location.getY() - 1);
            }
        }
    }

    @Override
    public void facingWest(int w, Location location) {
        if (w == 1) {
            if (location.getX() - 1 < 0) {
                outOfBounds();
            } else {
                location.setX(location.getX() - 1);
            }
        } else {
            if (location.getX() + 1 > location.getRow()) {
                outOfBounds();
            } else {
                location.setX(location.getX() + 1);
            }
        }
    }

    public String rotate(int turn) {
        if (turn == 3) {
            if (currentDirection.equals("N")) {
                setCurrentDirection("E");
                return currentDirection;
            }
            if (currentDirection.equals("E")) {
                setCurrentDirection("S");
                return currentDirection;
            }
            if (currentDirection.equals("S")) {
                setCurrentDirection("W");
                return currentDirection;
            }
            if (currentDirection.equals("W")) {
                setCurrentDirection("N");
                return currentDirection;
            }
        } else if (turn == 4) {
            if (currentDirection.equals("N")) {
                setCurrentDirection("W");
                return currentDirection;
            }
            if (currentDirection.equals("W")) {
                setCurrentDirection("S");
                return currentDirection;
            }
            if (currentDirection.equals("S")) {
                setCurrentDirection("E");
                return currentDirection;
            }
            if (currentDirection.equals("E")) {
                setCurrentDirection("N");
                return currentDirection;
            }
        }
        return null;
    }

    public void quit(Location location) {
        System.out.println("Final position: " + location.getX() + ", " + location.getY());
    }

    public void outOfBounds() {
        System.out.println(OVER_BOARD);
        setOverBoard(-1);
    }
}


