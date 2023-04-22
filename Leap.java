public class Leap {

    private int y;

    public Leap(int y) {
        this.y = y;
    }

    public boolean isLeap() {

        if (y % 4 == 0) {

            if (y % 100 == 0) {

                if (y % 400 == 0) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return true;
            }

        }

        return false;

    }

}
