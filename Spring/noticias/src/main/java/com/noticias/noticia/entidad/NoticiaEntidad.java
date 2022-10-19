/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noticias.noticia.entidad;

import javax.persistence.*;

@Entity
public class NoticiaEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String cuerpo;
    @OneToOne
    private ImagenEntidad foto;

    public NoticiaEntidad() {
    }

    public NoticiaEntidad(Long id, String titulo, String cuerpo, ImagenEntidad foto) {
        this.id = id;
        this.titulo = titulo;
        this.cuerpo = cuerpo;
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public ImagenEntidad getFoto() {
        return foto;
    }

    public void setFoto(ImagenEntidad foto) {
        this.foto = foto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "NoticiasEntidad{" + "id=" + id + ", titulo=" + titulo + ", cuerpo=" + cuerpo + ", foto=" + foto + '}';
    }

}
