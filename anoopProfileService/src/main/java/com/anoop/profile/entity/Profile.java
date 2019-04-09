package com.anoop.profile.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "profileDetails")
public class Profile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "profile_id", unique = true)
    private int id;

    @Column(name = "profile_name", nullable = false)
    private String name;

    @Column(name = "profile_address", nullable = false)
    private String address;

    @Column(name = "profile_jobRole", nullable = false)
    private String jobRole;

    @Column(name = "profile_experience", nullable = false)
    private int experience;

    @Column(name = "profile_description", nullable = false)
    private String description;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
