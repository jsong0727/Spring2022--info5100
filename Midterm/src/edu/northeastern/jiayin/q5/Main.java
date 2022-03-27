package edu.northeastern.jiayin.q5;

public class Main {
    public static void main(String[] args) {
        Camera cam1 = Camera.getInstance();
        cam1.setCameraName("Cam 1");
        Camera cam2 = Camera.getInstance();
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());

        cam2.setCameraName("Cam 2");
        System.out.println(cam1.getCameraName());
        System.out.println(cam2.getCameraName());

    }
}
