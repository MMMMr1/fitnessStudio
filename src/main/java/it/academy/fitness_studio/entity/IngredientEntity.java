package it.academy.fitness_studio.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

//@Entity
//@Table(schema = "app",name = "ingredient")
@Embeddable
public class IngredientEntity {
//    @Id
//    @GeneratedValue(generator = "increment")
//    @GenericGenerator(name="increment", strategy = "increment")
//    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "product_id",
            nullable = false, updatable = false
    )
    private ProductEntity product;

    private Integer weight;

    public IngredientEntity(ProductEntity product, Integer weight) {
        this.product = product;
        this.weight = weight;
    }

    public IngredientEntity() {
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }
}
