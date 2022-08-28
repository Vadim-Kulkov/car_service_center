package com.example.carservicecenter.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "city")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class City implements Serializable {

    @Column(unique = true)
    private String name;

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private int code;

    @Column(name = "defaultcity")
    private Boolean defaultCity;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "city", cascade = CascadeType.REFRESH)
    @ToString.Exclude
    private List<CarServiceCenter> centers;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City that = (City) o;
        return code == that.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
