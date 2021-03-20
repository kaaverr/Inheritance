package max.edu;

public class Door {
    private int width;
    private int length;
    private String material;
    private Color color;
    private String decoration;
    private boolean hasLock;
    private boolean handle;
    private boolean sealant;
    private DoorType type;

    public Door() {
    }

    public Door(int width, int length, String material, Color color, String decoration, boolean hasLock, boolean handle, boolean sealant, DoorType type) {
        this.width = width;
        this.length = length;
        this.material = material;
        this.color = color;
        this.decoration = decoration;
        this.hasLock = hasLock;
        this.handle = handle;
        this.sealant = sealant;
        this.type = type;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDecoration() {
        return decoration;
    }

    public void setDecoration(String decoration) {
        this.decoration = decoration;
    }

    public boolean isHasLock() {
        return hasLock;
    }

    public void setHasLock(boolean hasLock) {
        this.hasLock = hasLock;
    }

    public boolean isHandle() {
        return handle;
    }

    public void setHandle(boolean handle) {
        this.handle = handle;
    }

    public boolean isSealant() {
        return sealant;
    }

    public void setSealant(boolean sealant) {
        this.sealant = sealant;
    }

    public DoorType getType() {
        return type;
    }

    public void setType(DoorType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Door{" +
                "width=" + width +
                ", length=" + length +
                ", material='" + material + '\'' +
                ", color=" + color +
                ", decoration='" + decoration + '\'' +
                ", hasLock=" + hasLock +
                ", handle=" + handle +
                ", sealant=" + sealant +
                ", type=" + type +
                '}';
    }
}
