class List {
    private int[] dataArray;
    private int nextIndex;

    public List(int intCapacity) {
        dataArray = new int[intCapacity];
        nextIndex = 0;
    }
    public String toString(){

    }

    public int get(int index) {
        if (index >= 0 && index < nextIndex) {
            return dataArray[index];
        }
        return -1;
    }

    public void add(int data) { // add to the last
        // if(isFull()){extendsArray();}
        dataArray[nextIndex++] = data;
    }

    public void add(int index, int data) {
        if (index >= 0 && index <= nextIndex) {
            // if(isFull()){extendsArray();}
            for (int i = nextIndex; i > index; i--) {
                dataArray[i] = dataArray[i - 1];
            }
            dataArray[index] = data;
            nextIndex++;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < nextIndex) {
            for (int i = index; i < nextIndex - 1; i++) {
                dataArray[i] = dataArray[i + 1];
            }
            nextIndex--;
        }
    }

    public void printList() {
        System.out.print("[");
        for (int i = 0; i < nextIndex; i++) {
            System.out.print(dataArray[i] + ", ");
        }
        System.out.println("\b\b]");
    }
    
}

class Demo {
    public static void main(String args[]) {
        List list = new List(10);
        System.out.println(list.toString()); // [empty]
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list.toString());// [10,20,30,40,50,60]
    }
}