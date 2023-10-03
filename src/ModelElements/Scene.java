package ModelElements;

import java.lang.reflect.Type;
import java.util.List;

public class Scene {
    int ID;
    List<PoligonalModel> Models;
    List<Flash> Flashes;
    List<Camera> Cameras;

    public Scene(int ID, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) {
        this.ID = ID;
        Models = models;
        Flashes = flashes;
        Cameras = cameras;
    }
    public Type method1(Type type1) {
        return type1;
    }

    public Type method2(Type type1, Type type2) {
        return type1;
    }
}
