package de.fhac.ti.yagi.vm.memory;

import de.fhac.ti.yagi.vm.exceptions.InvalidModelException;
import de.fhac.ti.yagi.vm.exceptions.ModelNotFoundException;
import de.fhac.ti.yagi.vm.interfaces.AbstractModel;
import de.fhac.ti.yagi.vm.interfaces.State;
import de.fhac.ti.yagi.vm.memory.models.action.Action;

import java.util.HashMap;
import java.util.Map;

public class ActionState implements State {

    private static final String INVALID_MODEL = "Model instance is not of type <action>.";
    private static final String MODEL_NOT_FOUND = "Model could not be found. It wasn't added yet.";

    private Map<String, Action> mActions;

    public ActionState() {
        this.mActions = new HashMap<String, Action>();
    }

    @Override
    public void add(AbstractModel model) throws InvalidModelException {
        if (! (model instanceof  Action)) {
            throw new InvalidModelException(INVALID_MODEL);
        }

        Action action = (Action)model;
        mActions.put(action.getName(), action);
    }

    @Override
    public void remove(AbstractModel model) throws InvalidModelException {
        if (! (model instanceof  Action)) {
            throw new InvalidModelException(INVALID_MODEL);
        }

        Action action = (Action)model;
        mActions.remove(action.getName());
    }

    @Override
    public AbstractModel get(String identifier) {
        if (! mActions.containsKey(identifier)) {
            return null;
        }

        return mActions.get(identifier);
    }

    @Override
    public boolean contains(String id) {
        return mActions.containsKey(id);
    }

    @Override
    public String listState() {
        /* not supported at the moment... */
        return "";
    }

    @Override
    public void clearState() {
        mActions.clear();
    }
}
