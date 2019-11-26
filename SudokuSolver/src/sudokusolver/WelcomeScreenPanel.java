/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusolver;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author nicol
 */
public class WelcomeScreenPanel extends JPanel{
    
    public WelcomeScreenPanel()
    {
        super();
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        JButton checker_button = new JButton("Checker");
        JButton solver_button = new JButton(" Solver  ");
        
        checker_button.setFont(new Font("Arial", Font.PLAIN, 40 ));
        
        gbc.gridx = 1;
        gbc.gridy = 2;
        
        checker_button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new
            }
        });
        
        add(checker_button,gbc);
        //___________________________________
        
        solver_button.setFont(new Font("Arial", Font.PLAIN, 40 ));
        
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.insets = new Insets(50,0,0,0);
        
        add(solver_button,gbc);
        
    }
    
    
}
