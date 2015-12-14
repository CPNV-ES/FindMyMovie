/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.List;

/**
 *
 * @authors Marco, Sébastien, Emmanuel
 */
public class Film {
    // Attributes
    private String title;
    private List<String> actors;
    private int releaseYear;
    private String realisator;
    private List<String> types;
    private String runtime;
    private String description;
    private String image;
    private String path;

    // Constructors
    public Film(String title, List<String> acteurs, int releaseYear, String realisator, List<String> types) {
        this.title = title;
        this.actors = acteurs;
        this.releaseYear = releaseYear;
        this.realisator = realisator;
        this.types = types;
    }
    
    public Film(String title) {
        this.title = title;
    }

    public Film(String title, String path) {
        this.title = title;
        this.path = path;
    }
    
    // Getters & Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getRealisator() {
        return realisator;
    }

    public void setRealisator(String realisator) {
        this.realisator = realisator;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
}