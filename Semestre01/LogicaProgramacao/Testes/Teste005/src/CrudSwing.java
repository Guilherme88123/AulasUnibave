import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class CrudSwing extends JFrame
{
    private JTextField txtId, txtNome, txtEmail;
    private JTable tabela;
    private DefaultTableModel modelo;
    private ArrayList<User> lista = new ArrayList<>();

    private String[] usersTeste = new String[] {"Guilherme", "João", "Ian", "Rafael", "Arthur", "Viniciús", "Luiz", "Flávio", "Heitor"};
    private int actualId = 1;

    private DatabaseManager dbManager = new DatabaseManager();

    public CrudSwing()
    {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        setTitle("CRUD Usuários");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel de formulário
        JPanel painel = new JPanel(new GridLayout(4, 2));

        painel.add(new JLabel("ID:"));
        txtId = new JTextField();
        painel.add(txtId);

        painel.add(new JLabel("Nome:"));
        txtNome = new JTextField();
        painel.add(txtNome);

        painel.add(new JLabel("Email:"));
        txtEmail = new JTextField();
        painel.add(txtEmail);

        JButton btnAdicionar = new JButton("Adicionar");
        JButton btnAtualizar = new JButton("Atualizar");
        JButton btnExcluir = new JButton("Excluir");
        JButton btnGerar = new JButton("Gerar Usuário Teste");

        painel.add(btnAdicionar);
        painel.add(btnAtualizar);

        add(painel, BorderLayout.NORTH);

        // Tabela
        modelo = new DefaultTableModel(new Object[]{"ID", "Nome", "Email"}, 0);
        tabela = new JTable(modelo);
        add(new JScrollPane(tabela), BorderLayout.CENTER);

        JPanel painelSul = new JPanel();
        painelSul.add(btnExcluir);
        painelSul.add(btnGerar);
        add(painelSul, BorderLayout.SOUTH);

        // Ações

        btnAdicionar.addActionListener(e -> adicionar());
        btnAtualizar.addActionListener(e -> atualizar());
        btnExcluir.addActionListener(e -> excluir());
        btnGerar.addActionListener(e -> gerarUsuarioTeste());

        tabela.getSelectionModel().addListSelectionListener(e -> preencherCampos());

        setVisible(true);

        var _usersList = dbManager.ReadUsers();

        for (int i = 0; i < _usersList.stream().count(); i++)
        {
            User user = _usersList.get(i);
            lista.add(user);
            modelo.addRow(new Object[]{user.getId(), user.getNome(), user.getEmail()});
        }
    }

    private void adicionar()
    {
        User user = new User(
                txtId.getText(),
                txtNome.getText(),
                txtEmail.getText()
        );

        adicionar(user);
        limparCampos();
    }

    private void adicionar(User user)
    {
        dbManager.CreateUser(user);
        lista.add(user);
        modelo.addRow(new Object[]{user.getId(), user.getNome(), user.getEmail()});
    }

    private void atualizar()
    {
        int linha = tabela.getSelectedRow();
        if (linha >= 0) {
            User u = lista.get(linha);
            u.setId(txtId.getText());
            u.setNome(txtNome.getText());
            u.setEmail(txtEmail.getText());

            modelo.setValueAt(u.getId(), linha, 0);
            modelo.setValueAt(u.getNome(), linha, 1);
            modelo.setValueAt(u.getEmail(), linha, 2);

            limparCampos();
        }
    }

    private void excluir()
    {
        int linha = tabela.getSelectedRow();
        if (linha >= 0) {
            lista.remove(linha);
            modelo.removeRow(linha);
            limparCampos();
        }
    }

    private void gerarUsuarioTeste()
    {
        var name = getRandomTestUser();
        var id = getActualId();

        User u = new User(
                id + "",
                name,
                name + "_" + id + "@gmail.com"
        );

        adicionar(u);
    }

    private void preencherCampos()
    {
        int linha = tabela.getSelectedRow();
        if (linha >= 0) {
            txtId.setText(modelo.getValueAt(linha, 0).toString());
            txtNome.setText(modelo.getValueAt(linha, 1).toString());
            txtEmail.setText(modelo.getValueAt(linha, 2).toString());
        }
    }

    private void limparCampos()
    {
        txtId.setText("");
        txtNome.setText("");
        txtEmail.setText("");
    }

    private String getRandomTestUser()
    {
        int rng = (int) (Math.random() * (usersTeste.length - 1));
        return usersTeste[rng];
    }

    private int getActualId()
    {
        var id = actualId;
        actualId++;
        return id;
    }
}