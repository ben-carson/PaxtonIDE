package pax.view;

import javax.swing.*;
import java.awt.*;

/**
 * Created by pAxton on 6/19/2016.
 */
public class ProjectTreeFrame extends JInternalFrame{
    private ProjectTree tree;
    private static ProjectTreeFrame ourInstance = new ProjectTreeFrame();

    public static ProjectTreeFrame getInstance() {
        return ourInstance;
    }

    private ProjectTreeFrame() {
        super();
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setMaximizable(true);
        setResizable(true);
        setClosable(true);
        setName("Editor");
        setMinimumSize(new Dimension(200,200));
        setPreferredSize(new Dimension(800, 600));
        tree = new ProjectTree();
        add(tree);
        pack();
    }
}