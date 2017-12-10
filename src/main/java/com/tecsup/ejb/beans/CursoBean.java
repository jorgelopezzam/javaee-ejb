/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.ejb.beans;

import com.tecsup.ejb.dao.CursoDAO;
import com.tecsup.ejb.dao.ProgramaDAO;
import com.tecsup.ejb.model.Curso;
import com.tecsup.ejb.model.Programa;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

@ManagedBean
@RequestScoped
public class CursoBean {
    
    @Inject
    CursoDAO cursoDAO;
    
    @Inject
    ProgramaDAO programaDAO;

    private List<Curso> cursos;
    
    private List<Programa> programas;

    private Curso curso = new Curso();
    private Programa programa = new Programa();
    

    public void update(Curso pro) {
        this.curso = pro;
    }

    public void save() {
        curso.setPrograma(programa);
        if (curso.getId() == null) {
            cursoDAO.save(curso);
        } else {
            cursoDAO.update(curso);
        }
        this.curso = new Curso();
    }

    public void delete(Curso curso) {
        cursoDAO.delete(curso);
    }

    public List<Curso> getCursos() {
        cursos = cursoDAO.all();
        return cursos;
    }
    
    public List<Programa> getProgramas(){
        programas = programaDAO.all();
        return programas;
    }

    public Curso getCurso() {
        return curso;
    }
    
    public Programa getPrograma(){
        return programa;
    }
    
}
