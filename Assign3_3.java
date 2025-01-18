3.3 Clone

class Box {
    int length;
    int width;
    int height;

    // Parameterized Constructor
    public Box(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    // Copy Constructor
    public Box(Box other) {
        length = other.length;
        width = other.width;
        height = other.height;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Box box1 = new Box(10, 20, 30);

        // Creating a clone of box1 using the copy constructor
        Box box2 = new Box(box1);

        // Creating another object with different dimensions
        Box box3 = new Box(10, 20, 25);

        // Comparing dimensions of box1 and box2
        boolean areBox1AndBox2Equal = 
            (box1.length == box2.length) &&
            (box1.width == box2.width) &&
            (box1.height == box2.height);

        if (areBox1AndBox2Equal) {
            System.out.println("box1 and box2 are equal.");
        } else {
            System.out.println("box1 and box2 are not equal.");
        }

        // Comparing dimensions of box1 and box3
        boolean areBox1AndBox3Equal = 
            (box1.length == box3.length) &&
            (box1.width == box3.width) &&
            (box1.height == box3.height);

        if (areBox1AndBox3Equal) {
            System.out.println("box1 and box3 are equal.");
        } else {
            System.out.println("box1 and box3 are not equal.");
        }
    }
}
