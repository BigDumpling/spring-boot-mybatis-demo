package com.ligq.study.mybatis.demo.model;

import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.*;

@ToString
@Table(name = "pet")
public class Pet {
    @Id
    private Long id;

    private String name;

    private String owner;

    private String species;

    private String sex;

    private LocalDate birth;

    private LocalDate death;

    @Column(name = "create_time")
    private LocalDateTime createTime;

    @Column(name = "update_time")
    private LocalDateTime updateTime;

    @Column(name = "create_timestamp")
    private LocalDateTime createTimestamp;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return birth
     */
    public LocalDate getBirth() {
        return birth;
    }

    /**
     * @param birth
     */
    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    /**
     * @return death
     */
    public LocalDate getDeath() {
        return death;
    }

    /**
     * @param death
     */
    public void setDeath(LocalDate death) {
        this.death = death;
    }

    /**
     * @return create_time
     */
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return create_timestamp
     */
    public LocalDateTime getCreateTimestamp() {
        return createTimestamp;
    }

    /**
     * @param createTimestamp
     */
    public void setCreateTimestamp(LocalDateTime createTimestamp) {
        this.createTimestamp = createTimestamp;
    }
}