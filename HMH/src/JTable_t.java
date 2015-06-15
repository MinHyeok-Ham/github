import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class JTable_t extends JPanel {
	public JTable_t(){
		
		Controller ct = new Controller();
		ct.loadStudent();
		ct.loadTeacher();
		String colNames[] = {"일련번호","이름","나이","과목","담임반","핸드폰번호"};
		DefaultTableModel model = new DefaultTableModel(colNames, 0);
	
        String[] Data_Printed = {"", "", "","", "", ""};
        for(int i = 0; i < ct.t.size();i ++){
        	Data_Printed[0] = (ct.t.get(i).getPersonNO());
			Data_Printed[1] = (ct.t.get(i).getName());
			Data_Printed[2] = (ct.t.get(i).getAge());
			Data_Printed[3] = (ct.t.get(i).getSubject_Name());
			Data_Printed[4] = (ct.t.get(i).getGroup());
			Data_Printed[5] = (ct.t.get(i).getNo());
			model.addRow(Data_Printed);
        }
        
        JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		add(sp);
		
	}
}
