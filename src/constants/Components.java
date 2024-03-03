package constants;

import components.FrameCustom;
import components.TextTime;

import javax.swing.*;
import java.awt.*;

import static constants.Parameters.percents;

//Компоненты окна
public class Components {
    public static JFrame jFrame = FrameCustom.getFrame();
    public static JPanel panelImages = new JPanel();
    public static JPanel panelButtons = new JPanel();
    public static JButton startButton = new JButton("Старт");
    public static JButton stopButton = new JButton("Стоп");
    public static JMenuItem startButtonMenu = new JMenuItem("Старт");
    public static JMenuItem stopButtonMenu = new JMenuItem("Стоп");
    public static JCheckBox showInfo = new JCheckBox("Показывать информацию");
    public static JCheckBox showInfoMenu = new JCheckBox("Показывать информацию");
    public static JComboBox<Integer> comboBoxCats = new JComboBox<>(percents);
    public static JComboBox<Integer> comboBoxDogs = new JComboBox<>(percents);
    public static JLabel labelComboCats = new JLabel("Вероятность рождения кота(%)");
    public static JLabel labelComboDogs = new JLabel("Вероятность рождения собаки(%)");
    public static TextField timerCats = new TextField();
    public static TextField timerDogs = new TextField();
    public static JLabel labelTimerCats = new JLabel("Период рождения котов(сек.)");
    public static JLabel labelTimerDogs = new JLabel("Период рождения собак(сек.)");
    public static JRadioButton showTime = new JRadioButton("Показать время работы");
    public static JRadioButton hiddenTime = new JRadioButton("Скрыть время работы");
    public static JButton updateParameters = new JButton("Обновить");
    public static JRadioButtonMenuItem showTimeMenu = new JRadioButtonMenuItem("Показать время работы");
    public static JRadioButtonMenuItem hiddenTimeMenu = new JRadioButtonMenuItem("Скрыть время работы");
    public static TextTime textTime = new TextTime();
    public static JMenuBar jMenuBar = new JMenuBar();
    public static JMenu jMenu = new JMenu("Меню");
    public static TextField timeLifeCats = new TextField();
    public static TextField timeLifeDogs = new TextField();
    public static JLabel labelTimeLifeCats = new JLabel("Время жизни котов(сек.)");
    public static JLabel labelTimeLifeDogs = new JLabel("Время жизни собак(сек.)");
    public static JMenuItem showLiveObjects = new JMenuItem("Показать все живые объекты");
}
