//package de.bsi.openai.dalle;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpRequest.BodyPublishers;

public class finalproject {
    private static final String OPENAI_API_KEY = "OTIxMTI5amlheWlAZ21haWwuY29t:CD2YhCPqhw7qhchKyVkJD"; 
    private static String DALLE_POST_BODY = """
            {
                "prompt": "Draw Mona Lisa in Picasso style",
                "n": 1,
                "size": "1024x1024",
                "response_format": "url"
            }
            """;

    public static void main(String... args) throws IOException, InterruptedException {
        var request = HttpRequest.newBuilder()
            .uri(URI.create("https://api.openai.com/v1/images/generations"))
            .header("Content-Type", "application/json")
            .header("Authorization", "Bearer " + OPENAI_API_KEY)
            .POST(BodyPublishers.ofString(DALLE_POST_BODY))
            .build();

        var client = HttpClient.newHttpClient();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}