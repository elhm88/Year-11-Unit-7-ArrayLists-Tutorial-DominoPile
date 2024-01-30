public class Domino {
    // Properties
    int top;
    int bottom;

    // Constructors
    public Domino() {
        top = 0;
        bottom = 0;
    }

    public Domino(int n1, int n2) {
        top = n1;
        bottom = n2;
    }

    // Methods
    public int getTop() {
        return top;
    }

    public int getBottom() {
        return bottom;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public void setBottom(int bottom) {
        this.bottom= bottom;
    }

    public String toString() {
        return "" + top + "/" + "" + bottom;
    }

    public void flip() {
        int temp = top;
        top = bottom;
        bottom = temp;
    }

    public void settle() {
        if (bottom < top) {
            this.flip();
        }
    }

    public int compareTo(Domino other) {
        this.flip();
        other.flip();

        if (this.top < other.top) {
            return -1;
        } else if (this.top > other.top) {
            return 1;
        } else {
            if (this.bottom < other.bottom) {
                return -1;
            } else if (this.bottom > other.bottom) {
                return 1;
            }
        }
        return 0;
    }

    public int compareToWeight(Domino other) {
        if (this.top + this.bottom < other.top + other.bottom) {
            return -1;
        }
        else if (this.top + this.bottom > other.top + other.bottom) {
            return 1;
        }
        return 0;
    }

    public boolean canConnect(Domino other) {
        if (this.top == other.top || this.top == other.bottom || this.bottom == other.top || this.bottom == other.bottom) {
            return true;
        }
        return false;
    }
}
