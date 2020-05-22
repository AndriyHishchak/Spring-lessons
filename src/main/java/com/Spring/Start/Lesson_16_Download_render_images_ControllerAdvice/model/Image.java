package com.Spring.Start.Lesson_16_Download_render_images_ControllerAdvice.model;

import javax.persistence.*;

@Entity
@Table(name="images")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Lob //щоб зберегло в правельному типі
    private Byte[] image;

    public Image() {

    }

    public Image(String description, Byte[] image) {
        this.description = description;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Byte[] getImage() {
        return image;
    }

    public void setImage(Byte[] image) {
        this.image = image;
    }
}
