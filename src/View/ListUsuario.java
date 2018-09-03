package View;

import Controller.List;

import javax.swing.*;

public class ListUsuario{

    public static void main(String[] args) {

        List Lista = new List();

        Lista.ListaVazia();
        JOptionPane.showMessageDialog(null, "Lista Criada com sucesso.");

        int option;

        do{
            option = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opcao: \n1 Inserir nome: \n2 Imprimir Lista: \n3 Verificar Lista: \n4 Buscar na Lista: \n5 Remover da Lista \n6 Excluir Lista \n7 Encerrar Programa"));
            switch(option){
                case 1 :
                    String nome = JOptionPane.showInputDialog("Insira o nome:");
                    Lista.ListaInserir(nome);
                    break;

                case 2:
                    Lista.ListaImprimir();
                    break;

                case 3:
                    if(Lista.ListaRetorno() == 0){
                        JOptionPane.showMessageDialog(null, "A Lista não esta vazia.");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "A Lista esta vazia.");
                    }
                    break;
                case 4:
                    Lista.ListaBusca(JOptionPane.showInputDialog("Digite o nome para busca:"));
                    break;
                case 5:
                    Lista.ListaRemover(JOptionPane.showInputDialog("Digite nome para REMOVER:"));
                    break;
                case 6:
                    Lista.ListaDrop();
                    break;
            }
        } while(option != 7);

        JOptionPane.showMessageDialog(null,"Programa Encerrado");
    }
}
