package Controller;

import javax.swing.*;
import java.util.ArrayList;

public class List {

    private ArrayList<String> Lista;

    public void ListaVazia() {
        Lista = new ArrayList<>();
    }

    public void ListaInserir(String nome){
        Lista.add(nome);
    }

    public void ListaImprimir(){
        JOptionPane.showMessageDialog(null, Lista);
    }

    public int ListaRetorno(){
        if(Lista.size() == 0){
            return 1;
        }
        else{
            return 0;
        }

    }

    public void ListaBusca(String nome){
        for(int i = 0; i < Lista.size(); i++){
            if(!Lista.get(i).equals(nome)){
                JOptionPane.showMessageDialog(null,"Não tá na lista");
            }
            else {
                JOptionPane.showMessageDialog(null, nome);
            }

        }

    }

    public void ListaRemover(String nome){
        for(int n = 0; n < Lista.size(); n++){
            if (!Lista.get(n).equals(nome)){
                JOptionPane.showMessageDialog(null, "Nome não encontrado.");
            }
            else{
                JOptionPane.showMessageDialog(null,"Nome Removido.");
                Lista.remove(nome);
            }
        }


    }

    public void ListaDrop(){
        String resposta = JOptionPane.showInputDialog("Deseja excluir toda lista? s/n ");

        if(resposta.equals("s")){
            Lista.clear();
        }
        else{
            JOptionPane.showMessageDialog(null,"Acao cancelada pelo usuario");
        }

    }

}