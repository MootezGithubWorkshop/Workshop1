
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JSplitPane;
//import javax.swing.SwingConstants;
class SplitPane extends JFrame 
{     

    private static final long serialVersionUID = 1L;     
    private JSplitPane splitPaneV;     
    private JSplitPane splitPaneH;      
    private JLayeredPane panel1;      
    private JPanel panel2;      
    private JPanel panel3;      
    private JButton add;
    private JButton remove;
    private JScrollBar scrollBar;
    private JList list;


    public SplitPane() 
    {
        setTitle("AdditionalLoaderInformation");         
        setBackground(Color.blue);            
        JPanel topPanel = new JPanel();           
        topPanel.setLayout(new BorderLayout());         
        topPanel.setPreferredSize(new Dimension(700, 500));         
        getContentPane().add(topPanel); 

        // Create the panels        
        createPanel1();          
        createPanel2();         
        createPanel3();      

        // Create a splitter pane         
        splitPaneV = new JSplitPane(JSplitPane.VERTICAL_SPLIT);         
        topPanel.add(splitPaneV, BorderLayout.CENTER);           
        splitPaneH = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);          
        splitPaneH.setLeftComponent(panel1);         
        splitPaneH.setRightComponent(panel2);           
        splitPaneV.setLeftComponent(splitPaneH);         
        splitPaneV.setRightComponent(panel3);

        scrollBar = new JScrollBar();
        scrollBar.setOrientation(JScrollBar.HORIZONTAL);
        panel3.add(scrollBar, BorderLayout.SOUTH);


        list = new JList();
        panel3.add(list, BorderLayout.CENTER);
        }       
    public void createPanel1() 
    {         
        panel1 = new JLayeredPane();         
        panel1.setLayout(new BorderLayout()); 

    }


    public void createPanel2() 
    {          
        panel2 = new JPanel();

        add = new JButton("ADD");
        final JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
           //        ************************************

                  }
              });   


        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel2.add(add);

        remove = new JButton("REMOVE");
        remove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            removeActionPerformed(e);   
            }

            private void removeActionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            }
        });
        panel2.add(remove);        



        }            

           public void createPanel3()
           {      
               panel3 = new JPanel();       
               panel3.setLayout(new BorderLayout());       
               panel3.setPreferredSize(new Dimension(400, 100));      
               panel3.setMinimumSize(new Dimension(100, 50));        
               final JFileChooser fileChooser = new JFileChooser();   
               fileChooser.setMultiSelectionEnabled(true);
               //fileChooser.showOpenDialog(fileChooser);
               fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
               fileChooser .setDialogTitle("OPEN"); 
               panel3.add(fileChooser, BorderLayout.NORTH);  

               //fileChooser.addActionListener(new ActionListener()
              // {          
                  // public void actionPerformed(ActionEvent e)
                   //{             




                     // }       
                   //});    
               }  

        public static void main(String args[]) {        
            // Create an instance of the test application         
            SplitPane mainFrame = new SplitPane();        
            mainFrame.pack();         
            mainFrame.setVisible(true);     
            }
        }  