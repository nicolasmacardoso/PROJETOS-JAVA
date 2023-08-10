package Exercicios;

import java.awt.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class teste {
    private JLabel timeLabel;
    private JLabel countdownLabel;
    private SimpleDateFormat timeFormat;
    private SimpleDateFormat dateFormat;
    private Timer timer;

    public teste() {
        JFrame frame = new JFrame("Smart Watch");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.getContentPane().setBackground(Color.BLACK);

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 72));
        timeLabel.setForeground(Color.WHITE);
        timeLabel.setHorizontalAlignment(JLabel.CENTER);

        countdownLabel = new JLabel();
        countdownLabel.setFont(new Font("Arial", Font.PLAIN, 50));
        countdownLabel.setForeground(Color.WHITE);
        countdownLabel.setHorizontalAlignment(JLabel.CENTER);
r
        frame.setLayout(new GridLayout(3, 1));
        frame.add(timeLabel);
        frame.add(countdownLabel);
        frame.setVisible(true);

        timeFormat = new SimpleDateFormat("HH:mm:ss");
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        timer = new Timer();

        // Cria um TimerTask para atualizar o tempo a cada segundo
        TimerTask updateTimeTask = new TimerTask() {
            public void run() {
                updateTime();
                updateCountdown();
            }
        };
        timer.scheduleAtFixedRate(updateTimeTask, 0, 1000);
    }

    private void updateTime() {
        Date now = new Date();
        timeLabel.setText(timeFormat.format(now));
    }

    private void updateCountdown() {
        Date now = new Date();
        Date targetTime = new Date();
        targetTime.setHours(17);
        targetTime.setMinutes(30);
        targetTime.setSeconds(0);

        long timeDifferenceMillis = targetTime.getTime() - now.getTime();

        if (timeDifferenceMillis <= 0) {
            countdownLabel.setText("Já passou das 17:30.");
            timer.cancel();
            return;
        }

        long hours = timeDifferenceMillis / (60 * 60 * 1000);
        long minutes = (timeDifferenceMillis % (60 * 60 * 1000)) / (60 * 1000);
        long seconds = (timeDifferenceMillis % (60 * 1000)) / 1000;

        countdownLabel.setText("Faltam " + hours + "h " + minutes + "m " + seconds + "s para acabar a aula.");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new teste();
            }
        });
    }
}
