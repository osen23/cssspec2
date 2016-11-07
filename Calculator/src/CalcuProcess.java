/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lbbasilla
 */





import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcuProcess extends JFrame{
    private static JTextField display;
    private static JButton one,two,three,four,five,six,seven,eight,nine,zero,plus,minus,times,divide,equals,clear;
    private static String temp1,temp2,sresult;
    private static JPanel design;
    private static double result;
    private boolean equalClick = false, opClick = false;
    String operation = " ";
    private static double n1,n2;
    
    public CalcuProcess(){
        super("Osen Calculator");
        
        display = new JTextField(null,25);
        display.setEditable(false);
        display.setBackground(Color.WHITE);
        
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");
        plus = new JButton("+");
        minus = new JButton("-");
        times = new JButton("*");
        divide = new JButton("/");
        equals = new JButton("=");
        clear = new JButton("C");
        
        Dimension dim = new Dimension(50,25);
        
        one.setPreferredSize(dim);
        two.setPreferredSize(dim);
        three.setPreferredSize(dim);
        four.setPreferredSize(dim);
        five.setPreferredSize(dim);
        six.setPreferredSize(dim);
        seven.setPreferredSize(dim);
        eight.setPreferredSize(dim);
        nine.setPreferredSize(dim);
        zero.setPreferredSize(dim);
        plus.setPreferredSize(dim);
        minus.setPreferredSize(dim);
        times.setPreferredSize(dim);
        divide.setPreferredSize(dim);
        equals.setPreferredSize(dim);
        clear.setPreferredSize(dim);
        
       
                
                            
                  
        Numbers n = new Numbers();
        Solve s = new Solve();
        
        one.addActionListener(n);
        two.addActionListener(n);
        three.addActionListener(n);
        four.addActionListener(n);
        five.addActionListener(n);
        six.addActionListener(n);
        seven.addActionListener(n);
        eight.addActionListener(n);
        nine.addActionListener(n);
        zero.addActionListener(n);
        plus.addActionListener(s);
        minus.addActionListener(s);
        times.addActionListener(s);
        divide.addActionListener(s);
        equals.addActionListener(s);
        clear.addActionListener(s);
        
         design = new JPanel();
         design.add(display,BorderLayout.NORTH);
         
         design.add(one);
         design.add(two); 
         design.add(three); 
         design.add(four); 
         design.add(five); 
         design.add(six); 
         design.add(seven); 
         design.add(eight); 
         design.add(nine); 
         design.add(zero); 
         design.add(plus); 
         design.add(minus); 
         design.add(times); 
         design.add(divide); 
         design.add(equals); 
         design.add(clear); 
         this.setContentPane(design);
        
    }
    private class Numbers implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==one){
                if(opClick==false){
                    if(temp1==null){
                        temp1 = "1";
                    }
                    else{
                        temp1 = temp1 += "1";
                    }
                }else{
                    if(temp2==null){
                        temp2 = "1";
                    }
                    else{
                        temp2 = temp2 += "1";
                    }
                   
                }
                    
                
            }
            
            if(e.getSource()==two){
                if(opClick==false){
                    if(temp1==null){
                        temp1 = "2";
                    }
                    else{
                        temp1 = temp1 += "2";
                    }
                }else{
                    if(temp2==null){
                        temp2 = "2";
                    }
                    else{
                        temp2 = temp2 += "2";
                    }
                   
                }
                    
                
            }
            if(e.getSource()==three){
                if(opClick==false){
                    if(temp1==null){
                        temp1 = "3";
                    }
                    else{
                        temp1 = temp1 += "3";
                    }
                }else{
                    if(temp2==null){
                        temp2 = "3";
                    }
                    else{
                        temp2 = temp2 += "3";
                    }
                   
                }
                    
                
            }
            if(e.getSource()==four){
                if(opClick==false){
                    if(temp1==null){
                        temp1 = "4";
                    }
                    else{
                        temp1 = temp1 += "4";
                    }
                }else{
                    if(temp2==null){
                        temp2 = "4";
                    }
                    else{
                        temp2 = temp2 += "4";
                    }
                   
                }
                    
                
            }
            if(e.getSource()==five){
                if(opClick==false){
                    if(temp1==null){
                        temp1 = "5";
                    }
                    else{
                        temp1 = temp1 += "5";
                    }
                }else{
                    if(temp2==null){
                        temp2 = "5";
                    }
                    else{
                        temp2 = temp2 += "5";
                    }
                   
                }
                    
                
            }
            if(e.getSource()==six){
                if(opClick==false){
                    if(temp1==null){
                        temp1 = "6";
                    }
                    else{
                        temp1 = temp1 += "6";
                    }
                }else{
                    if(temp2==null){
                        temp2 = "6";
                    }
                    else{
                        temp2 = temp2 += "6";
                    }
                   
                }
                    
                
            }
            if(e.getSource()==seven){
                if(opClick==false){
                    if(temp1==null){
                        temp1 = "7";
                    }
                    else{
                        temp1 = temp1 += "7";
                    }
                }else{
                    if(temp2==null){
                        temp2 = "7";
                    }
                    else{
                        temp2 = temp2 += "7";
                    }
                   
                }
                    
                
            }
            if(e.getSource()==eight){
                if(opClick==false){
                    if(temp1==null){
                        temp1 = "8";
                    }
                    else{
                        temp1 = temp1 += "8";
                    }
                }else{
                    if(temp2==null){
                        temp2 = "8";
                    }
                    else{
                        temp2 = temp2 += "8";
                    }
                   
                }
                    
                
            }
            if(e.getSource()==nine){
                if(opClick==false){
                    if(temp1==null){
                        temp1 = "9";
                    }
                    else{
                        temp1 = temp1 += "9";
                    }
                }else{
                    if(temp2==null){
                        temp2 = "9";
                    }
                    else{
                        temp2 = temp2 += "9";
                    }
                   
                }
                    
                
            }
            if(e.getSource()==zero){
                if(opClick==false){
                    if(temp1==null){
                        temp1 = "0";
                    }
                    else{
                        temp1 = temp1 += "0";
                    }
                }else{
                    if(temp2==null){
                        temp2 = "0";
                    }
                    else{
                        temp2 = temp2 += "0";
                    }
                   
                }
                    
                
            }
            if(equalClick==false){
                if(opClick==false){
                    display.setText(temp1);
                }
                else{
                     display.setText(temp2);
                }
            }
            
        }
        
    }
    
    private class Solve implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==plus){
                if(temp1==null){
                    JOptionPane.showMessageDialog(null,"Enter a number first!!", "Error Message", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    if(temp1!=null && temp2 == null){
                        opClick = true;
                        operation = "+";
                    
                }else{
                        if(temp1!=null && temp2!=null){
                          JOptionPane.showMessageDialog(null,"Two numbers only.Sorry!!", "Error Message", JOptionPane.ERROR_MESSAGE);  
                        }
                    }
            }
            
        }
            if(e.getSource()==minus){
                if(temp1==null){
                    JOptionPane.showMessageDialog(null,"Enter a number first!!", "Error Message", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    if(temp1!=null && temp2 == null){
                        opClick = true;
                        operation = "-";
                    
                }else{
                        if(temp1!=null && temp2!=null){
                          JOptionPane.showMessageDialog(null,"Two numbers only.Sorry!!", "Error Message", JOptionPane.ERROR_MESSAGE);  
                        }
                    }
            }
            
        }
            if(e.getSource()==times){
                if(temp1==null){
                    JOptionPane.showMessageDialog(null,"Enter a number first!!", "Error Message", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    if(temp1!=null && temp2 == null){
                        opClick = true;
                        operation = "*";
                    
                }else{
                        if(temp1!=null && temp2!=null){
                          JOptionPane.showMessageDialog(null,"Two numbers only.Sorry!!", "Error Message", JOptionPane.ERROR_MESSAGE);  
                        }
                    }
            }
            
        }
            if(e.getSource()==divide){
                if(temp1==null){
                    JOptionPane.showMessageDialog(null,"Enter a number first!!", "Error Message", JOptionPane.ERROR_MESSAGE);
                }
                else{
                    if(temp1!=null && temp2 == null){
                        opClick = true;
                        operation = "/";
                    
                }else{
                        if(temp1!=null && temp2!=null){
                          JOptionPane.showMessageDialog(null,"Two numbers only.Sorry!!", "Error Message", JOptionPane.ERROR_MESSAGE);  
                        }
                    }
            }
            
        }
            if(e.getSource()==equals){
                if(temp1==null){
                    JOptionPane.showMessageDialog(null,"Enter a number first!!", "Error Message", JOptionPane.ERROR_MESSAGE);
                }
                 else{
                    if(temp1!=null && temp2 == null){
                       JOptionPane.showMessageDialog(null,"Error!! Choose two numbers first!!", "Error Message", JOptionPane.ERROR_MESSAGE); 
                    
                }
             if(temp1 !=null && temp2 != null){
                 
                 n1=Double.parseDouble(temp1);
                 n2=Double.parseDouble(temp2);
                 
                 switch(operation){
                     case "+":
                         result = n1 + n2;
                         break;
                     case "-":
                         result = n1 - n2;
                         break;
                     case "*":
                         result = n1 * n2;
                         break;
                     case "/":
                         result = n1 / n2;
                         break;
                        
                 }
                 sresult = Double.toString(result);
                 display.setText(sresult);
                 
                 if(operation == "/" && n2 == 0.0){
                     display.setText("SYNTAX ERROR J3J3J3J3");
                 }
             }
            }
        
    }
            if(e.getSource() == clear){
                
                temp1 = null;
                temp2 = null;
                equalClick = false;
                opClick = false;
                operation = " ";
                display.setText(" ");
                sresult = null;
            }
        
    }
}
}
