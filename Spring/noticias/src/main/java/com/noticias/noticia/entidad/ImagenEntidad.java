/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noticias.noticia.entidad;

import javax.persistence.*;

/**
 *
 * @author Usuario
 */
@Entity
public class ImagenEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mime;
    private String nombre;
    @Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] contenido;

    public ImagenEntidad() {
    }

    public ImagenEntidad(Long id, String mime, String nombre, byte[] contenido) {
        this.id = id;
        this.mime = mime;
        this.nombre = nombre;
        this.contenido = contenido;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte[] getContenido() {
        return contenido;
    }

    public void setContenido(byte[] contenido) {
        this.contenido = contenido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
  
    @Override
    public String toString() {
        return "ImagenEntidad{" + "id=" + id + ", mime=" + mime + ", nombre=" + nombre + ", contenido=" + contenido + '}';
    }

}
