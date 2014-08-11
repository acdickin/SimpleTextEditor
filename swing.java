package com.adickinson.program;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing extends JFrame {
	fileReader f;
	JButton add;
	JButton load;
	JButton save;
	JFrame frame;
	JPanel panel;
	JLabel lbl;	
	JTextField txt;
	JTextField txa;
	public swing()
	{
		f=new fileReader();
		createFrame();
		
	}
	
	public void createFrame(){
		frame = new JFrame();
		  frame.add(createPanel());
		  frame.setTitle("Read from a File");
		  frame.setLocationRelativeTo(null);
		  frame.setSize(200,300);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setVisible(true);
		
	}
	
	public JPanel createPanel(){
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		lbl= new JLabel("File Name");
		txt= new JTextField("");
		add=new JButton("New");
		add.addActionListener(new AddListener());
		load= new JButton("Load");
		load.addActionListener(new LoadListener());
		
		
		panel.add(lbl,BorderLayout.NORTH);
		panel.add(txt,BorderLayout.NORTH);
		panel.add(add,BorderLayout.NORTH);
		panel.add(load,BorderLayout.NORTH);
		panel.add(save,BorderLayout.NORTH);
		
		panel.add(txa, BorderLayout.CENTER);
		return panel;
	}
	private class AddListener implements ActionListener{
		
		 public void actionPerformed(ActionEvent arg0) {
			
			 txa.setText("");
			 txt.setText("");
			 txt.requestFocus();
			
		 }
	}
	
	private class LoadListener implements ActionListener{
		
		 public void actionPerformed(ActionEvent arg0) {
			 String name =txt.getText();
			 f. LoadFile(name);
			 
			
		 }
	}
	
	private class SaveListener implements ActionListener{
		
		 public void actionPerformed(ActionEvent arg0) {
			
			String name =txt.getText();
			String contents=txa.getText();
			 f.SaveFile(name, contents);
			 
			
		 }
	}
	
	
}