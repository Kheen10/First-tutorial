package com.Kheens.movies;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class review {
    @Id
    private ObjectId _id;
    private String body;
    
    public review(String body) {
        this.body = body;
    }

}
