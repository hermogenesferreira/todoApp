/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import controller.ProjectController;
import model.Project;

/**
 *
 * @author Neno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        ProjectController projectController = new ProjectController();
        Project p1 = new Project();
        p1.setId(2);
        p1.setName("Nome Editado");
        p1.setDescription("descrição");
        projectController.update(p1);
        
    }
    
}
