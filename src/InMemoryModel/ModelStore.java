package InMemoryModel;

import java.util.List;
import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;
public class ModelStore implements IModelChanger{
    List<PoligonalModel> Models;
    List<Flash> Flashes;
    List<Camera> Cameras;
    List<Scene> Scenes;
    List<IModelChangedObserver> changedObservers;

    public ModelStore(List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras, List<Scene> scenes, List<IModelChangedObserver> changedObservers) {
        Models = models;
        Flashes = flashes;
        Cameras = cameras;
        Scenes = scenes;
        this.changedObservers = changedObservers;
    }

    public Scene GetScene(int sceneId) {
        return this.Scenes.get(sceneId);
    }
    @Override
    public void NotifyChange(IModelChanger sender) {

    }
}
