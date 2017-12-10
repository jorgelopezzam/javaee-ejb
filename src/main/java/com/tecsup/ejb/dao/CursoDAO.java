/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.ejb.dao;

import com.tecsup.ejb.model.Curso;
import java.util.List;
/**
 *
 * @author PCC
 */
public interface CursoDAO {
    
    public List<Curso> all();

    public Curso find(Long id);

    public void save(Curso curso);

    public void update(Curso curso);

    public void delete(Curso curso);
    
}
