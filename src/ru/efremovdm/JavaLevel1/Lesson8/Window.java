package ru.efremovdm.JavaLevel1.Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Урок 8. Написание приложения с графическим интерфейсом
 *
 * Доработать проект, который разрабатывали на уроке. Приветствуется творческий подход.
 *
 * Простое оконное приложение с базовыми функциями
 */
public class Window
{
    //Запускаем
    public static void main(String[] args) {
        run();
    }

    public static void run()
    {
        //Создадим окно и установим заголовок
        final JFrame window = new JFrame("Window");

        ImageIcon img = new ImageIcon("resources/java.png");
        window.setIconImage(img.getImage());

        //Событие "закрыть" при нажатии по крестику окна
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Текстовое поле
        JTextField textField = new JTextField();
        textField.setBackground(Color.WHITE);
        textField.setColumns(14);

        //Создадим панель
        JPanel panel = new JPanel();

        //Создадим кнопки
        JButton minButton = new JButton("Свернуть");
        JButton maxButton = new JButton("Растянуть");
        JButton normalButton = new JButton("Вернуть");
        JButton exitButton = new JButton("Выход");
        JButton helloButton = new JButton("Hello");

        //Событие для кнопки "Hello"
        helloButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                textField.setText("Hello World!");
            }
        });

        //Событие для кнопки "Растянуть"
        maxButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                window.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });


        //Событие для кнопки "Вернуть"
        normalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                window.setExtendedState(JFrame.NORMAL);
            }
        });

        //Событие для кнопки "Свернуть"
        minButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                window.setState(JFrame.ICONIFIED);
            }
        });

        //Событие для кнопки "Выход"
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                window.setVisible(false);
                System.exit(0);
            }
        });


        //Добавим кнопки и поля на панель
        panel.add(textField);
        panel.add(helloButton);
        panel.add(minButton);
        panel.add(maxButton);
        panel.add(normalButton);
        panel.add(exitButton);

        //Добавим панель в окно
        window.getContentPane().add(panel);

        window.pack();

        //Разместим программу по центру
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}