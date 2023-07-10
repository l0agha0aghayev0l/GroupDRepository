package Lesson5.Practice.Quiz.Model;

import javax.swing.*;

public class Quiz {

    String[][] questions = {{"Кто придумал динамит?", "Нобель"},
            {"Как называется осадки в виде воды, падающие с неба?", "Дождь"},
            {"Сколько дней в неделе?", "7"}};


    public void start(){
        int score = 0;
        int life = 1;
        for (int i = 0; i < questions.length; i++) {
            if (life != 0) {
                if (JOptionPane.showInputDialog(questions[i][0]).equals(questions[i][1])) {
                    JOptionPane.showMessageDialog(null, "Вы ответили правильно! +10 баллов");
                    score++;
                } else {
                    JOptionPane.showMessageDialog(null, "Вы ответили неправильно! -1 жизнь");
                    life--;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Вы проиграли! :(");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "Вы набрали " + score + " баллов");
    }
}
