package com.shop.Model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by bymot on 21.12.2015.
 */
@Entity(name = "product")
public class Product {

    private Long id;
    private Category category;
    private String name;
    private String description;
    private BigDecimal price;
    private Timestamp date;

    private Set<Image> images = new HashSet<Image>();

    public Product() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "description", nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "price", nullable = false)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Column(name = "date", nullable = false)
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    public Set<Image> getImages() {
        return images;
    }

    public void setImages(Set<Image> images) {
        this.images = images;
    }
}
