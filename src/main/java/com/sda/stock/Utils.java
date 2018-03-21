package com.sda.stock;

import com.mongodb.MongoClient;
import org.bson.Document;

import javax.print.Doc;
import java.util.List;

public class Utils {

    public static void displayDoc(Document doc) {
        System.out.println("---");
        System.out.println("Title: " + doc.getString("title"));
        System.out.println("Authors: ");
        List<String> authors = (List<String>) doc.get("authors");
        authors.forEach(author -> System.out.println("- " + author));
        System.out.println("Type: " + doc.getString("type"));
        authors.forEach(author -> System.out.println("- " + author));
        String type = doc.getString("type");
        Document details = (Document) doc.getString("details");
        switch (type){
        case "book":
        System.out.println("Publisher" + details.getString("publisher"));
        System.out.println("Edition" + details.getString("edition"));
        break;
        case"movie":
        System.out.println("Genre" + details.getString("genre"));
        System.out.println("Media type:" + details.getString("media"));
            System.out.println("Starring: ");


                )

    }

    public static MongoClient connect() {
        return new MongoClient("localhost", 27017);
    }
}
