package com.example.MySpringRestServer.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class SomeData implements Serializable, Comparable<SomeData> {
    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 30)
    private String provider;

    @Column(length = 30)
    String value;

    public SomeData() {
    }

    public SomeData(Long id, String provider, String value) {
        this.id = id;
        this.provider = provider;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int compareTo(SomeData o) {
        int result;
        if ((result = provider.compareTo(o.getProvider())) == 0)
            return value.compareTo(o.getValue());
        else return result;
    }
}
