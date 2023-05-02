package com.oegeg.etd.saveservicetry2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class TestModel
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long ID;
    private String name;
}
