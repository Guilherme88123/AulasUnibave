import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class CrudSwing extends JFrame
{
    private JTextField txtId, txtNome, txtEmail;
    private JTable tabela;
    private DefaultTableModel modelo;
    private ArrayList<Usuario> lista = new ArrayList<>();

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

        painel.add(btnAdicionar);
        painel.add(btnAtualizar);

        add(painel, BorderLayout.NORTH);

        // Tabela
        modelo = new DefaultTableModel(new Object[]{"ID", "Nome", "Email"}, 0);
        tabela = new JTable(modelo);
        add(new JScrollPane(tabela), BorderLayout.CENTER);

        JPanel painelSul = new JPanel();
        painelSul.add(btnExcluir);
        add(painelSul, BorderLayout.SOUTH);

        // Ações

        btnAdicionar.addActionListener(e -> adicionar());
        btnAtualizar.addActionListener(e -> atualizar());
        btnExcluir.addActionListener(e -> excluir());

        tabela.getSelectionModel().addListSelectionListener(e -> preencherCampos());

        setVisible(true);
    }

    private void adicionar()
    {
        Usuario u = new Usuario(
                txtId.getText(),
                txtNome.getText(),
                txtEmail.getText()
        );

        lista.add(u);
        modelo.addRow(new Object[]{u.getId(), u.getNome(), u.getEmail()});
        limparCampos();
    }

    private void atualizar()
    {
        int linha = tabela.getSelectedRow();
        if (linha >= 0) {
            Usuario u = lista.get(linha);
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
}

// Classe modelo
class Usuario
{
    private String id;
    private String nome;
    private String email;

    public Usuario(String id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }

    public void setId(String id) { this.id = id; }
    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
}