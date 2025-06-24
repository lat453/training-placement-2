interface Drawable {
    void draw();
}

interface Paintable {
    void paint();
}

class Art implements Drawable, Paintable {
    public void draw() {
        System.out.println("Drawing Art");
    }
    public void paint() {
        System.out.println("Painting Art");
    }
}
