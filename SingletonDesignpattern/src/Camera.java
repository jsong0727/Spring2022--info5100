public class Camera {
    /*
     * 1.Create a class
     * 2.Default constructor as private
     * 3.Create Private static instance of the class with
     * 4.
     */
    private Camera() {
    }

    private static Object obj;
    public String cameraName = "";

    public String getCameraName() {
        return cameraName;
    }

    public void setCameraName(String cameraName) {
        this.cameraName = cameraName;
    }

    private static Camera _instance;

    public static Camera getInstance() {
        if (_instance == null) {
            _instance = new Camera();
        }
        return _instance;
    }

}
