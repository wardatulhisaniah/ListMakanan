package id.ac.poliban.mi.atul.listmakanan;

public class Food {
    private String image;
    private String foodName;
    private String foodDetail;

    public Food(String image, String foodName, String foodDetail) {
        this.image = image;
        this.foodName = foodName;
        this.foodDetail = foodDetail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodDetail() {
        return foodDetail;
    }

    public void setFoodDetail(String foodDesc) {
        this.foodDetail = foodDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getFoodName(), getFoodDetail());
    }
}
