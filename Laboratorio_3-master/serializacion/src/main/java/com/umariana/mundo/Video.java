
package com.umariana.mundo;

/**
 *
 * @author Johan Ordoñez
 */
public class Video {
    private int idVideo;
    private String titulo;
    private String autor;
    private String anio;
    private String categoria;
    private String url;
    private String letra;
    
    
    public Video() {
        
    }

    public Video(int idVideo, String titulo, String autor, String anio, String categoria, String url, String letra) {
    this.idVideo = idVideo;
    this.titulo = titulo;
    this.autor = autor;
    this.anio = anio;
    this.categoria = categoria;
    this.url = url;
    this.letra = letra;
    }

    
    /*
    Getters and setters
    */
    
    public int getIdVideo() {
        return idVideo;
    }

    public void setIdVideos(int idVideos) {
        this.idVideo = idVideos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }





    
    
        
    
}
