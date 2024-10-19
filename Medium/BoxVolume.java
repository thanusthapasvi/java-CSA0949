class Box {
    int length, width, height;

    public Box() {
        length = 5;
        width = 4;
        height = 3;
    }

    public int volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("Volume of the Box: " + box.volume());
    }
}
