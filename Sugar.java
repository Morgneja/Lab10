public class Sugar extends Cookie {
    private String shape;
    private boolean decorated;

    Sugar() {
        shape = "";
        decorated = false;
    }

    Sugar(String aShape, Boolean isDecorated) {
        shape = aShape;
        decorated = isDecorated;
    }

    String getShape() {
        return shape;
    }

    void setShape(String aShape) {
        shape = aShape;
    }

    void cutShapes(String aShape, int theNumCookies) {
        System.out.println(theNumCookies + " cookies were cut into " + aShape);
    }

    void decorate() {
        if (super.getBaked()) {
            decorated = true;
            System.out.println("The cookies were decorated");

        } else {
            System.out.println("Make sure you bake the cookies first!");
        }
    }
}
