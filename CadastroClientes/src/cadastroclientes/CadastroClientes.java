
package cadastroclientes;

/**
 *
 * @author Felipe Lambiazzi
 */
public class CadastroClientes {

    public static void main(String[] args) {
        UICadastro formulario = new UICadastro();
        Pessoa cliente = new Pessoa (formulario.nome,formulario.cpf , formulario.endereco, formulario.cidade,formulario.estado);
    
    }
    
}
