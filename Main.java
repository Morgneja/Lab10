public class Main {
    public static void main(String[] args) {
        Sugar tree = new Sugar();
        tree.setShape("Tree");
        tree.cutShapes(tree.getShape(), 10);
        tree.baked(350, 12);
        tree.decorate();

        Sugar aCookie = new Sugar();
        aCookie.decorate();

    }
}
