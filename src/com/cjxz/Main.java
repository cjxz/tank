package com.cjxz;

import com.cjxz.tank.TankFrame;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        TankFrame f = new TankFrame();
        while (true){
            Thread.sleep(500);
            f.repaint();
        }
    }
}
