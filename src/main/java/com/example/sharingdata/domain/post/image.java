package com.example.sharingdata.domain;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class image {

    @Id
    @GeneratedValue
    private Integer ID;
    @NotNull
    private Integer boardIdx;

    @NotNull
    private String original_file_name;

    @NotNull
    private String stored_file_path;

    private long file_size;
}
