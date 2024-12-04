/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter_06_GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Muhammad Irman Syakir Bin Ismail_s62354
 */
public class GUI_AWT extends Frame {

    public GUI_AWT() {

        // creating a Label  
        Label lblName = new Label("Employee id:");
        // creating a Button  
        Button btn = new Button("Submit");
        // creating a TextField  
        TextField TextField = new TextField();

        // setting position of above components in the frame  
        //   x,y,
        lblName.setBounds(20, 100, 80, 30);
        TextField.setBounds(100, 100, 80, 30);
        btn.setBounds(100, 130, 80, 30);

        // adding components into frame    
        add(btn);
        add(lblName);
        add(TextField);

        // frame size 300 width and 300 height    
        setSize(300, 300);

        // setting the title of frame  
        setTitle("Employee info");

        // no layout  
        setLayout(null);

        // setting visibility of frame  
        setVisible(true);

        // adding WindowListener to the Frame  
       // and using the windowClosing() method of WindowAdapter class
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {

        // creating instance of Frame class
        GUI_AWT awt_obj = new GUI_AWT();
    }
}
