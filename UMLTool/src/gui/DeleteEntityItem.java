/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
/**
 *
 * @author kuba
 */
public class DeleteEntityItem extends JMenuItem implements ActionListener{
    private DeleteEntityForm form;

    public DeleteEntityItem() {
        super("Delete active class/interface");
        addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        form = new DeleteEntityForm();
    }
}
