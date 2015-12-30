package com.shop.Model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by bymot on 28.12.2015.
 */
@Entity
@Table(name = "status")
public class Status {
    private Long id;
    private String statusName;

    public Status() {
    }

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "status", nullable = false)
    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }
}
