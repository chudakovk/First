public class Tank {

    int x, y;
    int dir;
    int fuel;


    public Tank(int x, int y, int fuel, int dir) {
        this.x = x;
        this.y = y;
        this.dir = dir;
        this.fuel = fuel;
    }

    public Tank(int x, int y, int fuel) {
        this(x, y, fuel, 0);
    }

    public Tank(int x, int y) {
        this(x, y, 100);
    }

    public Tank(int x) {
        this(x, 0);
    }

    public Tank() {
        this(0);
    }


    public void goForward(int a) {
    if (a >= 0) {
        if (fuel > a) {
            if (dir == 0) x += a;
            else if (dir == 1) y += a;
            else if (dir == 2) x -= a;
            else y -= a;
        } else {
            if (dir == 0) x += fuel;
            else if (dir == 1) y += fuel;
            else if (dir == 2) x -= fuel;
            else y -= fuel;
        }
    } else {
        if (fuel > -a) {
            if (dir == 0) x -= a;
            else if (dir == 1) y -= a;
            else if (dir == 2) x += a;
            else y += a;
        } else {
            if (dir == 0) x -= fuel;
            else if (dir == 1) y -= fuel;
            else if (dir == 2) x += fuel;
            else y += fuel;
        }
            }
    }


    public void goBackward(int a) {
        goForward(-a);
    }

    public void turnRight() {
        dir += 1;
        if (dir == 4) dir = 0;
    }

    public void turnLeft() {
        dir -= 1;
        if (dir == -1) dir = 3;
    }

    public void printPosition() {
        System.out.println("The Tank is at " + x + ", " + y + " now.");

    }

}
