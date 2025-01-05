class Box {
    int length; // Attribute declaration
    int width; // Attribute declaration
    int height; // Attribute declaration
    // -------------Methods declaration----------------------

    public void setSize(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }
}

class Demo {
    public static void main(String args[]) {
        Box b1 = new Box();
        b1.setSize(12, 5, 3);
        int volume;
        volume = b1.length * b1.width * b1.height;
        System.out.println("Volume : " + volume); // prints "Volume : 180"
    }
}