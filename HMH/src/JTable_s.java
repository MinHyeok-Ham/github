import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class JTable_s extends JPanel{
	
	public JTable_s(){
		Controller ct = new Controller();
		ct.loadStudent();
		ct.loadTeacher();
		String colNames[] = {"일련번호","이름","나이","문과/이과","반","선택과목"};
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
	        
        String[] Data_Printed = { "", "", "","", "", "", ""};
        for(int i = 0; i < ct.s.size();i ++){
        	Data_Printed[0] = (ct.s.get(i).getPersonNO());
			Data_Printed[1] = (ct.s.get(i).getName());
			Data_Printed[2] = (ct.s.get(i).getAge());
			Data_Printed[3] = (ct.s.get(i).getEM());
			Data_Printed[4] = (ct.s.get(i).getGroup());
			Data_Printed[5] = (ct.s.get(i).getSelect_subject());
			model.addRow(Data_Printed);
			
        }
        JTable table = new JTable(model);
        JScrollPane sp = new JScrollPane(table);
		add(sp);
	
	}
}
