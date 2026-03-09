package com.OOP;

public class Fruit {
    
    int grams;
    int calsPerGram;

    int totalCalories() {
        return grams * calsPerGram;
    }
}
