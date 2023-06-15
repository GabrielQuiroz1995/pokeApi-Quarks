package cl.forum.arq.bts.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Pokemon {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("base_experience")
    private int base_experience;
    @JsonProperty("height")
    private int height;
    @JsonProperty("is_default")
    private boolean is_default;
    @JsonProperty("order")
    private int order;
    @JsonProperty("weight")
    private int weight;

    public Pokemon(){}
    public Pokemon(Long id, String name, int base_experience, int height, boolean is_default, int order, int weight) {
        this.id = id;
        this.name = name;
        this.base_experience = base_experience;
        this.height = height;
        this.is_default = is_default;
        this.order = order;
        this.weight = weight;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBaseExperience() {
        return base_experience;
    }

    public void setBaseExperience(int base_experience) {
        this.base_experience = base_experience;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isDefault() {
        return is_default;
    }

    public void setDefault(boolean is_default) {
        this.is_default = is_default;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
