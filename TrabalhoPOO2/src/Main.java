import javax.swing.*;

public class Main {

    public static void main(String[] args) {

//Criando a janela

        JFrame frame = new JFrame("Cadastro de Tarefas");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400, 300);

//Criando o painel

        JPanel panel = new JPanel();

//Adicionando o painel na janela

        frame.add(panel);

//Configurando o painel

        panel.setLayout(null);

//Criando os componentes

        JLabel labelDescricao = new JLabel("Descrição da tarefa:");

        JTextField textFieldDescricao = new JTextField();

        JLabel labelPrioridade = new JLabel("Prioridade:");

        JComboBox comboBox = new JComboBox();
        comboBox.addItem("Alta");
        comboBox.addItem("Média");
        comboBox.addItem("Baixa");

        JLabel labelFinalizado = new JLabel("Finalizado:");

        JCheckBox checkBoxFinalizado = new JCheckBox();



        JButton botaoSalvar = new JButton("Salvar");

        JButton botaoCancelar = new JButton("Cancelar");

//Configurando os componentes

        labelDescricao.setBounds(10, 20, 150, 25);

        textFieldDescricao.setBounds(160, 20, 200, 25);

        labelPrioridade.setBounds(10, 50, 150, 25);

        comboBox.setBounds(160, 50, 200, 25);

        labelFinalizado.setBounds(10, 80, 150, 25);

        checkBoxFinalizado.setBounds(160, 80, 200, 25);

        botaoSalvar.setBounds(10, 110, 100, 25);

        botaoCancelar.setBounds(290, 110, 100, 25);

//Adicionando os componentes no painel

        panel.add(labelDescricao);

        panel.add(textFieldDescricao);

        panel.add(labelPrioridade);

        panel.add(comboBox);

        panel.add(labelFinalizado);

        panel.add(checkBoxFinalizado);

        panel.add(botaoSalvar);

        panel.add(botaoCancelar);

//Mostrando a janela

        frame.setVisible(true);

    }

}