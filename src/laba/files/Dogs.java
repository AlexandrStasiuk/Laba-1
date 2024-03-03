package laba.files;

import java.awt.geom.Point2D;

import static constants.Components.panelImages;

public class Dogs extends Pets{
    public static int timeLife;

    public Dogs(int timeBirth, int timeLife) {
        super(timeBirth, "img/dog.png", "dog");
        Dogs.timeLife = timeLife;
    }

    //Переопределенный метод добавления картинки
    @Override
    public void setImage() {
        Point2D p = generatePoints();
        //Добавление компонента
        getImageComponent().setBounds(
                (int)p.getX(),
                (int)p.getY(),
                getImageComponent().getWidthImage(),
                getImageComponent().getHeightImage()
        );
        panelImages.add(getImageComponent());
        //Перерисовка картинок
        panelImages.repaint();
        Pets.countDogs += 1;
    }
}
