package com.digitalinnovationone.heroesapi.document;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.xspec.S;
import org.springframework.data.annotation.Id;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@DynamoDBTable(tableName = "Heroes_Table")
public class Heroes {
    @Id
    @DynamoDBHashKey(attributeName = "id")
    private String id;
    @DynamoDBHashKey(attributeName = "name")
    private String name;
    @DynamoDBHashKey(attributeName = "universe")
    private String universe;
    @DynamoDBHashKey(attributeName = "films")
    private int films;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniverso() {
        return universe;
    }

    public void setUniverso(String universo) {
        this.universe = universo;
    }

    public int getFilms() {
        return films;
    }

    public void setFilms(int films) {
        this.films = films;
    }

    public Heroes(String id, String name, String universe, int  films){
        this.id=id;
        this.name=name;
        this.universe=universe;
        this.films=films;
    }

}
