package it.academy.fitness_studio.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(schema = "app",name = "product")
public class ProductEntity {
    @Id
    @Column(name = "id")
    private UUID uuid;
    @Column(name = "dtcreate")
    private Instant dtCreate;
    @Version
    @Column(name = "dtupdate")
    private Instant dtUpdate;
    @Column(name = "title")
    private String title;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "calories")
    private Integer calories;
    @Column(name = "proteins")
    private BigDecimal proteins;
    @Column(name = "fats")
    private BigDecimal fats;
    @Column(name = "carbohydrates")
    private BigDecimal carbohydrates;
    public ProductEntity() {
    }
    public ProductEntity(UUID uuid,
                         Instant dtCreate,
                         Instant dtUpdate,
                         String title,
                         Integer weight,
                         Integer calories,
                         BigDecimal proteins,
                         BigDecimal fats,
                         BigDecimal carbohydrates) {
        this.uuid = uuid;
        this.dtCreate = dtCreate;
        this.dtUpdate = dtUpdate;
        this.title = title;
        this.weight = weight;
        this.calories = calories;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }

    public ProductEntity(String title,
                         Integer weight,
                         Integer calories,
                         BigDecimal proteins,
                         BigDecimal fats,
                         BigDecimal carbohydrates) {
        this.title = title;
        this.weight = weight;
        this.calories = calories;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
    }

    public UUID getUuid() {
        return uuid;
    }
    public Instant getDtCreate() {
        return dtCreate;
    }
    public Instant getDtUpdate() {
        return dtUpdate;
    }
    public String getTitle() {
        return title;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getCalories() {
        return calories;
    }

    public BigDecimal getProteins() {
        return proteins;
    }

    public BigDecimal getFats() {
        return fats;
    }

    public BigDecimal getCarbohydrates() {
        return carbohydrates;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public void setDtCreate(Instant dtCreate) {
        this.dtCreate = dtCreate;
    }

    public void setDtUpdate(Instant dtUpdate) {
        this.dtUpdate = dtUpdate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public void setProteins(BigDecimal proteins) {
        this.proteins = proteins;
    }

    public void setFats(BigDecimal fats) {
        this.fats = fats;
    }

    public void setCarbohydrates(BigDecimal carbohydrates) {
        this.carbohydrates = carbohydrates;
    }
}
