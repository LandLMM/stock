package com.sda.stock;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.function.Consumer;

import static com.mongodb.client.model.Filters.eq;

public class FindByTitle {

    public static void main(String[] args) {
        try(MongoClient client = Utils.connect()) { // Laczymy sie
            MongoDatabase db = client.getDatabase("products");// Pobieramy produkt
            MongoCollection<Document> products = db.getCollection("products");
            products.find(eq("title", "Terminator"))
                    .forEach((Consumer<? super Document>) Utils::displayDoc); // Przyklad rzutowania
        }
    }
}
