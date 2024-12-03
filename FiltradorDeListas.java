package FiltradorDeLista2000;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltradorDeListas {
    public static void main(String[] args) {
        // Criando a janela principal
        JFrame frame = new JFrame("Filtrador de Listas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500); // Aumentei a altura para acomodar os componentes

        // Criando o layout vertical para os componentes
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Texto explicativo para a primeira string
        JLabel label1 = new JLabel("Insira a primeira string:");
        frame.add(label1);

        // Campo de texto para a primeira lista
        JTextArea area1 = new JTextArea(10, 40);
        area1.setWrapStyleWord(true);
        area1.setLineWrap(true);
        frame.add(new JScrollPane(area1));

        // Texto explicativo para a segunda string
        JLabel label2 = new JLabel("Insira a segunda string:");
        frame.add(label2);

        // Campo de texto para a segunda lista
        JTextArea area2 = new JTextArea(10, 40);
        area2.setWrapStyleWord(true);
        area2.setLineWrap(true);
        frame.add(new JScrollPane(area2));

        // Botão para filtrar
        JButton filtrarButton = new JButton("Filtrar");
        frame.add(filtrarButton);

        // Texto explicativo para o resultado
        JLabel resultadoLabel = new JLabel("Resultado:");
        frame.add(resultadoLabel);

        // Campo de texto para exibir o resultado
        JTextArea resultadoArea = new JTextArea(10, 40);
        resultadoArea.setWrapStyleWord(true);
        resultadoArea.setLineWrap(true);
        resultadoArea.setEditable(false);
        frame.add(new JScrollPane(resultadoArea));

        // Ação do botão de filtrar
        filtrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pegando as listas digitadas nos campos de texto
                String string1 = area1.getText();
                String string2 = area2.getText();

                // Convertendo as strings em listas
                List<String> lista1 = Arrays.asList(string1.split("\\s+"));
                List<String> lista2 = Arrays.asList(string2.split("\\s+"));

                // Chamando a função de filtragem
                List<String> resultado = elementosDiferentes(lista1, lista2);

                // Exibindo o resultado na área de texto
                resultadoArea.setText(String.join("\n", resultado));
            }
        });

        // Exibindo a janela
        frame.setVisible(true);
    }

    // Função para obter os elementos diferentes
    public static List<String> elementosDiferentes(List<String> lista1, List<String> lista2) {
        return lista2.stream()
                     .filter(e -> !lista1.contains(e))
                     .collect(Collectors.toList());
    }
}
