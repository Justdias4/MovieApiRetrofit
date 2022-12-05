public class Image {
    int height;
    int width;
    String imageUrl;
    public Image(){

    }
    public Image(int height, int width, String imageUrl) {
        this.height = height;
        this.width = width;
        this.imageUrl = imageUrl;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}