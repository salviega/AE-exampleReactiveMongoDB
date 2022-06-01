package com.example.exampleReactiveMongoDB.documents;

import jakarta.validation.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clients")
public class ClientDocument {

    @Id
    private String id;
    @NotEmpty
    private String name;
    @NotEmpty
    private String lastName;
    @NotEmpty
    private String age;
    @NotEmpty
    private Double payment;
    @NotEmpty
    private String photo;

    public ClientDocument() {}

    public  ClientDocument(String name, String lastName, String age, Double payment, String photo) {
        this.setName(name);
        this.setLastName(lastName);
        this.setAge(age);
        this.setPayment(payment);
        this.setPhoto(photo);
    }


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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Double getPayment() {
        return payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
