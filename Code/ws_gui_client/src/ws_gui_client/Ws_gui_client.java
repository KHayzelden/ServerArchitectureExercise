/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws_gui_client;

import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author terstyg
 */
public class Ws_gui_client 
{ static int a=0, b=0, c=0;
  String str = new String(); 
  JTextField fielda, fieldb;
  JTextField fieldc;
  
Ws_gui_client()
{      JButton butta, buttb;
       JButton buttc;
       JLabel result;
       JPanel panel;

       JFrame frame  = new JFrame();
       frame.setBackground(Color.white);
       frame.setForeground(Color.black);
       frame.setSize(500,250);
 
       panel = new JPanel();
       panel.setBackground(Color.cyan);
       panel.setForeground(Color.black);
       panel.setLayout(new GridLayout(0,2));
       
       butta = new JButton("enter number a");
       buttb = new JButton("enter number b");
       buttc = new JButton("result a+b = ");
 
       fielda = new JTextField();
       fieldb = new JTextField();
       fieldc = new JTextField();

       panel.add(butta);
       panel.add(fielda);
       panel.add(buttb);
       panel.add(fieldb);
       panel.add(buttc);
       panel.add(fieldc);
       
       butta.addActionListener(new GetA());
       buttb.addActionListener(new GetB());
       buttc.addActionListener(new GetR());
       frame.getContentPane().add(panel);
       frame.pack();
       frame.setVisible(true);
    }
        
    class GetA implements ActionListener
    { public void actionPerformed(ActionEvent t1e)
      { a = Integer.parseInt(fielda.getText()); }
    }

    class GetB implements ActionListener
    { public void actionPerformed(ActionEvent t1e)
      { b = Integer.parseInt(fieldb.getText()); }
    }

    class GetR implements ActionListener
    { public void actionPerformed(ActionEvent t1e)
      { fieldc.setText(String.valueOf(addNumbers(a, b))); }
    }
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { try
      { Ws_gui_client client = new Ws_gui_client();
      }
      catch (Exception ex)
      { System.out.println("exception = " + ex);
      }
    }

    private static int addNumbers(int a, int b) 
    { calculator_ws.Calculator_Service service = new calculator_ws.Calculator_Service();
      calculator_ws.Calculator port = service.getCalculatorPort();
      return port.addNumbers(a, b);
    }
    
}
