package com.devsuperior.dslearnbds.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.OneToMany;
import javax.persistence.GenerationType;

@Entity
@Table(name = "tb_course")
public class Course implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String imgUri;
    private String imgGrayUri;

    @OneToMany(mappedBy = "course")
    private List<Offer> offers = new ArrayList<>();

    public Course () { }

    public Course(Long id, String name, String imgUri, String imgGrayUri){
        super();
        this.id = id;
        this.name = name;
        this.imgUri = imgUri;
        this.imgGrayUri = imgGrayUri;
    }

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getImgUri() { return imgUri; }

    public void setImgUri(String imgUri) { this.imgUri = imgUri; }

    public String getImgGrayUri() { return imgGrayUri; }

    public void setImgGrayUri(String imgGrayUri) { this.imgGrayUri = imgGrayUri; }

    public List<Offer> getOffers() { return offers; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;

        Course course = (Course) o;

        return id.equals(course.id);
    }

    @Override
    public int hashCode() { return id.hashCode(); }
}
