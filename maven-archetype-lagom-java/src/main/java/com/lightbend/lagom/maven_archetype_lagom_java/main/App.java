package com.lightbend.lagom.maven_archetype_lagom_java.main;

import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        System.out.println("testing OOP concepts! :) ");
        
        //eclipse shorcut type sysout (ctr + space + enter) for prtintln 
//    	MyFrame mf;
        
//        JFrame frame = new JFrame();
//        frame.setLayout(new FlowLayout());
//
//        JMenuBar menuBar = new JMenuBar();
//
//        JMenu fileMenu = new JMenu("File");
//        JMenu editMenu = new JMenu("Edit");
//        JMenu helpMenu = new JMenu("Help");
//
//        // JMenu added to JMenuBar BEFORE JMenuItem
//        menuBar.add(fileMenu);
//        menuBar.add(editMenu);
//        menuBar.add(helpMenu);
//
//        JMenuItem loadItem = new JMenuItem("Load");
//        JMenuItem saveItem = new JMenuItem("Save");
//        JMenuItem exitItem = new JMenuItem("Exit");
//
//        fileMenu.add(loadItem);
//        fileMenu.add(saveItem);
//        fileMenu.add(exitItem);
//
//
//        frame.setJMenuBar(menuBar);
    	
    	JFrame frame = new JFrame();
//        MyFrame frame = new MyFrame();
        frame.setLayout(new FlowLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        // JMenu added to JMenuBar AFTER JMenuItem
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        frame.setJMenuBar(menuBar);
        
        
        
        
        
        
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
    

}
