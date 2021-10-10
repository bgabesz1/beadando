package iit.uni.miskolc.hu.FelevesFeladat;


import javax.validation.constraints.NotNull;

public class Animal {
    @NotNull
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String color;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
