/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolver;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

/**
 *
 * @author nicol
 */
public class SudokuSolver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            
            JFrame main_window = new JFrame("Sudoku solver v0.1");
            main_window.setLayout(new GridBagLayout());
            GridBagConstraints gbl = new GridBagConstraints();
            
            WelcomeScreenPanel wspanel = new WelcomeScreenPanel();
            
            main_window.setSize(400,400);
            main_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            main_window.setVisible(true);
            
            gbl.fill = GridBagConstraints.BOTH;
            
            main_window.add(wspanel, gbl);
            
        });
        
        
    }
    
}
