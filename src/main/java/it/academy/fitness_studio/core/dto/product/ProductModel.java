package it.academy.fitness_studio.core.dto.product;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import it.academy.fitness_studio.core.UserRole;
import it.academy.fitness_studio.core.UserStatus;
import it.academy.fitness_studio.core.converter.CustomDoubleConverter;
import it.academy.fitness_studio.core.converter.CustomInstantConverter;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Column;
import javax.persistence.Version;
import java.time.Instant;
import java.util.UUID;

@JsonIgnoreProperties
public class ProductModel {
    @JsonProperty("uuid")
    private UUID uuid;
    @JsonSerialize(converter = CustomInstantConverter.Serializer.class)
    @JsonProperty("dtcreate")
    private Instant dtCreate;
    @JsonSerialize(converter = CustomInstantConverter.Serializer.class)
    @JsonProperty("dtupdate")
    private Instant dtUpdate;
    @JsonProperty("title")
    private String title;
    @JsonProperty("weight")
    private Integer weight;


    @JsonProperty("calories")
    private Integer calories;
    @JsonSerialize(converter = CustomDoubleConverter.Serializer.class)
    @JsonProperty("proteins")
    private Double proteins;
    @JsonSerialize(converter = CustomDoubleConverter.Serializer.class)
    @JsonProperty("fats")
    private Double fats;
    @JsonSerialize(converter = CustomDoubleConverter.Serializer.class)
    @JsonProperty("carbohydrates")
    private Double carbohydrates;

    public ProductModel() {
    }

    public ProductModel(UUID uuid,
                        Instant dtCreate,
                        Instant dtUpdate,
                        String title,
                        Integer weight,
                        Integer calories,
                        Double proteins,
                        Double fats,
                        Double carbohydrates) {
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

    public Double getProteins() {
        return proteins;
    }

    public Double getFats() {
        return fats;
    }

    public Double getCarbohydrates() {
        return carbohydrates;
    }
}
