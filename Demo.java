class Box {
    int length;
    int width;
    int height;

    public void setSize(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public void printVolume() {
        int volume;
        volume = length * width * height;
        System.out.println("Volume : " + volume);
    }

    public void printArea() {
        int area;
        area = 2 * length * width + 2 * length * height + 2 * width * height;
        System.out.println("Area : " + area);
    }
}

class Demo {
    public static void main(String args[]) {
        Box b1 = new Box();
        b1.setSize(12, 5, 3);
        b1.printVolume();
        System.out.println("length : " + b1.length);
        System.out.println("width : " + b1.width);
        System.out.println("height : " + b1.height);
    }
}