import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class TelaListaTarefas extends JFrame {
    private JTextField textField;
    private JList list;
    private List listaTarefas;

    public TelaListaTarefas() {
        setTitle("Lista de Tarefas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.NORTH);

        JLabel lblAdicioneUmaNova = new JLabel("Adicione uma nova tarefa:");
        panel.add(lblAdicioneUmaNova);

        textField = new JTextField();
        panel.add(textField);
        textField.setColumns(10);

        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                String tarefa = textField.getText();
                listaTarefas.add(tarefa);
                list.setListData(listaTarefas.toArray());
            }
        });
        panel.add(btnAdicionar);

        JScrollPane scrollPane = new JScrollPane();
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        listaTarefas = new ArrayList();

        list = new JList();
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(list);
    }

    public static void main(String[] args) {
        new TelaListaTarefas().setVisible(true);
    }
}