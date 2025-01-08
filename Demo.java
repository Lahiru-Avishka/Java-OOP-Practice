class Box {
    int length;
    int width;
    int height;

    public void setSize(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    public void printVolume() {
        int volume;
        volume = length * width * height;
        System.out.println("Volume : " + volume);
    }
    public void printArea(){
        int area;
        area = 2*(length*height + length*width + height*width );
        System.out.println("Area :" + area);
    }
}

class Demo {
    public static void main(String args[]) {
        Box b1 = new Box();
        b1.setSize(12, 5, 3);
        b1.printVolume();
        b1.printArea(); // Area : 222
    }
}