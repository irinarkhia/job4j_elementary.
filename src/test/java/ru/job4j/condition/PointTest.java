package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
     void when12to34then2dot8284() {
        Point point = new Point(1, 2);
        Point point1 = new Point(3, 4);
        double asd = point.distance(point1);
        double expected = 2.8284;
        assertThat(asd).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when33to66then4dot2426() {
        Point point = new Point(3, 3);
        Point point1 = new Point(6, 6);
        double asd = point.distance(point1);
        double expected = 4.2426;
        assertThat(asd).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when30to60then3() {
        Point point = new Point(3, 0);
        Point point1 = new Point(6, 0);
        double asd = point.distance(point1);
        double expected = 3;
        assertThat(asd).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when02to62then6d() {
        Point point = new Point(0, 2);
        Point point1 = new Point(6, 2);
        double asd = point.distance(point1);
        double expected = 6;
        assertThat(asd).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when123to124then1dot0() {
        Point point = new Point(1, 2, 3);
        Point point1 = new Point(1, 2, 4);
        double asd = point.distance3d(point1);
        double expected = 1.0;
        assertThat(asd).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when1023to1240then38dot0788() {
        Point point = new Point(10, 2, 3);
        Point point1 = new Point(1, 2, 40);
        double asd = point.distance3d(point1);
        double expected = 38.0788;
        assertThat(asd).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenminis122132to11234then36dot2904() {
        Point point = new Point(-12, 21, 32);
        Point point1 = new Point(11, 23, 4);
        double asd = point.distance3d(point1);
        double expected = 36.2904;
        assertThat(asd).isEqualTo(expected, withPrecision(0.01));
    }
}