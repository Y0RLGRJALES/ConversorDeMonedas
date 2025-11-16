package com.yorlandi.conversor;
import com.google.gson.Gson;

public class TestGson {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = gson.toJson("Hola Yorlandi");
        System.out.println(json);
    }
}

