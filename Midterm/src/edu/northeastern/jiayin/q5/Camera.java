package edu.northeastern.jiayin.q5;

public class Camera {
    private String cameraName = "";

    private Camera() {
    }

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    private static Camera _instance;
    private static Object obj = new Object();

    public static Camera getInstance() {
        if (_instance == null) {
            synchronized (obj) {
                if (_instance == null) {
                    _instance = new Camera();
                }
            }
        }
        return _instance;
    }

}
