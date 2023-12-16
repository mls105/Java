package com.lightbend.lagom.maven_archetype_lagom_java.main.StackOverflowQuestions;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.plaf.TabbedPaneUI;



public class TabbedPaneExample
	{
	    public static void createAndShowGUI()
	    {
	        JTabbedPane tabbedPane = new JTabbedPane()
	        {
	            //@Override
	            public Dimension getPreferredSize()
	            {
	                Dimension size = super.getPreferredSize();

	                TabbedPaneUI ui = getUI();
	                Rectangle lastTab = ui.getTabBounds(this, this.getTabCount() - 1);
	                int tabsWidth = lastTab.x + lastTab.width;

	                Insets border = UIManager.getInsets("TabbedPane.contentBorderInsets");
	                tabsWidth += border.left + border.right;

	                if (tabsWidth > size.width)
	                    size.width = tabsWidth;

	                return size;
	            }
	        };
	        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

	        JPanel first = new JPanel();
	        first.setPreferredSize( new Dimension(400, 400) );
	        tabbedPane.add("The first tab", first);
	        tabbedPane.add("The second tab", new JPanel());
	        tabbedPane.add("The third tab has longer text", new JPanel());
	        tabbedPane.add("The fourth tab", new JPanel());
	        tabbedPane.add("The fith tab", new JPanel());

	        JFrame frame = new JFrame("TabbedPaneExample2");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.add(tabbedPane);
	        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        frame.pack();
	        frame.setLocationByPlatform( true );
	        frame.setVisible( true );
	    }
	}