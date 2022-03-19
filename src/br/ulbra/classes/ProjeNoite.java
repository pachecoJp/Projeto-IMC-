package br.ulbra.classes;

import javax.swing.JOptionPane;

public class ProjeNoite {

    public static void main(String[] args) {
        String nome, classifica;
        int anoNascimento, anoAtual, idade;
        double altura, peso, imc;

        nome = JOptionPane.showInputDialog("INFORME SEU NOME:");
        anoAtual = 2022;
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("INFORME O ANO DE NASCIMENTO:"));
        peso = Double.parseDouble(JOptionPane.showInputDialog("INFORME SEU PESO:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("INFORME SUA ALTURA:"));
        idade = anoAtual - anoNascimento;
        imc = (peso / Math.pow(altura, 2));
        JOptionPane.showMessageDialog(null,
                "NOME:" + nome
                + "\n IDADE:" + idade
                + "\n IMC:" + imc);
        classifica = resultadoIMC((float) imc);
    }

    static String resultadoIMC(float imc) {
        String classifica = null;
        
        if (imc <= 19) {
            classifica = "ABAIXO DO PESO";
        } else if (imc <= 25) {
            classifica = "PESO IDEAL";
        } else if (imc <= 30) {
            classifica = "ACIMA DO PESO";
        } else if (imc <= 35) {
            classifica = "OBESIDADE GRAU 1";
        } else if (imc <= 40) {
            classifica = "OBESIDADE GRAU 2";
        } else if (imc >= 40) {
            classifica = "OBESIDADE GRAU 3";
        
        } 
            JOptionPane.showMessageDialog(null, "IMC = " + imc + " - " + classifica + "");
        
        return null;

    }

}
