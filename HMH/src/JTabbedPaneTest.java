import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

class JTabbedPaneTest extends JPanel {
	JTable table;
	JTabbedPane tab;
	JTable_s s_t;
	JTable_t t_t;
	public JTabbedPaneTest(){
		Controller ct = new Controller();
		ct.loadStudent();
		ct.loadTeacher();
		tab = new JTabbedPane(JTabbedPane.TOP);
		JPanel panel = new JPanel();

		JPanel jps = new JPanel();
		JPanel jpt = new JPanel();
		s_t = new JTable_s();
		t_t = new JTable_t();
		jps.add(s_t);
		jpt.add(t_t);
		
		tab.addTab("학생메뉴",jps);
		tab.addTab("선생님메뉴",jpt);
		panel.add(tab,BorderLayout.WEST);
		setSize(600,250);
		JButton btn = new JButton("OK");
		add(panel,new GridLayout(1,1));
		
		setVisible(true);
	}
}
