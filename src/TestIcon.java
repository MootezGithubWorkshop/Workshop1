import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.border.LineBorder;


public class TestIcon extends JFrame{

     public static void main(String[] args) {


    final JFileChooser chooser = new JFileChooser();
    JButton button = new JButton();
    button.setText("Upload");
    JFrame frame = new JFrame("My Frame");
    JList list = new JList();
    Map<Object, ImageIcon> icons = new HashMap<Object, ImageIcon>();
    list.setBorder(new LineBorder(Color.BLACK));

    ImageIcon icon = new ImageIcon("peer.png");

    ArrayList<String> arrayList = new ArrayList<String>();

    icons.put("Name", icon);

    //populate the arrayList for testing
    arrayList.add("Smith");
    arrayList.add("John");
    arrayList.add("Bob");
    arrayList.add("Kim");

    frame.setSize(new Dimension(400, 400));
    //set the list data
    list.setListData(arrayList.toArray());
    final JFrame imageFrame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    TestIcon test= new TestIcon(); 
    list.setCellRenderer(test.new IconListRenderer(icons));
    frame.add(list); 
    frame.setVisible(true);
    frame.repaint();
}
private class IconListRenderer extends DefaultListCellRenderer {

private Map<Object, ImageIcon> icons = null;

public IconListRenderer(Map<Object, ImageIcon> icons) {
this.icons = icons;
}

@Override
public Component getListCellRendererComponent(
JList list, Object value, int index,
boolean isSelected, boolean cellHasFocus) {

// Get the renderer component from parent class

JLabel label =
(JLabel) super.getListCellRendererComponent(list,
value, index, isSelected, cellHasFocus);

// Get icon to use for the list item value

Icon icon = icons.get(value);

// Set icon to display for value

label.setIcon(icon);
return label;
}
}


}