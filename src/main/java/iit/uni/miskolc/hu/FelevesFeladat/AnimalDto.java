package iit.uni.miskolc.hu.FelevesFeladat;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AnimalDto {
    @NotNull
    private long id;
    @NotNull
    @NotBlank
    private String type;
    @Min(2)
    private int legs;
    @NotBlank
    private String color;

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "animalDto{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", legs=" + legs +
                ", color='" + color + '\'' +
                '}';
    }

}
